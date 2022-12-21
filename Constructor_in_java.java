/*Constructor :-
 * Constructor is a special type of method whose name is same as class name.
 * 1. The main purpose of constructor is initilize the object.
 * 2.Every java has a constructor.
 * 3.A constructor is automatically called at the time of object creation.
 * 4.A constructor never cotain any return type include void.
 */
/*Syntax :-
 * 
 * class class-name 
 * {
 *          class-name()
 *        {
 * 
 *        }
 * }
 */

 //Program of constructor

class A {
    int a; String name;
    A() {
        a=10;
        name="ashish";
    }

    void show() {
        System.out.println("Name "+name+" ROll no = "+a );
    }

    class B {
        public static void main(String[] args) {
            A objA=new A();
            objA.show();
        }
    }
}
