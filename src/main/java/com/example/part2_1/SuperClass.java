package com.example.part2_1;

// 1. Create a superclass (base class / parent class)

// 8. Now make the superclass extending another abstract class: SuperClass extends MyAbstractClass.  Add declaration of that class.
public class SuperClass extends MyAbstractClass{

    //  3. Create instance variables for superclass with different access modifiers: private, protected, public.
    public int publicVariable;
    protected int protectedVariable;
    private int privateVariable;


    //  7. Use of super keyword for parent constructor call. Demonstrate ability to call superclass constructor inside the child class constructor using super() call.
    public SuperClass(int publicVariable, int protectedVariable, int privateVariable) {
        this.publicVariable = publicVariable;
        this.protectedVariable = protectedVariable;
        this.privateVariable = privateVariable;
    }


    @Override
    public void abstractMethod() {
        System.out.println("This is SuperClass's implementation of the abstract method from MyAbstractClass");
    }


    public void theMethod() {
        System.out.println("This is the Superclass' method");
    }
}

