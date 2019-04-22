/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author gab12
 */

class Dog extends Animal implements Barker{}
class Cat extends Animal{}
class BabyCat extends Cat implements Jumper{}

interface Barker	{}
interface Jumper{}

public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat cuteCat = new Cat();
        cuteCat = new BabyCat();
        
        System.out.println("Is a dog instance of Animal? "+(dog instanceof Animal));
        System.out.println("Is a dog instance of Cat? "+(dog instanceof Cat));
        System.out.println("Is a dog instance of Barker? "+(dog instanceof Barker	));
        System.out.println("Is a cat instance of Barker? "+(cat instanceof Barker)); // For interfaces, Java determines this at Runtime
        System.out.println("Is babyCat instance of Jumper? "+(cuteCat instanceof Jumper)); // While Cat does not implement Jumper, BabyCat does
    }
}