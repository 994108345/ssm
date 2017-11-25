package designpatterns.duck.behavior;

import designpatterns.duck.api.FlyBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
