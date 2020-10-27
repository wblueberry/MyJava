package T3.day01.test;

import T3.day01.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    //初始化方法，用于资源申请，所有测试方法再执行之前都会先执行该方法
    @Before
    public void init(){
        System.out.println("init...");
    }


    //释放资源的方法，在所有测试方法执行完之后都会自动执行该方法
    @After
    public void close(){
        System.out.println("close...");
    }


    //测试add方法
   @Test
    public void testAdd(){
        //System.out.println("我被执行啦");
       //1，创建计算器对象
       Calculator c = new Calculator();
       //2,调用add方法
       int s = c.add(5,6);
       //3，断言
       Assert.assertEquals(11,s);
   }
}
