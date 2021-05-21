package com.yunli.test;

import com.yunli.test.entity.Student;
import org.junit.Test;

/**
 * @author wangjingdong
 * @date 2021/5/16 08:57
 * @Copyright © 云粒智慧 2018
 */
public class JavaBase {
    /**
     * @author wangjingdong
     * @date 2021/5/16 08:58
     */
    @Test
    public void testFinal() {
//        final修饰变量时,变量值不能被修改,但是变量引用的对象属性可以被修改.
        final String str = "aaa";
//        str = "bbb";
        System.out.println(str);

        final Student student = new Student();
//        student = new Student();
        student.setName("lisa");
        System.out.println(student);
    }
}
