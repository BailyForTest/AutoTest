package com.couse.testng.suite;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testcase1(){
        System.out.println("Case1这是一个测试用例");
    }

    @Test
    public void testcase2(){
        System.out.println("Case2这是一个测试用例");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法后执行的");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("AfterClass是在类执行之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在类执行之前");
    }

    @BeforeSuite
    public void beforesuit() {
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void aftersuit(){
        System.out.println("AfterSuite测试套件");
    }

}
