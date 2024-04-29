package com.example.part2_1;

//  1. Create a subclass (child class) which inherits the superclass (extends the base class)
public class SubClass extends SuperClass {


//   7. Use of super keyword for parent constructor call. Demonstrate ability to call superclass constructor inside the child class constructor using super() call.
//        – prove by code that default superclass constructor is called even when no direct sup//        7. Use of super keyword for parent constructor call. Demonstrate ability to call superclass constructor inside the child class constructor using super() call.erclass constructor call present
//        – demonstrate call of non-default superclass constructor


    public SubClass(int publicVariable, int protectedVariable, int privateVariable) {
        super(publicVariable, protectedVariable, privateVariable);
    }

//  4.  Write and call overloaded methods. Demonstrate overloading inside the same class
//  and overloading implemented in inherited class (Do not confuse overloading with overriding).


    // Overloaded method with no parameters
    public void overloadedMethod() {
        System.out.println("Overloaded method with no parameters");
    }

    // Overloaded method with one parameter
    public void overloadedMethod(int a) {
        System.out.println("Overloaded method with one parameter: " + a);
    }

    // Overloaded method with two parameters
    public void overloadedMethod(int a, int b) {
        System.out.println("Overloaded method with two parameters: " + a + ", " + b);
    }

    //  5. Write and call overridden methods. Override a parent class method inside a child class.
    //  Outside the class (for class instance) call overridden method and ensure that correct method is called.
    @Override
    public void theMethod() {

        //  6. Use of super keyword. Demonstrate ability to call overridden method (method of the superclass) inside the overriding method (method of the child class) using super keyword.
        super.theMethod();

        System.out.println("This is the Subclass' method that overrides the Superclass' method theMethod()");
    }

    public void accessSuperClassVariables() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Protected Variable: " + protectedVariable);
        // System.out.println("Private Variable: " + privateVariable); // This line would cause a compile error because privateVariable is private in SuperClass
    }

    // 8.   Implement the method in inherited class.
    @Override
    public void abstractMethod() {
        System.out.println("This is SubClass's implementation of the abstract method from MyAbstractClass");
    }



}

