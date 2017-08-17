package operator;

import org.junit.Test;

import java.util.Random;

import static sun.misc.Version.print;

/**
 * Created by wenzailong on 2017/8/15.
 */
public class OperatorTest {
    @Test
    /*指数*/
    public void indexTest(){
        long l1=200;
        float f1=1e-43f;
        float expFloat=1.39E-43f;
        System.out.println(expFloat);
    }
    @Test
    /*移位操作符*/
    public void shift(){
        int number = 10;
        //原始数二进制
        printInfo(number);
        number = number << 2;
        //左移一位
        printInfo(number);
        number = number >> 4;
        //右移一位
        printInfo(number);
    }
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }
    @Test
    public void StringTest(){

        int x=0,y=1,z=2;
        String s="x,y,z";
        System.out.println(s+x+y+z);//x.y.z012
        System.out.println(x+""+s);//0x,y,z
        s+="(summed)=";//x,y,z(summed)=
        System.out.println(s+(x+y+z));//x,y,z(summed)=3
        System.out.println(""+x);//0


    }
    @Test
    public void booleanTest(){
        boolean a=true;
        boolean b=true;
        int i=1;
        while(a=b){
            i++;
            System.out.println(i);
        }
    }
    @Test
    public void typeChangeTest(){
        double a=1.5D;
        float b=1.25F;
        a=(int)a;
        b=(int)b;
        System.out.println(a);
        System.out.println(b);
        boolean c=false;
        boolean d=true;
        System.out.println(c^d);
        System.out.println(c|d);
        System.out.println(c&d);
        char e='0';
        char f='l';
        System.out.println((char)(e*f));
        System.out.println((char)(e/f));
        System.out.println((char)(e%f));
        System.out.println((char)(e+f));
        System.out.println((char)(e-f));
        System.out.println(e++);
        System.out.println(e--);
        System.out.println((char)+e);
        System.out.println((char)-e);
        while(e>f){}
        char l1=(char)(e|f);
        char l2=(char)(e|f);
        char l3=(char)(e&f);
        char l4=(char)(e^f);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        int aaaa=1234567899;
        byte aaa=123;
        byte cccc='1';
        short bbbb=12345;

        short asc=(short)~bbbb;
        int v1=~aaaa;
        System.out.println(asc);
        System.out.println(v1);
    }
    @Test
    public void sumTest(){
        int a1=1;
        int b1=10;
       /* System.out.println(--a1);
        System.out.println(a1--);
        System.out.println(--b1);
        System.out.println(b1--);
        System.out.println(b1--);*/
        a1/=b1;
        System.out.println(a1);
        a1*=b1;
        System.out.println(a1);
        int c=12;
        int b=24;
        int a=c&=b;
        System.out.println(a);
        int a0=8;
        a0=~a0;
        System.out.println(a0);
        int a5=4;
        int b5=5;
        int c5=a5&b5;
    }
    @Test
    public void huoTest(){
        if(a() || b() || c()){
            System.out.println("进来了");
        }
    }
    public boolean a(){
        return false;
    }
    public boolean b(){
        return true;
    }
    public boolean c(){
        return false;
    }
    @Test
    public void zhishuTest(){
        int a=-10;
        int b=3;
        System.out.println(Integer.toBinaryString(a));
        a<<=5;
        b<<=2;
        System.out.println(Integer.toBinaryString(a));
    }
}
