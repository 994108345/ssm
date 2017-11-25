package designpatterns.duck.behavior;

import designpatterns.duck.api.FlyBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是用火箭推射器飞行的");
    }
}
