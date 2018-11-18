package com.atguigu.maven.test;



import org.junit.Test;

import com.atguigu.maven.java.Hello;

public class HelloTest {
    
    @Test
    public void helloTest() {
	Hello hello = new Hello();
	System.out.println("这是单元测试");
	hello.sayHello();
	
    }

}
