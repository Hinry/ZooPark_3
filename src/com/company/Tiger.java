package com.company;

import java.io.Serializable;

/**
 * Created by mrhri on 11.10.2016.
 */
public class Tiger extends Animals implements Serializable {
    String [] methods;

    Tiger (String n, String d, String v, String o,Integer a, Double w, String[] m) {
        super(n, d, v, o, a, w);
        methods = m;
    }

    public void Hunting() {
        System.out.println("Тигр опасный хищник, и сейчас он лакомится свежим мясом своей добычи");
    }

}
