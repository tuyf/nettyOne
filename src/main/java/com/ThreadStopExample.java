package com;

import java.util.concurrent.TimeUnit;

public class ThreadStopExample {

    private static boolean stop;

    public static void main(String[] args) throws InterruptedException{
        java.lang.Thread workThread = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(!stop){
                    i++;
                    try{
                        TimeUnit.SECONDS.sleep(1);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(" 输出： " + i);
                }
            }
        }) ;
        workThread.start();
        TimeUnit.SECONDS.sleep(3);
        stop = true;
        System.out.println("输出结束" );
    }

}
