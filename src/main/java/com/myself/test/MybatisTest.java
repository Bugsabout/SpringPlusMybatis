package com.myself.test;

import com.myself.mapper.CategoryMapper;
import com.myself.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

/**
 * @program: SpringPlusMybatis
 * @author: 吴小龙
 * @create: 2019-10-16 19:39
 * @description: mybatis的测试类
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testAdd(){
        Category category=new Category();
        category.setName("new Category");
        categoryMapper.add(category);
    }

    @Test
    public void testList(){
        System.out.println(categoryMapper);
        List<Category> cs=categoryMapper.list();
        for (Category category:cs){
            System.out.println(category.getName());
        }
    }

}
