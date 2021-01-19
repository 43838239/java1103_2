
package com.ocp18_thread;


public class Runner extends Thread{
//執行續的程式進入點
    @Override
    public void run() {//安排工作任務
        job(); //To change body of generated methods, choose Tools | Templates.
    }
    public void jod() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i < 3000; i++) {
            System.out.printf("%s 跑了 %D 公尺\n" , getName(), i);
            
            
        }
        
    }
    
}
