package com.company;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by HillelNew8 on 07.10.2016.
 */
public class Wolf extends Animals implements Serializable {
    String methods[];

    public Wolf(String n, String d, String v, String o,Integer a, Double w, String[] m){
        super(n, d, v, o,a ,w);
        methods = m;
    }

    public void Run() {
        System.out.println("Волк быстро бегает и сейчас он гонится за зайцем!");
    }

}
