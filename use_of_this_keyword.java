//First use of this keyword is if, instance variable and parameterised variable having same name then this keyword is used for instance variable(this.variable_name)
class A
{
    int a,b;
    A(int a,int b)
    {
        this.a=a;           //(this.a = instance variable (a))
      
         this.b=b;         //(this.b = instance variable (b))
      System.out.println("a = "+a+" b = "+b);
    }
}
class Main 
{
 public static void main(String[]args)
 {
        A objA=new A();
 }
}


//second use of this keyword is if, this keyword is used to invoke , the method of the current class to another method within class (method call to another method)
class A
{
    public void show()
    {
        System.out.println("Hello I am in show1 method");
    }

    public void show1()
    {
        this.show();  //In this case if we cannot write this then Java Compiler automatically adds this keyword
        System.out.println("Hello  I am in show method");
    }
}

class Main
{
    public static void main(String[]args)
    {
          A a1=new A();
          a1.show1();
    }
}

//Third use of this keyword is to, call the constructor  default constructor fromto parameterised constructor
class A {
    A()
    {
        System.out.println("Hello");
    }
   A(int x) 
   {
        this();                         //here this() having no parameters, and in first A() doesn't having parameters so this() call to the A()
                                        //note this() must start at starting of the constructor if not it will give error
   }
}
class Main{
      public static void main(String[] args)
      {
            A objA=new A(10);                     //We created the object of parameterised constructor
          
      }
                                          
}


//Fourth it is used to reuse the constructor
class Student{
  int roll;
  String name;
  double fee;
    Student(String name,int roll) 
    {
        this.name=name;
        this.roll=roll;
        this.fee=fee;
    }
  
    Student(String name,int roll,double fee)
    {
        this(name,roll); //reusing the first constructor
        this.fee=fee;
    }
  void display() {
        System.out.println("Name :- "+name+"Roll no :- "+roll+"Fees :- "+fee);
  }
    {
          
    }
}


class Main{
    public static void main(String[]args)
    {
          Student s1=new Student("Ashish",12,45456.3);
          s1.display();
     }
}

//Fifth , To pass an argument in the method

class A {
    void method(A obj)
    {
        System.out.println("Hello i am in first method\\");
        
        
    }
    
    void method1() {
        method(this);         //Here we are passing this in the method to call it
    }
    
}

class Main{
    public static void main(String[]args) 
    {
        A objA=new A();
        objA.method1();
        
    }
}
