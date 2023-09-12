/* 
  Interface :- Interface is fully un-implemented class used for declaring the set of operation of an object for developing a loosely coupled runtime polymorphic object user class to use these opeation from different subclasses of this interface.
               It is purely abstract class allows us to define only "public static final variables" and "public abstract methods" for declaring a object operations.
               It is basically contract between service provider and service user , service provider proides service to the service user.
               It is introduced to achieve multiple inheritance in java.

               Rules :- 
               1. Interface cannot have concrete method it lead to CE.
               2. We can only have static final variable , even we declare it as normal variable it is by default set as static final variable and abstract method by default.
               3. We cannot declare interface members as private or protected. ex. private void method1(); or private int a=10;
               4. Interface cannot be instantiated but its reference variable can be created for storing its subclass object.
               5. We cannot declare interface as final, it leads CE.
               6. Interface variable should be initialized at time of creation because they are final, else it leads  compile time error.
               7. The class derived from the interface should contain all the abstract method declared or else the sub- class must be abstract.
*/
