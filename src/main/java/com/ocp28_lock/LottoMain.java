package com.ocp28_lock;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class LottoMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lotto("Vincent"));
        service.execute(new Lotto("Anita"));
        service.shutdown();
                
                
                
                
                
    }
    
}
