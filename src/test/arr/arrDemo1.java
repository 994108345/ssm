package arr;

import org.junit.Test;

/**
 * Created by Administrator on 2017/8/29.
 */
public class arrDemo1 {
    @Test
    public void demo1(){
        int[] i={1,2,3,4,5,6};
        int[] j;
        j=i;
        for(int z=0;z<i.length;z++){
            i[z]=i[z]+1;
        }
        for(int n=0;n<j.length;n++){
            System.out.println(j[n]);
        }
    }
    public static void main(String[] args){
        String[] aa={"a1","a2","a3","a4"};
        A.main(aa);
    }
    @Test
    public void testDemo2(){
        String[] s1={"a1","a2","a3","a4"};
        A a=new A(s1);
    }
}
class A{
    public static void main(String[] args){
        for(String s:args){
            System.out.println(s);
        }
    }
    A(String[] sss){
        for(int i=0;i<sss.length;i++){
            System.out.println(sss[i]);
        }
    }
}
