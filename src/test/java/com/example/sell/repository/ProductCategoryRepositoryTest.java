package com.example.sell.repository;

import com.example.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCatgoryType(10);
        //?????这样写更新时间会不发生变化
        repository.save(productCategory);
    }

}