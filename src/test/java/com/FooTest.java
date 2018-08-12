package com;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class FooTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setA(int num)
     */
    @Test
    public void testSetA() throws Exception {
        Foo foo = new Foo();
        int a = foo.getA();
        assertEquals(a, 1);
    }

    /**
     * Method: getA()
     */
    @Test
    public void testGetA() throws Exception {
        // 这是常规 JUnit 的测试方法
        Foo foo = new Foo();
        foo.setA(3);
        int a = foo.getA();
        assertEquals(a, 3);

        // 这是 mockito 的测试方法
        Foo bar = mock(Foo.class);
        bar.setA(2);
        // 这一步验证是否被调用，并且参数是2，如果这里参数写3的话，就会报错
        verify(bar).setA(2);
    }
} 
