import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wenzailong on 2017/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class BaseTest {
    /*创建日志对象*/
    private org.slf4j.Logger logger = LoggerFactory.getLogger(BaseTest.class);
    @Test
    public void testDeng(){
        int a=11;
        int b=11;
        if(a==b){
            logger.info("-----------------------------------------true");
        }else{
            logger.info("-----------------------------------------false");
        }
        String c=new String("hello");
        String d=new String("hello");
        if(c==d){
            logger.info("-----------------------------------------true");
        }else{
            logger.info("-----------------------------------------false");
        }
        Integer e=new Integer(1);
        Integer f=new Integer(1);
        if(e==f){
            logger.info("-----------------------------------------true");
        }else{
            logger.info("-----------------------------------------false");
        }
        Integer i = 1;
        int ii = 1;
        if(i==ii){
            logger.info("-----------------------------------------true");
        }else{
            logger.info("-----------------------------------------false");
        }

    }
    @Test
    public void math(){
        double d=(double)15/68;
        int a=(int)Math.ceil(d);
        System.out.println(a);
        int b=(int)Math.ceil(11/10);
        System.out.println(b);
        int c=(int)Math.ceil(20/10);
        System.out.println(c);
    }
    @Test
    public void mapTest(){
        Map map=new HashMap();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        try{
            String testNum=(String)map.get("5");
            logger.info(testNum);
            String testNum1=(String)map.get("4");
            logger.info("-------------------success");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("-------------------error");
        }

    }
    @Test
    public void test1(){
        A a=new A();
        int b=a.getA();
        logger.info(b+"");

    }
    @Test
    public void listTest(){
        List list=new ArrayList();
        A a1=new A();
        a1.setA(1);
        list.add(a1);
        A a2=new A();
        a2.setA(2);
        list.add(a2);
        A a3=new A();
        a3.setA(3);
        list.add(a3);
        A a4=new A();
        a4.setA(4);
        list.add(a4);

        A a5=new A();
        a5.setA(5);

        list.set(2,a5);
        logger.info(list.get(2).toString());
    }
    @Test
    public void listTest2(){
        List list=new ArrayList();
        A a1=new A();
        a1.setA(1);
        A a2=new A();
        a2.setA(2);
        list.add(0,a1);
        list.add(1,a2);
        logger.info(list.toString());
    }
    @Test
    public void exceptionTest(){
        try{
            int a=12/0;
        }catch(Exception e){
            e.printStackTrace();
            logger.info("这里是e"+e);
            logger.info("去看看控制台");
        }
    }
    @Test
    public void testLogger(){
        String testData="logger插入了";
        try {
            logger.info(String.format("我试试，%s 是不是插入了",testData));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testNull(){
        Object o=new Object();
        o="";
        if(""!=o){
            logger.info("这个世界是怎么了");
        }
        if(""!=o.toString()){
            logger.info("这个世界就这样了");
        }
    }

}

class A{
    private int a;
    private int b;

    public A() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
