package com.example.project1.oops.accessModifiers;

public class AccessModifiers {
    public static void main(String[] args) {
        A b=new B();
        A.print();
        b.print();

    }
}
class A{
     public static final void print(){
        System.out.println("A");
    }

}
class B extends A{


}
