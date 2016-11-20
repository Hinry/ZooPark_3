package com.company;

import java.io.Serializable;

/**
 * Created by HillelNew8 on 07.10.2016.
 */
public class Bird extends Animals implements Serializable {

    String methods[];
    public Bird(String n, String d, String v, String o,Integer a, Double w, String[] m){
        super(n,d,v,o,a ,w);
        methods = m;
    }

    public void Fly() {
        System.out.println("Сейчас вы наблюдаете как попугай вылетел с клетки");
    }

}

