//To copy one object to another object 

class A {
    int num;
    String name;
    A() {
            num=32;
            name="ashish";

            System.out.println("num = "+num+" name="+name);
    }

    A(A ref) {
        num=ref.num;
        name=ref.name;
        System.out.println("num = "+num+" name="+name);
    }
}

class B {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A(a1);
    }
}
