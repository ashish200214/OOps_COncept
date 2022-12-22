
/*Encapsulation :- 
 * Encapsulation is a mechanism through which we can wrapping the data members and member methods of class in 
 * a single unit is called Encapsulation.
 * Note :-
 * 1.Declare class variable as a private.
 * 2.Declare the class methods as a public.
 * 
 * Example :- Class is the best example of encapsulation.
 *
*/

//Program
class A {
    private int pass;
    public void pass_check(int n) {
            pass=n;
    }
    public int pass_return() {
        return pass;
    }
}

class B {
    public static void main(String[] args) {
        A objA=new A();
        objA.pass_check(10);
        System.out.println(objA.pass_return());

    }
}
