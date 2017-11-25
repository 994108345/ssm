package designpatterns.duck;

import designpatterns.duck.api.FlyBehavior;
import designpatterns.duck.api.QuackBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    void performFly(){
        flyBehavior.fly();
    }
    void performQuack(){
      quackBehavior.quack();
    }

    public abstract  void display();

    public void swim(){
        System.out.println("All ducks fliat ,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
