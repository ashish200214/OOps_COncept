/* 
Abstract Class - A class which is created using the keyword abstract is called abstract class. 
                    Abstract class is partially implemented class , that's why it is not allowed to create the object of the Abstract class.

Abstract method - method which is created inside the abstract class with abstract keyword in method declaration is called abstract method.
                    when method does not contain body then we must use abstract method , abstract method must be created in abstract class only. Outside it is not allowed.

Rules :- 
1. If method does not have body it should be declared as abstract class using abstract keyword else it leads to CE.
2. If a class have abstract method, it should be declared as abstract class using abstract keyword else it leads to CE.
3. If class is declared as abstract it can not be instantiated (we cannot create the body of the class).
4. The sub class of an abstract class should override all abstract methods or it should be declared as abstract ffelse it leads to CE.
5. we cannot create static method with abstract because without object it can be called directly and at runtime jvm will unable to execute it.
6. we cannot use final, private keyword in abstract for method or .
7. protected or public modifiers is allowed only in abstract.
*/

//program

abstract class Animal {
    abstract void sound();
       public void all_animal() {
       System.out.println("Animal sounds");
       }
}

class Dog extends Animal {
        void sound() {
         System.out.println("Barking");
        }
}

class Lion extends Animal {
        void sound() {
        System.out.println("Lion Roar");
        }
}

class Break {
public static void main(String[]args) {
        Dog d=new Dog();
        Lion l=new Lion();
        d.all_animal();
        d.sound();
        l.sound();
}
}
