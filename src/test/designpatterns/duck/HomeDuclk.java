package designpatterns.duck;

import designpatterns.duck.behavior.FlyNoWay;
import designpatterns.duck.behavior.QuackGaGa;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class HomeDuclk extends Duck {
    HomeDuclk(){
        quackBehavior = new QuackGaGa();
        flyBehavior = new FlyNoWay();
    }

    public void isEat(){
        System.out.println("可以吃");
    }

    @Override
    public void display() {
        System.out.println("i am a HmeDuck");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
