package enumx;

public enum Call_statusEnum {
    //0失败；2未计算；3正在计算；4已计算；5手工重新计算 6:自动重新计算
    fail("0","失败"),
    not_calculate("2","未计算"),
    being_calculated("3","正在计算"),
    already_calculate("4","已计算"),
    manual_re_calculation("5","手工重新计算"),
    automatic_re_calculation("6","自动重新计算");

    private Call_statusEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    private String key;

    private String name;

    @Override
    public String toString(){
        return key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Q {
    int n;
    synchronized  int get(){
        System.out.println("Got:" +n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Put:" +n);
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