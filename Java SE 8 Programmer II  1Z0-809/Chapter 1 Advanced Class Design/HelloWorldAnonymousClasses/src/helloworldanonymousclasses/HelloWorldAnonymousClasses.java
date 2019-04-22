/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// package declaration
package helloworldanonymousclasses; 

/**
 *
 * @author gab12
 */

// public class declaration
public class HelloWorldAnonymousClasses {
  
    // interface declaration. It requires two methods to be implemented.
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    // Method declaration
    public void sayHello() {
        // Class declaration inside a method. Class implements the HelloWorld Interface
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            
            // The two methods that is commits to implement
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        
        // Still inside method sayHello(). An object of type EnglishGreeting() is created.
        HelloWorld englishGreeting = new EnglishGreeting();
        
        // An object of type Interface HelloWorld() is created.
        // The object is of a Class type that has no name.
        // THe object is created with the constructor keyword new, which opens a block with the Class declaration.
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            
            
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        // THis is another anonymous Class. I'm still in the method sayHello() of the parent class.
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        // The method sayHello() calls each method greet() for each object created after a Class, including the anonymous.
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }            
}