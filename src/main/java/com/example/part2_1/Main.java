package com.example.part2_1;

public class Main {

    public static void main(String[] args) {

//      1. Create an instance of the subclass
        SubClass subClassInstance = new SubClass(10, 20, 30);

//      2. Demonstrate possibility to create instance of subclass while declaring it as of type of superclass (SuperClass a = new SubClass()).
        SuperClass subClass = new SubClass(10, 20, 30);
        subClass.theMethod();
//      2. Try to explain, why it is no error in a such instance creation. Put your explanation into comment.

//      2. Print result of method getClass() into console for this instance (a.getClass() ).
        System.out.println(subClass.getClass());

//      Demonstrate ability to access superclass instance variables inside of the child class methods. Create explanation comment when you have no access to superclass member.
        subClassInstance.accessSuperClassVariables();

// 4.   Demonstrate a call of the overloaded methods.
        subClassInstance.overloadedMethod();
        subClassInstance.overloadedMethod(5);
        subClassInstance.overloadedMethod(5, 10);


    }
}
