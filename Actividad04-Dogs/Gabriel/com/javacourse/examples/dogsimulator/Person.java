/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacourse.examples.dogsimulator;

/**
 *
 * @author secuo
 */
public class Person {
    String name;
    boolean isUrinate;
    
    public void giveDescription (){
        String message;
        message = "Soy " + name + " y fui orinado por un perrito";
        System.out.println(message);
    }
}
