package com.couse.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethon {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务器端测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务器端测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是服务器端测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是服务器端测试方法4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务器组运行前运行的方法");
    }

    @AfterGroups("server")
    public void aftereGroupsOnServer(){
        System.out.println("这是服务器组运行后运行的方法");
    }
}
