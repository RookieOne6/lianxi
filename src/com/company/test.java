package com.company;

//实现现成的第一种方式
public class test {
    public static void main(String[] args) {
//        myThead myThead = new myThead();
//        myThead.start();
        myRunnable r = new myRunnable();
        Thread thread = new Thread(r);
        thread.start();

        for (int i = 0; i < 1000;i++){
            System.out.println("主线程--》" + i);
        }
    }
}
//多线程并发,创建现成的第一种方式
//class myThead extends Thread{
//    @Override
//    public void run() {
//        for(int i = 0;i < 1000;i++){
//            System.out.println("分支线程--》" + i);
//        }
//    }
//}

//第二种方式,使用居多
class myRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i < 1000;i++){
            System.out.println("分支线程--》" + i);
        }
    }
}