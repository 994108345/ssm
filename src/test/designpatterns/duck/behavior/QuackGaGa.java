package designpatterns.duck.behavior;

import designpatterns.duck.api.QuackBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class QuackGaGa implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎的叫");
    }
}
