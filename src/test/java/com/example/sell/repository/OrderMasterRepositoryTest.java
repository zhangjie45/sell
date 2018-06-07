package com.example.sell.repository;

import com.example.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("张三三");
        orderMaster.setBuyerPhone("18751969113");
        orderMaster.setBuyerAddress("南信大");
        orderMaster.setBuyerOpenid("1109446910");
        orderMaster.setOrderAmount(new BigDecimal(11.5));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0,3);
        Page<OrderMaster> result =  repository.findByBuyerOpenid("1109446910",request);
        Assert.assertNotEquals(0,result.getTotalElements());
    }
}