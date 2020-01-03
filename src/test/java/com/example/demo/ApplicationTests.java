package com.example.demo;

import com.example.Application;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * Created by yxl on 2020-01-03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

    @Autowired
    private BlogProperties blogProperties;
    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "a");
        Assert.assertEquals(blogProperties.getTitle(), "b");

    }
}
