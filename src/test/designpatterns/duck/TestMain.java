package designpatterns.duck;

import designpatterns.duck.behavior.FlyRocketPowered;
import org.junit.Test;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class TestMain {
    @Test
    public void homeDuckTest(){
        Duck homeDuclk = new HomeDuclk();
        homeDuclk.performQuack();
        homeDuclk.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
