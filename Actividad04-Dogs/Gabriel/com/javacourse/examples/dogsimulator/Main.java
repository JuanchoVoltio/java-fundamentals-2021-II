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
public class Main {
    public static void main (String[] args){
       Person person1 = new Person();//creamos el objeto de la clase tipo Person
       Person person2 = new Person();//creamos el objeto de la clase tipo Person
       person1.name = "Gabriel";//creamos la persona
       person2.name = "Gregorio";//creamos la persona
       person1.giveDescription();//accedo a la descripcion del metodo objeto
       person2.giveDescription();//accedo a la descripcion del metodo objeto
    }
}
