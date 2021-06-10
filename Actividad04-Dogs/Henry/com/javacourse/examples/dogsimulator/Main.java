/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacourse.examples.dogsimulator;

/**
 *
 * @author jomal
 */
public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Gregory";
        person2.name = "Juan";
        person1.giveDescription();
        person2.giveDescription();
    }
}
