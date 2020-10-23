package com.lierlin.shop.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.common.utils.Query;

import com.lierlin.shop.product.dao.CategoryDao;
import com.lierlin.shop.product.entity.CategoryEntity;
import com.lierlin.shop.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
 static int aa=0;
    /*@Autowired
    CategoryDao categoryDao;*/
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
     /*   List<CategoryEntity> entityList = baseMapper.selectList(null);
        List<CategoryEntity> list =new ArrayList<>();
        for (CategoryEntity cate :entityList) {
            if (cate.getParentCid()==0){
                buildChildNodes(cate);
                list.add(cate);
            }
        }

        //List<CategoryEntity> parant = baseMapper.selectList()
        return list;
    }
    private void buildChildNodes(CategoryEntity categoryEntity){
        List<CategoryEntity> children = getChildNodes(categoryEntity);


    }*/
       //1、查出所有分类
        List<CategoryEntity> entityList = baseMapper.selectList(null);
        //2、组装成父子的树形结构
        //filter 方法用于通过设置的条件过滤出元素
        List<CategoryEntity> level1Menus = entityList.stream().filter((categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        })).map((menu)->{//map 方法用于映射每个元素到对应的结果
            menu.setChildren(getChildrens(menu,entityList));
            return menu;
            //sorted 方法用于对流进行排序
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        System.out.println("程序总共运行了"+aa);
        return level1Menus;
    }

    @Override
    public void removeMenus(List<Long> asList) {
        //检查当前菜单是否被其它的引用
        baseMapper.deleteBatchIds(asList);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        aa=aa+1;
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}