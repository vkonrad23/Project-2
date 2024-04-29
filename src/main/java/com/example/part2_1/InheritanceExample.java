package com.example.part2_1;


//        Create an instance of the subclass.


//        Demonstrate possibility to create instance of subclass while declaring it as of type of superclass (SuperClass a = new SubClass()).
//        Try to explain, why it is no error in a such instance creation. Put your explanation into comment.
//        Print result of method getClass() into console for this instance (a.getClass() ).
//        Create instance variables for superclass with different access modifiers: private, protected, public.
//        Demonstrate ability to access superclass instance variables inside of the child class methods. Create explanation comment when you have no access to superclass member.
//        Write and call overloaded methods. Demonstrate overloading inside the same class and overloading implemented in inherited class (Do not confuse overloading with overriding). Demonstrate a call of the overloaded methods.
//        Write and call overridden methods. Override a parent class method inside a child class. Outside the class (for class instance) call overridden method and ensure that correct method is called.
//        Use of super keyword. Demonstrate ability to call overridden method (method of the superclass) inside the overriding method (method of the child class) using super keyword.
//        Use of super keyword for parent constructor call. Demonstrate ability to call superclass constructor inside the child class constructor using super() call.
//        – prove by code that default superclass constructor is called even when no direct superclass constructor call present
//        – demonstrate call of non-default superclass constructor
//        Demonstrate abstract classes and methods.
//        Now make the superclass extending another abstract class: SuperClass extends MyAbstractClass.  Add declaration of that class.
//        Add abstract method for the abstract class.
//        Implement the method in inherited class.




public class InheritanceExample { /* 1 . is the declaration of a public class in Java named Inheritanceexample.  Here's a breakdown:
    public: This is an access modifier that means this class is visible and can be accessed from any other class in the application.
    class: This keyword is used to declare a class in Java.
    Inheritanceexample: This is the name of the class. By convention, class names in Java should start with a capital letter, and they should be nouns in mixed case with the first letter of each internal word capitalized.
    {: This marks the beginning of the class body. Everything between this and the matching closing brace } is the body of the class, where you define its properties and methods. */


       public static class SuperClass { // 2. is the declaration of a public static class in Java named SuperClass.

        protected String protectedVariable = "Protected Variable"; // The line protected String protectedVariable = "Protected Variable"; is declaring a protected instance variable named protectedVariable of type String in Java.
           //protected: This is an access modifier that means this variable can be accessed within its own class, by any class in the same package, and by subclasses in other packages.
           //String: This is the data type of the variable. String is a built-in data type in Java for handling text.
           //protectedVariable: This is the name of the variable.
           //"Protected Variable": This is the initial value assigned to protectedVariable.
        public String publicVariable = "Public Variabe";
            //public: This is an access modifier that means this variable can be accessed from any class in the application.
           //String: This is the data type of the variable. String is a built-in data type in Java for handling text.
           //publicVariable: This is the name of the variable.
           //"Public Variable": This is the initial value assigned to publicVariable.

        public void printMethod() {
            System.out.println("Method in SuperClass");
        }
        //The provided code defines a public method named printMethod in Java. Here's a breakdown:
           //public: This is an access modifier that means this method can be accessed from any class in the application.
           //void: This is the return type of the method. void means that this method does not return any value.
           //printMethod(): This is the name of the method. The parentheses () indicate that this method does not take any parameters.
           //System.out.println("Method in SuperClass");: This is the body of the method, which is executed when the method is called. In this case, it prints the string "Method in SuperClass" to the standard output (usually the console).
           //So, when you call this method with object.printMethod(), it will print "Method in SuperClass" to the console, where object is an instance of the class that this method is defined in.







        public void overloadedMethod() {
            System.out.println("Overloaded method without parameters");
        }
        //The provided code defines a public method named overloadedMethod in Java. Here's a breakdown:
           //public: This is an access modifier that means this method can be accessed from any class in the application.
           //void: This is the return type of the method. void means that this method does not return any value.
           //overloadedMethod(): This is the name of the method. The parentheses () indicate that this method does not take any parameters.
           //System.out.println("Overloaded method without parameters");: This is the body of the method, which is executed when the method is called. In this case, it prints the string "Overloaded method without parameters" to the standard output (usually the console).
           //So, when you call this method with object.overloadedMethod(), it will print "Overloaded method without parameters" to the console, where object is an instance of the class that this method is defined in.
        public void overloadedMethod(String parameter) {
            System.out.println("Overloaded method with one parameter: " + parameter);
        }
        //The provided code defines a public method named overloadedMethod in Java. Here's a breakdown:
           //public: This is an access modifier that means this method can be accessed from any class in the application.
           //void: This is the return type of the method. void means that this method does not return any value.
           //overloadedMethod(String parameter): This is the name of the method, and it takes a single parameter of type String.
           //System.out.println("Overloaded method with one parameter: " + parameter);: This is the body of the method, which is executed when the method is called. In this case, it prints the string "Overloaded method with one parameter: " followed by the value of the parameter to the standard output (usually the console).
           //So, when you call this method with object.overloadedMethod("example"), it will print "Overloaded method with one parameter: example" to the console, where object is an instance of the class that this method is defined in.
        public SuperClass() {
            System.out.println("Default constructor of SuperClass is called");
        }

       //The provided code defines a public constructor named SuperClass in Java. Here's a breakdown:
           //public: This is an access modifier that means this constructor can be accessed from any class in the application.
           //SuperClass(): This is the name of the constructor. Constructors have the same name as the class they belong to.
           //System.out.println("Default constructor of SuperClass is called");: This is the body of the constructor, which is executed when an instance of the class is created using this constructor. In this case, it prints the string "Default constructor of SuperClass is called" to the standard output (usually the console).
           //So, when you create an instance of the SuperClass class with new SuperClass(), this constructor will be called, and it will print "Default constructor of SuperClass is called" to the console.





        public SuperClass(String message) {
            System.out.println("Non-default constructor of SuperClass is called with message: " + message);
        }
    }

    //The provided code defines a public static class named SubClass in Java that extends the SuperClass class. Here's a breakdown:
       //public: This is an access modifier that means this class is visible and can be accessed from any other class in the application.
       //static: This keyword indicates that this class is a static nested class, which means it is a nested class that does not require an instance of the outer class to be created.
       //class: This keyword is used to declare a class in Java.
       //SubClass: This is the name of the class. By convention, class names in Java should start with a capital letter, and they should be nouns in mixed case with the first letter of each internal word capitalized.
       //extends SuperClass: This indicates that SubClass is a subclass of the SuperClass class. SubClass inherits all the properties and methods of the SuperClass class.
       //{: This marks the beginning of the class body. Everything between this and the matching closing brace } is the body of the class, where you define its properties and methods.
       //The SubClass class defines the






    public static class SubClass extends SuperClass {
        @Override
        public void printMethod() {
            System.out.println("Overridden method in SubClass");
            super.printMethod();
        }

        //The provided code defines a public method named printMethod in Java that overrides a method from the superclass. Here's a breakdown:

        //public: This is an access modifier that means this method can be accessed from any class in the application.
        //static variable: It belongs to the class and not to the object (instance). A single copy of a static variable is shared among all instances of the class, meaning that if one instance changes the value of the variable, it reflects in all other instances.
         // class variable that is declared with the static keyword within a class outside any method, constructor, or block. It is also known as a static variable.

        //void: This is the return type of the method. void means that this method does not return any value.
           //printMethod(): This is the name of the method. The parentheses () indicate that this method does not take any parameters.
           //System.out.println("Overridden method in SubClass");: This is the body of the method, which is executed when the method is called. In this case, it prints the string "Overridden method in SubClass" to the standard output (usually the console).
           //super.printMethod();: This calls the printMethod() method of the superclass. The super keyword is used to access members of the superclass.
           //So, when you call this method with object.printMethod(), it will print "Overridden method in SubClass" followed by "Method in SuperClass" to the console, where object is an instance of the SubClass class.





        public void overloadedMethod(String parameter) {
            System.out.println("Overloaded method in SubClass with one String parameter: " + parameter);
        }

        //The provided code defines a public method named overloadedMethod in Java that overrides a method from the superclass. Here's a breakdown:
           //public: This is an access modifier that means this method can be accessed from any class in the application.
           //void: This is the return type of the method. void means that this method does not return any value.
           //overloadedMethod(String parameter): This is the name of the method, and it takes a single parameter of type String.
           //System.out.println("Overloaded method in SubClass with one String parameter: " + parameter);: This is the body of the method, which is executed when the method is called. In this case, it prints the string "Overloaded method in SubClass with one String parameter: " followed by the value of the parameter to the standard output (usually the console).
           //So, when you call this method with object.overloadedMethod("example"), it will print "Overloaded method in SubClass with one String parameter: example" to the console, where object is an instance of the SubClass class.







        public void accessSuperClassVariables() {
            System.out.println(protectedVariable);
            System.out.println(publicVariable);
        }


        //The provided code defines a public method named accessSuperClassVariables in Java. Here's a breakdown:
           //public: This is an access modifier that means this method can be accessed from any class in the application.
           //void: This is the return type of the method. void means that this method does not return any value.
           //accessSuperClassVariables(): This is the name of the method. The parentheses () indicate that this method does not take any parameters.
           //System.out.println(protectedVariable);: This prints the value of the protectedVariable instance variable to the standard output (usually the console).
           //System.out.println(publicVariable);: This prints the value of the publicVariable instance variable to the standard output (usually the console).
           //So, when you call this method with object.accessSuperClassVariables(), it will print the values of the protectedVariable and publicVariable instance variables to the console, where object is an instance of the SubClass class.






        public SubClass() {
            System.out.println("Default constructor of SubClass is called");
        }

        //The provided code defines a public constructor named SubClass in Java. Here's a breakdown:
           //public: This is an access modifier that means this constructor can be accessed from any class in the application.
           //SubClass(): This is the name of the constructor. Constructors have the same name as the class they belong to.
           //System.out.println("Default constructor of SubClass is called");: This is the body of the constructor, which is executed when an instance of the class is created using this constructor. In this case, it prints the string "Default constructor of SubClass is called" to the standard output (usually the console).
           //So, when you create an instance of the SubClass class with new SubClass(), this constructor will be called, and it will print "Default constructor of SubClass is called" to the console.








        public SubClass(String message) {
            super(message);
            System.out.println("Non-default constructor of SubClass is called");
        }
    }

    //The provided code defines a public class named InheritanceExample in Java. Here's a breakdown:
       //public: This is an access modifier that means this class is visible and can be accessed from any other class in the application.
       //class: This keyword is used to declare a class in Java.
       //InheritanceExample: This is the name of the class. By convention, class names in Java should start with a capital letter, and they should be nouns in mixed case with the first letter of each internal word capitalized.
       //{: This marks the beginning of the class body. Everything between this and the matching closing brace } is the body of the class, where you define its properties and methods.
       //The InheritanceExample class defines the main method, which is the entry point of the Java application. It creates an instance of the SubClass class and demonstrates method overriding, method overloading, and access to superclass variables.








    public static void main(String[] args) {
        SuperClass a = new SubClass();

        System.out.println(a.getClass());

        a.overloadedMethod();
        a.overloadedMethod("Parameter");

        a.printMethod();
    }
}
//The provided code defines a public static method named main in Java. Here's a breakdown:
   //public: This is an access modifier that means this method is visible and can be accessed from any other class in the application.
   //static: This keyword indicates that this method belongs to the class itself, not to instances of the class.
   //void: This is the return type of the method. void means that this method does not return any value.
   //main(String[] args): This is the name of the method, and it takes a single parameter of type String array. The main method is the entry point of a Java application.
   //SuperClass a = new SubClass();: This creates a new instance of the SubClass class and assigns it to a variable of type SuperClass. This demonstrates polymorphism, where an object of a subclass can be treated as an object of its superclass.
   //System.out.println(a.getClass());: This prints the class of the object referenced by the variable a to the standard output (usually the console).
   //a.overloadedMethod();: This calls the overloadedMethod() method of the object referenced by the variable a.
   //a.overloadedMethod("Parameter");: This calls the overloadedMethod(String parameter) method of the object referenced by the variable a with the parameter "Parameter".
   //a.printMethod();: This calls the printMethod() method of the object referenced by the variable a.
   //So, when you run this code, it will create an instance of the SubClass class, print the class of the object, call the overloadedMethod() and printMethod() methods, and demonstrate method overriding, method overloading, and access to superclass variables.