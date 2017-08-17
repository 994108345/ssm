package polymorphism;

import org.junit.Test;

/**
 * Created by wenzailong on 2017/8/14.
 */
public class Shape {
    void doSomething(Shape shape){
        shape.erase();
        shape.draw();
    }
    void erase(){
        System.out.println("执行了erase方法");
    }
    void draw(){
        System.out.println("执行了draw方法");
    }

    @Test
    public void shapeTest(){
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Line linee=new Line();
        doSomething(circle);
        doSomething(triangle);
        doSomething(linee);

    }
}
class Circle extends Shape{}
class Triangle extends Shape{}
class Line extends Shape{}

