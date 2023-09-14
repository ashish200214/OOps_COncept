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


     One more example to understand annonymous class
     

   
*/
