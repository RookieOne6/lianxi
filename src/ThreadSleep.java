public class ThreadSleep {
    public static void main(String[] args) {
        Runnable r1 = new Processor();
        Thread t1 = new Thread(r1, "t1");
        t1.start();
        Thread t2 = new Thread(r1, "t2");
        t2.start();
        System.out.println("gitTest");
        System.out.println("hello git2");
        System.out.println("master git2");
        System.out.println("hot-fix git2");
        System.out.println("hopush git2");
    } }
class Processor implements Runnable {
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
            if (i % 10 == 0) {
                try {
//睡眠 100 毫秒，主要是放弃 CPU 的使用，将 CPU 时间片交给其他线程使用
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
