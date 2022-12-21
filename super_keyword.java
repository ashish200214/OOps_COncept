
/*super keyword :- It is used to differentiate the super class attribute,method and constructor  from the sub class
 * when same name variable,method are used in in sub and parent class.
*/
class A {
        int a=10;   
}

 class B extends A {
        int a=20;
        void show() {
            System.out.println(a);
            System.out.println(super.a);
        }
 }

 class Test {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
 }



//super and sub class which having same methods
/*super keyword :- It is used to differentiate the super class attribute,method and constructor  from the sub class
 * when same name variable,method are used in in sub and parent class.
*/
class A {
       void show() {
        System.out.println("Hello super class");
       }
}

 class B extends A {
  
        void show() {
            super.show();
            System.out.println("Hello sub class");
        }
 }

 class Test {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
 }


//for constructor
/*super keyword :- It is used to differentiate the super class attribute,method and constructor  from the sub class
 * when same name variable,method are used in in sub and parent class.
*/

//For default constructor it is not compalsory to write super keyword.
//But for parameterised constructor it is compulsory to write super keyword otherwise it will give an error.
class A {
       A(int a) {
        System.out.println("I am in A class constructor"+a);
       }
}

 class B extends A {
B() 
{
    super(10);  //automatically usedb or reserved by compiler
    System.out.println("I am in B class constructor");

} 
}

 class Test {
    public static void main(String[] args) {
        B r=new B();
    
    }
 }
