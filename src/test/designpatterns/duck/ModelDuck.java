package designpatterns.duck;

import designpatterns.duck.behavior.FlyNoWay;
import designpatterns.duck.behavior.QuackGaGa;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackGaGa();
    }
    @Override
    public void display() {
        System.out.println(" 我是模型鸭");
    }
}
