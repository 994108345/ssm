package arr;

import org.junit.Test;

/**
 * Created by Administrator on 2017/9/3.
 */
public class ArrDemo {
    public static void print(Object[] object){
        for(Object arr:object){
            System.out.println(arr);
        }
    }
    @Test
    public void getPrint(){

        this.print(new Object[]{new Integer(1),new Integer(2),new Integer(6),new Integer(3)});
        this.print(new Object[]{"wo","qu","nidaye"});

    }
}
