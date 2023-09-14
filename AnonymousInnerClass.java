/*
  What is anonymous inner class in java (this is introduced in java 8.0 version)...
  => Anonymous inner class allows us to implement the interface method without creating the class.

  Why anonymous inner class introduced ?
  => To solve the specific problem, that is when we want to implement the interface method we have to create the class which extends the interface and then we have to write the logic of that method
     and then by creating the object of that class , this is time taking process and the .class files are increasing . To solve this problem java introduced anonymous inner class.

     Let's take one example to understand the problem :-
     interface I{   //interface
       public void m1();
     }

     class A implements I {   //Implemented class which implement the method
       @Override
       public void m1(){ 
          System.out.println("I am in class A and called m1() method");
        }
     }

     class B{
       public static void main(String[]args){
         I objI = new A();
         objI.m1();
       }
     }

     In above example if i want to implement the m1() method we have created A class for implement the m1() method , so we created the class A() just for implement the m1() method 
     which is increases theh .class file , to overcome this issue annonymous class is used.

     Let's take example of anonymous class

     interface I{
       public void m1();
     }

     class B{
       public static void main(String[]args) {
         I objI = new I(){
           public void m1(){
             System.out.println("Hello I am anonymous inner class which is executed without extra class");
           }
         }     //anonymous inner class
        }
     }


     One more example to understand problem and solution

     //main type 
     interface I1{
       void m1();
     }

     //user type
     class Example{
       void m2(I1 i1){  //here we have to pass the sub-class of the interface class which have m1() method implemented for execute..
         i1.m1();       
       }
     }

     //implemented class
     class C implements I1{
        @Override
       public void m1(){
         System.out.println("I am in C class m1 method");
       }
     }

     class Main{
       public static void main(String[]args){
         Example e1 = new Example();
         //e1.m2(new I1());   //we cannot pass the new I1() int m2() method we have to pass sub-class object which has m1() method implemented.. 
                              //that means to implement the m1() method we need extra class so we are creating class C() for providing implementation to m1() method.
          e1.m2(new C());                    //and by passing the object of C() class we can call m1() method
        
                        
       }
     }

     //this is the problem that we requires one more implementation class to implement method to solve this problem anonymous inner class introduced.

     
     

   
*/
