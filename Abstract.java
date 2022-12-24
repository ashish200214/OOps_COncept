/*Abstract in java:- Abstract in java is just showing necessary information to user and hiding its implementation from the user such process is called Abstract*/
/*note :- 1. abstract class does not have obj.
          2. Never use abstract public while declaring abstract method inside the abstract class.  
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
