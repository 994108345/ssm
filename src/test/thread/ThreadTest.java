package thread;

import org.junit.Test;

/**
 * Created by wenzailong on 2017/11/13.
 */
public class ThreadTest {
    @Test
    public void mainThtread(){
        Thread t = Thread.currentThread();
        System.out.println("Current thread :" + t);
        t.setName("My Thread");
        try {
            for (int n = 5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread interrupted");
        }

    }
    @Test
    public void threadDemoTest(){
        new NewThread();
        try{
         for (int i= 5; i>0; i--){
             System.out.println("Main Thtrad :" +i);
         }
        } catch (Exception e){
            System.out.println("Main thread interruped.");
        }
        System.out.println("Main thred exiting.");
    }



}

class ThreadDemo{
    public static void main(String[] args){
        new NewThread();
        try{
            for (int i= 5; i>0; i++){
                System.out.println("Main Thtrad :" +i);
                /*Thread.sleep(0);*/
            }
        } catch (Exception e){
            System.out.println("Main thread interruped.");
        }
        System.out.println("Main thred exiting.");
    }
}

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread :" + t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i=5 ; i>0; i++){
                System.out.println("Chikd Thread:"+ i);
                /*Thread.sleep(0);*/
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exiting child thred");
        }
    }
}
class NewThreads extends Thread{
    Thread t;
    NewThreads(){
        super("Demo Thread");
        System.out.println("Child thread :" + t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i=5 ; i>0; i--){
                System.out.println("Chikd Thread:"+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exiting child thred");
        }
    }
}
/*线程的结束*/
class NewMoreThread implements Runnable{
    Thread t;
    String name;
    NewMoreThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread" + t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i=5 ; i>0; i--){
                System.out.println(name +":"+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(name +"interruped.");
        }
        System.out.println(name + "exiting.");
    }
}
class JoinDemo{
    public static void main(String[] args){
        NewMoreThread ob1 =new NewMoreThread("One");
        NewMoreThread ob2 =new NewMoreThread("Two");
        NewMoreThread ob3 =new NewMoreThread("Three");
        System.out.println("Thread One os alive" + ob1.t.isAlive());
        System.out.println("Thread Two os alive" + ob2.t.isAlive());
        System.out.println("Thread Three os alive" + ob3.t.isAlive());
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e){
            System.out.println("Main thread interruped.");
        }
        System.out.println("Thread One is alive:" + ob1.t.isAlive());
        System.out.println("Thread Two is alive:" + ob2.t.isAlive());
        System.out.println("Thread Three is alive:" + ob3.t.isAlive());
    }
}

/*线程的优先级*/
class Clicker implements Runnable{
    int click = 0;
    Thread t;
    private volatile boolean running = true;

    public Clicker(int p){
        t = new Thread(this);
        t.setPriority(p);
    }
    @Override
    public void run() {
        while (running){
            click++;
        }
    }
    public void stop(){
        running = false;
    }
    public void start(){
        t.start();
    }
}
class HiLoPri{
    public static void main (String[] args){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2 );
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        hi.start();
        lo.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread interrupted.");
        }
        lo.stop();
        hi.stop();
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("InterrupetedException caught");
        }
        System.out.println("High - priority thread:" +hi.click);
        System.out.println("Low - priority thread:" +lo.click);
    }
}

/*线程同步*/
class CallMe{
    synchronized void call(String msg){
        System.out.println("[" +msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Intrttupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{

    String msg;
    CallMe target;
    Thread t;
    public Caller(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        target.call(msg);

    }
}
class Synch {
    public static void main (String[] args){
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"world");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*线程间通信*/
class Q {
    int n;
    boolean valueSet = false;
    synchronized  int get(){
        if(!valueSet){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Got:" +n);
            return n;
        }
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        if (valueSet){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put:" +n);
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q ){
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i= 0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q ;
    Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true){
            q.get();
        }
    }
}
class PC{
    public static void main(String[] args ){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control -c to stop.");
    }
}

/*人为控制线程间通信*/
class CommunicationThread implements  Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    CommunicationThread(String name){
        this.name = name;
        t =new Thread(this.name);
        System.out.println("New thread:" + t);
        suspendFlag = false;
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i= 0 ; i>0 ; i--){
                System.out.println(name +":"+i);
                Thread.sleep(1000);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +"exiting.");
    }
    void mySuspend(){
        suspendFlag = true;
    }
    synchronized  void myResume(){
        suspendFlag = false;
        notify();
    }
}
class SuspendResume{
    public static void main(String[] args ){
        CommunicationThread ob1 =new CommunicationThread("One");
        CommunicationThread ob2 = new CommunicationThread("Two");
        try{
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resuming thread One");
            Thread.sleep(1000);
            ob2.mySuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}


/*自己写一个volatitle的例子*/
class VaolatitleThread implements Runnable {
    String threadName;
    Thread t;
     volatile int i = 0;
    VaolatitleThread(String name){
        this.threadName = name;
        t = new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {
        while(true) {
            i++;
            System.out.println(t.getName() + ":" + i);
        }
    }
}

class mainVaolatitle{
    public static void main(String[] args){
        VaolatitleThread vaolatitleThread=new VaolatitleThread("one");
        VaolatitleThread vaolatitleThread1=new VaolatitleThread("two");
        System.out.println(vaolatitleThread.t.getName());
        System.out.println(vaolatitleThread1.t.getName());
    }
}