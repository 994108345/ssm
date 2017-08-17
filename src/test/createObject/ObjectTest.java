package createObject;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static sun.misc.Version.print;


/**
 * Created by wenzailong on 2017/8/14.
 */
public class ObjectTest {
    @Test
  public  void test1(){
        String b=null;
        String a=new String();
        System.out.print(a);
        System.out.print(b);
    }
    @Test
    public void intTest(){
      /*可以处理任何长度的整数*/
        BigInteger bigInteger1=new BigInteger("123456789012345689123413241234109999321413253426256123333333333333333333333333");
      System.out.println(bigInteger1);
      /*可以处理任何精度的小数*/
        BigDecimal bigDecimal=new BigDecimal("1.23456789012345689123413241234109999321413253426256123333333333333333333333333");
        System.out.println(bigDecimal);
    }
    @Test
    public void equalTest(){
        Task t1=new Task();
        Task t2=new Task();
        t1.level=1;
        t2.level=2;
        System.out.println("1:t1.level:"+t1.level+",t2.level:"+t2.level);
        t1=t2;//对象的内存地址都指向同一个了
        System.out.println("2:t1.level:"+t1.level+",t2.level:"+t2.level);
        t1.level=27;
        System.out.println("3:t1.level:"+t1.level+",t2.level:"+t2.level);
    }
    @Test
    public void  arithmeticTest(){
        int a=2;
        int b=1;
        a=-b;
        System.out.println(a);
        System.out.println(b);

        int c=5;
        int d=11;
        c=--d;//c=d-1;
        System.out.println(c);
        System.out.println(d);
        c=d--;//c=d  d=d-1;
        System.out.println(c);
        System.out.println(d);
        c+=d;//c=c+d
        System.out.println(c);
        System.out.println(d);
        c-=d;//c=c-d
        System.out.println(c);
        System.out.println(d);
    }
    @Test
    public void  booleanTest(){
        if(booleanA()&&booleanB()&&booleanC()){//当执行与计算，一旦已经有false，将不判断接下来的项，直接执行判断后的代码！
            System.out.println("a");
        }else{
            System.out.println("b");
        }
    }
    public boolean booleanA(){
        return true;
    }
    public boolean booleanB(){
        return false;
    }
    public boolean booleanC(){
        return true;
    }


}
class Task{
    int level;
}
