package com.atguigu.maven;

import org.junit.Test;

/**
 * Created by ZhangQi on 2021/7/3
 */
public class MavenTest {

    @Test
   public void sayHello(){
       HelloMaven helloMaven = new HelloMaven();
       helloMaven.say("maven");
   }

}
