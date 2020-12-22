//  1-GETTING STARTED
//  1- Setting Up the Development Environment
// In this Java tutorial, we're going to download and install the necessary tools to build Java applications. So open up
// your browser and search for JDK download. JDK is short for Java Development Kit, and it's basically software
// development environment for building Java applications. It has a compiler, it has a bunch of code that we could reuse,
// it has a Java runtime environment and a bunch of other stuff. Head over to oracle.com to download Java SE which is
// short for 'Java Standard Edition'. Now the next piece of software we need is a code editor. There are so many code
// editors for building Java applications. The popular one are Netbeans, Eclipse and IntelliJ. In this Java course I'm
// going to use IntelliJ.
//  2- Anatomy of a Java Program
// In this Java tutorial, we're going to look at the anatomy of Java programs. The smallest building block in Java
// programs are functions. A function is a block of code that performs a task. As a metaphor, think of the buttons on the
// remote control of your TV. Each button performs a task. Functions in programming languages are exactly the same. For
// example, we can have a function for sending emails to people, we have a function for converting someone's weight in
// pounds to kilograms. We can have a function for validating users input and so on.
// Now let's see how we can code a function in Java. We start by specifying the return type of the function:
// ReturnType Name() {
//   ...
// }
// Some functions return a value like a number, a day time, and so on. Other functions don't return anything. So the
// return of these functions is Void.
// void Name() {
//   ...
// }
// Void is a reserve keyword in Java, and that's why I've coded it in blue. Now after the return type, we have the Name
// of our function. So here we should give our function a proper descriptive name, like sendEmail.
// void sendEmail()
//   ...
// }
// This name clearly identifies the purpose of this function.Now after the name we have a pair of parenthesis, and inside
// these parenthesis we add the parameters for this function. We use these parameters to pass values to our function.
// For example, our sendEmail function should have parameters like,who's the receiver, what is the subject of this email,
// what is the content of this email and so on. Now in this tutorial we're not going to worry obout parameters. We'll
// look at them in the future. Now after the parenthesis, we add a pair of curly braces, and inside these braces we write
// the actual Java code. Now, one thing I want you to pay attention to here is that in Java, we put the left brace on the
// same line where we define our function. In other programming languages like C#, it's more conventional to put the left
// brace on a new line. But we don't do that in Java. Now, every Java program should have at least one function, and that
// function is called 'main'. So, main is the entry point to our programs. Whenever we execute a Java program, the main
// function gets called and the code inside this function gets executed. Now these functions don't exist on their own,
// they should always belong to a class. So a class is a container for one or more related functions. Basically we use
// these classes to organize our code. Just like how products are organized in a super market. Each section contains
// related products. By the same token a class in Java contains related functions. Now every Java program should have
// at least one class that contains the main function. So this is how we define a class in Java. We start with a class
// keyword, then we give our class a proper descriptive name, and then we add a pair of curly braces. Now the functions
// that we define in between this curly braces belong to this class. And more accurately, we refer to them as methods. So
// a method is a function that is part of a class. In some programming languages like Python, we can have a function that
// exist outside of a class. So we call it a function. But when a function belongs to a class, we refer to it as method
// of that class. In Java, all these classes and methods, should have an Access Modifier. An Access Modifier is a special
// keyword that determines if other classes and methods in this program can access these classes and methods. We have
// various access modifiers like public, private and so on. Most of the time we use the public access modifier, so we put
// that in front of our class and method declarations. So this is the basic structure of a Java program. At a minimum we
// have a Main class, and inside this main class we have the main method.
// public class Main {
//   public void main() {
//       ...
//   }
// }
//  You might be curious why we have a capital M in the name of this class. Because in Java we use different conventions
// for naming our classes and our methods. To name our classes, we use the PascalNamingConvention. And that basically
// means the first letter of every word should be uppercase. In contrast, to name our methods, we use the camel naming
// convention and that means the first letter of every word should be uppercase except the first word. So that is why we
// a capital M in the name of this class.
//  3- Your First Java Program
// In this Java tutorial, you're going to learn how to write and execute your first Java program. So let's open up
// IntelliJ IDEA. Here in the home screen, let's create a new project. On the left side, select Java and make sure
// project SDK is not blank. Earlier we downloaded JDK or Java Development Kit, the latest version. So the latest version
// is selected in the drop down. Now let's click on next. On this page select create project from template. So we're
// going to create a command line application, which is an application that we can run from the command line. It doesn't
// have a graphical user interface or GUI. Now, I know a command line application is not as exciting as an application
// with a graphical user interface, like mobile app or a desktop app. But trust me, building an app with a graphical user
// user interface is very complicated. So for now, we're just going to build a command line applications to learn Java
// properly. Once you learn Java properly, then you can learn about building desktop or mobile applications with Java.
// Alright, now lets click on next. On this page we have to give our project a name, let's call it 'HelloWorld'. Now, you
// can see the location of this project, so it's inside the idea projects folder. Now right below that you can see the
// base package which is set to com.code-with-mosh on my machine. On your machine it's probably going to be com.package.
// What is this? Well, earlier we talked about Classes and Methods. I told you that a Class is a container for related
// Methods. So, we use classes to organize our code. By the same token, we have a concept called Package, and we use the
// Package to group related Classes. So, as our applications grow, we're going to end up with hundreds or even thousands
// of classes. So, we should properly organize these Classes into Packages. Now by convention, the base Package for a
// Java project is the domain name of your company in reverse. So my website is code-with-mosh.com, that is why I'm going
// to set the base package for this project to com.code-with-mosh. Now it doesn't mean that you should have an actual
// domain registered on the internet, this is just a way to create a namespace for our Classes. So now every class that
// you create in this project will belong to this package. We're going to talk about packages in more detail in the
// future. So for now, just type a base package for your project. It can be com.your-name or whatever, it doesn't really
// matter. Alright, now let's go forward, alright here is our first Java project. Now this code editor might look a little
// intimidating at first, but trust me, it's really easy, and you are going to learn about it through out this course. On
// the left side we have the project panel, where we can see all the folders and files in our project. For example, on
// the top we have a HelloWorld project. Inside this project we have the source folder, where we have the source code of
// our project. Now in this folder, we have another folder that is com.code-with-mosh. That is the name of our base
// package, and in this package we have the Main Class. So, you can see this Main file, opened on the right side here.
// Now, look at the name of this file, is 'Main.java'. So, all Java files should have the Java extension. So, see what we
// have here, on top of this file, we the package statement. And this is used to specify what Package this Class belongs
// to. So, the Main class that we have here, belongs to this Package. Now, this package statement is terminated by a semi
// colon. So in Java, where ever we have a statement, we should terminate that statement with a semicolon. This is exactly
// like C# or C++. Now, below this Package statement, we have our Main Class, exactly like what you saw in the previous
// tutorial. So, we have Public, Class, Main, with a pair of curly braces. Inside this class, we have our Main method. So
// it's a public method which means, it's accessible from other parts of this Program. It's static, we haven't talked
// about static methods yet. We'll talk about them in future, for now just remember that the main method in your program
// should always be static. The return type of this method is void, which means this method is not going to return a
// value. And here in parenthesis, we have one parameter for this function. We can use these parameters to pass values to
// our program. Again, we'll look at this in the future. Now, right after these parenthesis, you can see the left brace,
// and this is where you write the code in this method. So, here we're going to use the System class in Java, so System,
// in the tooltip, you can see the System class is defined in this package, java.lang or language. Also, look at the icon
// on the left side of the tooltip, it indicates a class. Inside this class we have various members, we can use the dot(.)
// operator to see the members defined in the System class. Now the member that we're going to access is 'out'. Look at
// the at the icon of this member. It's 'f', which is short for field. We're going to talk about fields in the future when
// when we talk about classes and object oriented programming. Now, what is interesting here is the type of this field,
// and you can see that on the right side of the tooltip, that is 'PrintStream'. So PrintStream is another class that is
// defined in java. So once again we use the dot operator to look at the methods or members defined in the print string
// class. The method we're going to use is 'printLn' which is short for line. Look at the icon of this method, so 'm'
// indicates a method. So now with the code on line 127, we're calling or executing the print line method. Earlier I told
// you that inside these parenthesis, we can pass values to our methods. Here we want to print the 'Hello World' message
// on the terminal. So let's type double quotes and inside these quotes we writE 'Hello World'. So 'Hello World' is
// textual data. In Java, whenever we deal with textual data, we should always surround them with double quotes. Now we
// say we have a string. So a string is a sequence of characters. Alright, so we're done with our first program. Now to
// execute this, we can click on the play icon on the tool bar. Now intelliJ is building our application and we can see
// the result in the little terminal window.
// package com.learningzone;
//
// public class Main {
//
//     public static void main(String[] args) {
// 	    System.out.println("Hello World");
//     }
// }
//  4- How Java Code Gets Executed
// Alright, now let's see what's exactly happens under the hood, the moment we run a Java program in intelliJ. There are
// basically two steps involved here; Compilation and Execution. In the Compilation step, intelliJ uses the Java compiler,
// to compile our code into a different format called 'Java Byte Code'. This Java compiler comes with the Java development
// Kit that we downloaded at the beginning of the course. Let me show you, so here we can right click on the Main.java,
// and in the context menu, we have an item called 'Open In Terminal'. So let's open that, we get this Terminal window or
// command prompt on windows. Here, we're currently inside the '/IdeaProjects/HelloWorld/src/com/learningzone$' folder,
// that is where we have our Main.java file. Now we can invoke the Java compiler like this 'javac' and pass the name of
// our Java file as an argument, so Main.java. If you're on Mac or Linux, make sure to spell the Main with a capital 'M',
// because these operating systems are case sensitive. So press enter. Now let's at the contents of this folder, on Mac
// or Linux we can type 'ls', on windows we type 'dir'. So, let's take a look. In this folder, now we have a new file
// 'Main.class', this is the 'Byte Code' representation of the Main.java file. Now, let me use intelliJ to run our Java
// program. The Main.class file get stored somewhere else. Let me show you. So back to the project panel, here in our
// project, we have this 'src' folder where we have our source code, and we have this 'out' folder, where we have the
// result of the compilation. So, inside the folder, we have 'production', inside it we have 'HelloWorld', the same name
// as our project. Inside 'HelloWorld' we have 'com' which is the name of our top label package. Inside this package we
// have a sub package that is 'learningzone'. And lastly, we have our Main.class file. So this was the compilation step.
// Now, this Java Byte code that we have in this file is platform independent, and that means it can run on Windows, Mac,
// Linux or any operating systems that has a Java Runtime Environment (JRE). If you go to Java.com/download, we can
// download Java or more accurately Java Runtime Environment for various operating systems. This Java Runtime Environment
// has a Software component called 'Java Virtual Machine' or 'JVM'. This JVM takes a Java Byte Code and translate it to
// the native code for the underlined operating system. So if you're on Windows machine, this Java Virtual Machine converts
// a Java Byte code into a the native code that Windows can understand. This architecture is the reason why Java
// applications are portable or platform independent. We can write a Java program on a Windows machine and execute it on
// Linux, Mac or any other operating systems that have a Java Runtime Environment. C# and Python also has the same
// architecture, that's why they're platform independent as well. Now, let me show you how to invoke this Java Virtual
// Machine to run a Java program. So back to the terminal window. Currently, we're inside of this folder 'learningzone',
// and in this folder we have the 'Main class' file. Now let's go one level up, so 'cd ..' and one more time 'cd ..'. So
// now we are inside the 'src' folder. We can invoke Java Virtual Machine like this; we type 'java' and the we type the
// full path to our  'Main class' file. What do I mean by that, well earlier we defined this package 'com.learningzone'
// and the 'Main' class is part of this package. So the full path to this class is 'com.learningzone.Main', make sure to
// use a capital 'M' for Main class, because it is case sensitive. Now when we press enter, Java will look at this folder
// 'com', inside this folder, it look at this other folder 'learningzone', and then it will find 'Main.class' in that
// folder. It will load the Byte code and convert it to the native code for the operating system we are using. So take a
// look


package com.learningzone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}



// 1-GETTING STARTED

// 2-TYPES

// 3- Primitive Types
//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        byte age = 30;
//        long viewCount = 3_123_456_789L;
//	    float price = 10.99F;
//	    char letter = 'A';
//	    boolean isEligible = false;
//    }
//}


// 4- Reference Types

//package com.learningzone;
//
//import java.util.Date;
//
//public class Main {
//
//    public static void main(String[] args) {
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now); // => Thu Sep 10 13:11:12 WAT 2020
//    }
//}


// 5- Primitive vs Reference Types
//Primitive Type => Are copied by their value and these values are completely independent of each other
//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y); // => 1
//    }
//}

//Reference Type => Are copied by their references
//package com.learningzone;
//
//import java.awt.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2); // => java.awt.Point[x=2,y=1]
//    }
//}


// 6- Strings => Strings are reference types

//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String message = "  Hello World " + "!!";
//        System.out.println(message.trim());
//        System.out.println(message);
//    }
//}


// 7- Escape Sequences
//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        //String message = "Hello \"Mukhtar\""; => escape double-quotes.
//        //String message = "c:\\Windows\\..."; => escape back-slash.
//        //String message = "c:\nWindows\\..."; => new line.
//        //String message = "c:\tWindows\\..."; => tab
//        System.out.println(message);
//    }
//}


// 8- Arrays

//package com.learningzone;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers)); // => [1, 2, 0, 0, 0].
//
//        int[] numbers = { 2, 3, 5, 4, 1 };
//        System.out.println(numbers.length); => 5.
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers)); => [1, 2, 3, 4, 5].
//    }
//}


// 9- Multi-dimensional Arrays

//package com.learningzone;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
//        //Two dimensional array
//        //int[][] numbers = new int[2][3];
//        //numbers[0][0] = 1; //=> [[1, 0, 0], [0, 0, 0]].
//
//        //Three dimensional array
//        //int[][][] numbers = new int[2][3][5];
//        //numbers[0][0][0] = 1;
//        // =>[[[1, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]
//
//        //Curly brace syntax
//        //Let's say in this Matrix, we're going to have 2 rows and 3 columns, so each row is an array itself.
//        //Because it's a list of items.
//        int[][] numbers = { {1, 2, 3}, {4, 5, 6} }; // => [[1, 2, 3], [4, 5, 6]]
//
//        System.out.println(Arrays.deepToString(numbers));
//    }
//}


// 10- Constants

//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        final float PI = 3.14F;
//    }
//}


//  11- Arithmetic Expressions

//package com.learningzone;

//public class Main {

//public static void main(String[] args) {
//An expression is a piece of code that produces a value.

//int result = 10 + 3; // => 13

//double result = (double) 10 / (double) 3; // => 3.3333333333333335

//int x = 1;
//x++; // => 2.

//int x = 1;
//int y = x++;
//System.out.println(x); // => 2
//System.out.println(y); // => 1

//int x = 1;
//int y = ++x;
//System.out.println(x); // => 2
//System.out.println(y); // => 2

//int x = 1;
//x += 2; // === (x = x + 2) => Augmented or Compound Assignment Operator
//System.out.println(x); // => 3
//}
//}


// 12- Order of Operations

//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int x = 10 + 3 * 2; // => BODMAS
//        System.out.println(x);
//    }
//}


// 13- Casting

//package com.learningzone;

//public class Main {

//public static void main(String[] args) {
// Implicit casting/Automatic conversion
//Whenever we have a value, and that value can be converted to a type
//that is bigger, casting or conversion happens implicitly or automatically.
//So, bite can be automatically converted to short, and short can be converted
//to int and long. bite > short > int > long
//short x = 1; // we have 2 bites in a short variable.
//int y = x + 2; // we have 4 bites in an int variable.
//System.out.println(y);

//An integer is less precise than a double, because in a double we can have
//digits after the decimal point. So in this example, Java is going to
//automatically cast the integer into double, that is 2.0 and add it to 1.1.
//So as a rule of thumb, implicit casting happens whenever we're not going to lose data.
//bite > short > int > long > float > double
//double x = 1.1;
//double y = x + 2;
//System.out.println(y);// => 3.1

//What if we want y to be an integer, for example, we don't care about the digits after
//the decimal point, we want to see 3 in the terminal. This is where we should explicitly
//cast the result. So we should cast x to an integer, as shown below. That's explicit
//casting. x is converted to 1 without the decimal point. So this is all about implicit
//and explicit casting.
//double x = 1.1;
//int y = (int)x + 2;
//System.out.println(y);// => 3.0
//Explicit casting can only happen between compatible types. So all these types are
//compatible because they are numbers. But we cannot cast a string to a number.
//For all the primitive types we've learned, we have a wrapper classes. So in java we
//have a class which is a reference type called integer. This class is defined in java.lang
//package, and in this method we have a method called parse int. So this method takes a string
//and returns an integer. So integer is the wrapper class for the int primitive type. We also have
//short, and in this class we have parse short, it takes a string and returns a short. Similarly,
//we have float and double. So, let's say we get x as a string and we want to convert it to an
//integer. See below. So, why must we parse or convert a string to a number to add it to something else.
//Well, pretty much in most frameworks for building user interfaces, whether you're building a desktop
//or mobile application or web application, you always receive input from the user as a string. So, if
//you have a form with a bunch of text boxes or drop down lists, almost always we get values as a string.

//Short.parseShort(x);
//Float.parseFloat(x);
//String x = "1";
//int y = Integer.parseInt(x) + 2;
//System.out.println(y);// => 3.0

//So, that's why we need to convert the string to their numerical representation. What if x is a floating
//point number? What will happen if we try to parse (parseInt(x)) as an integer? We get an exception. So, if
//the user enters 1.1, we cannot use this method, instead we should use float or double. Let's use double,
//because that's easier. So we parse the number as a double, add 2 to it and store the result in a double.
// Then we get 3.1.

//String x = "1.1";
//double y = Double.parseDouble(x) + 2;
//System.out.println(y); //=> 3.1
//}
//}


// 14- The Math Class

//package com.learningzone;

//public class Main {

//public static void main(String[] args) {
//Round method, rounds a floating point number to a whole number.
//int result = Math.round(1.1F);
//System.out.println(result); // => 1.

//Ceil returns the smallest integer that is greater than or equal to the giving number.
//int result = (int)Math.ceil(1.1F);// explicitly casting to an integer.
//System.out.println(result); // => 2.

//Floor, the floor of a number is the largest integer that is smaller or equal to the giving number.
//int result = (int)Math.floor(1.1F);// explicitly casting to an integer.
//System.out.println(result); // => 1.

//Max, this returns the greater of two values. And Min does the opposite as well.
//int result = Math.max(1, 2);
//System.out.println(result); // => 2.

//Random, for generating random values between 0 and 1.
//double result = Math.random();
//System.out.println(result); // => 0.20193141297382433

//If we want a number between 0 and let say 100.
//double result = Math.random() * 100;
//System.out.println(result); // => 65.73925080214616

//If we don't want these digits after the decimal point, we can either round the number
//double result = Math.round(Math.random() * 100);
//System.out.println(result);// => 10.0
//Or cast it to an integer, if we don't want a fraction.
//int result = (int) Math.round(Math.random() * 100);
//System.out.println(result);// => 64

//}
//}


// 15- Formatting Numbers

//package com.learningzone;
//
//import java.text.NumberFormat;
//
//public class Main {
//
//    public static void main(String[] args) {
//        //Formatting Currency
//        //NumberFormat currency = NumberFormat.getCurrencyInstance();
//        //String result = currency.format(1234567.891);
//        //System.out.println(result);// => £1,234,567.89.
//
//        //Formatting Percentage
//        String result =NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);// => 10%.
//
//    }
//}


// 16- Reading Input

//package com.learningzone;

//import java.util.Scanner;

//public class Main {

//public static void main(String[] args) {
//In this tutorial, I'm going to show you how to read input from the user. In Java, we have the Scanner class
//that is defined in Java util package. So, in the terminal we can type 20, enter, and it says; You are 20.
//Scanner scanner = new Scanner(System.in);
//byte age = scanner.nextByte();
//System.out.println("You are " + age);// => You are 20

//We can add a label and ask the user to type something. For example, before reading data, we are going to call
//print line method and say Age:, so, we run the program and we get the label => Age:. But whatever we typed
//will appear on the next line. This is because, the print line method adds a new line after the label.
//To solve this issue, we only call the print method.
//Scanner scanner = new Scanner(System.in);
//System.out.print("Age: ");// => Age: 20
//byte age = scanner.nextByte();
//System.out.println("You are " + age);// => You are 20

//What if we type a floating point number? We get an exception because this method can only parse byte values.
//If we want to get a floating number, we need to call the nextFloat or nextDouble methods. What if we want to
//read a string? We don't have nextString, we only have next and next line. So, first I'm going to call the next
//method. We get a compilation issue after calling the next method because the method returns a string not byte.
//We also rename the variable to name and as well update the label to Name. Run the program, and type your name.
//But when we typed our full name, it wouldn't show the last name. This is because, every time we call the next
//method, it reads only one token.
//Scanner scanner = new Scanner(System.in);
//System.out.print("Name: ");// => Name: Mukhtar
//String name = scanner.nextLine();
//System.out.println("You are " + name);// => You are Mukhtar

//So, we use the nextLine method to get the entire line that the user enters, no matter how many spaces or tabs
//are there. What if, I type a few spaces before my name? Those spaces also appear, so this is where we use the
//Trim method. With trim, we can get rid of all these white spaces before or after a string. Just before storing
//the result in the variable, we can use the dot operator to access the members of the string object, so we call
//the trim method and store the result in the name variable.
//Scanner scanner = new Scanner(System.in);
//System.out.print("Name: ");// => Name: Mukhtar Garba
//String name = scanner.nextLine().trim();
//System.out.println("You are " + name);// => You are Mukhtar Garba


//}
//}


// 17- Project- Mortgage Calculator

//Now it's time for a project. I want you to use what you've learned in this section and build a mortgage calculator.
//So, when you run the program, we get a few questions. The first question is the principal (P) or the amount of loan
//you want to get. Let's say 100,000 dollars. The second question is the annual interest rate (r). Let's say 3.92 percent.
//And the third question is the period in years (n). Let's say you want to get a loan for 30 years. So, the program will
//calculates our monthly payments and displays it as a currency. This is a great exercise for you to practice all the
//materials you've learned in this section. Here is a formula for calculating the Mortgage or the monthly payments. So,
//let's see how it works. M = P r(1+r)^n/(1+r)^n - 1 => Mortgage equals to Principal or amount we're going to loan,
//multiply by r which is our monthly interest rate, this is very important. So, this number (3.92) that we get here is
// our Annual Interest Rate, we need to divide by 12. Also, take into account that this number is represented as a
//percent. To calculate the actual interest rate, we need to divide the number by 100. So, in this example, the interest
//rate is 0.0392. So, whatever the user enters, divide it by 100, and then divide it by 12 to get to the monthly interest
//rate. Now, we have this monthly interest rate, we need to multiply it by the expression next to it in the formula. In
//formula, we need to add 1 to the interest rate and raise it to the power of n, where n is the number of payments. So,
//we need to multiply this number (30) by 12 or 12 months, to calculate the number of payments. Now, to raise the number
//to the power of n, you need to use the Pow method of the Math class. So the Math class has pow or power method, it
//takes two values a and b.

// 18- Solution

//First, I've declared two final variables or constants, the first one is Months-in-Year, which I've set to 12. And the
//second one is percent which I've set to 100. The reason I declared these constants is that, I didn't want to have magic
//numbers in this code. We ask the first question, Principal and we read the answer as an integer. I thought integer is
//a good data type for storing the Principal, because short is noy enough. With short, we can store a maximum of 32,000
//dollars and that's not enough. What if someone wants to finance 1 million dollars. So int is good and it allows us to
//store a value of up to 2 billion. Next, we ask the second question, the Annual Interest Rate. We read it as a float.
//We could use double, but the interest rate is a small number, so float is sufficient for that. We get the annual
//interest and based on that we calculate the Monthly interest. Next, we get the Period. We read this as a byte, because
//the maximum number we want to support is 30. So, 1 byte is sufficient to store the number 30 or anything smaller. Now,
//based on the number of years, we calculate the number of payments. Once we collect all these data, then we calculate
//the Mortgage. So, we get the Principal, multiply it by all the expressions in the formula. And finally, after we
//calculate the mortgage, we use the Number format class to format the value as a currency. So, we get the result and
//store it in the string mortgageFormatted and print it. So, this is my implementation of the mortgage calculator.
//However, this program has a number of problems, the first one is input validation. If we run the program and enter a
//non-numeric value like xyz, our program crashes. Or as another example, if we enter a negative value, our program is
//not going to used properly. So, that's where conditional statements comes to rescue.
//Principal:
//100
//Annual Interest Rate:
//12
//Period (Years):
//10
//mortgage: £1.43

//package com.learningzone;
//
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.println("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("mortgage: "  + mortgageFormatted);
//    }
//}


// 4- CONTROL FLOW

// 1- Introduction
// 2- Comparison Operators
// 3- Logical Operators
// 4- If Statements
// 5- Simplifying If Statements

//In this tutorial, I'm going to show you a very cool technique for simplifying If Statements.
//So here we have a boolean expression, if this boolean expression evaluates to true, the boolean variable is going to
//be true, otherwise it's going to be false. So, this is the simplest, most elegant and most professional way to
//Simplify If Statements.

//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//
//    }
//}

// 6- The Ternary Operator
// 7- Switch Statements
// 8- Exercise - FizzBuzz

//package com.learningzone;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println("number");
//    }
//}


// 9- For Loops
// 10- While Loops

//The implementation using the for loop is a little bit lighter and cleaner. So, in situations where you know ahead of
//time, how many times you want to execute one or more statements, it's better to use a for loop. While loops are better
//in situations where we don't know exactly how many times we want to repeat something. For example, let's say we want
//to write a program and ask the user to continuously enter something until they type quit. The moment they type quit,
//we are going to terminate the program. In that situation, we don't know how many times the user is going to enter
//something. So let's write that program using a while loop. We don't have a counter variable in this example. Instead
//we want to check to see if the user entered quit or not. So, we can declare a string called input and initialize it to
//an empty string. Then we can write a While loop, like =>
//  String input = "";
//  while (input != "quit")
//while 'input' does not equal to 'quit', now this code is not going to work because 'input' is a string, which is a
//reference type, and we cannot use comparison operators between reference types, because these operators will compare
//the address of a string objects, not their value. So if you have two strings 'quit' and 'quit' but stored in different
//memory locations, they have different addresses. So we cannot use the inequality operator to compare their value.
//Instead we need to use the equals method of string objects. So we want to check to see if the input equals quit. We
//need to apply the not operator. So as long as the input does not equal quit, we're going to continuously ask the user
//to enter something. So we can print a label like input, and then we can use a scanner object to read something from
//the terminal. So let's create a scanner object and instantiate it using system.in. And call scanner.next, this will
//return a string, so we can store in the input variable.
//input: 1
//1
//input: 2
//2
//input: 3
//3
//input: quit
//quit
//Process finished with exit code 0


//package com.learningzone;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        }
//    }
//}


// 11- Do..While Loops

//in Java we have another type of loop called the Do while loop. It's very similar to a while loop, but it gets executed
//at least once. We start with a 'do' keyword, then we create a code block. At the end of this code block, we type while,
//followed by our loop condition. With while loops, we check the condition first. So, if the condition is false the first
//time, the loop will never get executed. In contrast with do while loops, we check the condition last. So, do while
//loops always get executed at least once, even if the condition is false. That is the only difference. In reality most
//of the time we use while loops. Do while loops are rarely used, but there are certain cases for them. So, just be
//aware of them.

//package com.learningzone;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        }
//
//        do {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
//    }
//}


// 12- Break and Continue Statements

//In this program we've written, there is a tiny problem. I'm going to run the program, and enter a couple of numbers.
//These numbers get echoed back, and if you type quit the program terminates, but the word quit also gets echoed back.
//This is a bit weird. So, let's look at a couple of ideas for solving this problem. One way to solve this problem is to
//check input before printing it. So, we can use an IF statement, if the input does not equal 'quit', then we print it.
//And if it equals quit, the word quit will not echoed back. There's another way to solve this problem as well. We can
//reverse the IF statement's condition. So, when the user types quit, we can immediately jump out of the loop, using the
//'break' statement. So, when Java sees the 'break' statement, it will ignore everything else after it and terminate the
//loop. We also have the 'Continue' statement that moves control to the beginning of the loop. So, let's imagine if the
//user types 'pass', we don't want to echo that, but also we don't want to terminate the loop. We want to ask the user
//to try one more time. So, after we read the input, we can check to see if 'input' equals pass, this is where we use
//the 'continue' statement. When Java sees the 'continue' statement, it will move control to the beginning of the loop.
//So, all the other statements are going to get ignored, and what the user types is not going to get printed on the
//terminal. So to recap, the 'break' statement terminates a loop, and the 'continue' statement moves control to the
//beginning of a loop. Now one last thing is, in this implementation, we don't really need the condition statement in
//the while loop. Because the moment user types 'quit', the 'break' statement is going to kick and terminate the loop.
//So we can simplify this code by using a 'true' statement as our loop condition. So it is always 'true'. And this loop
//is going to get executed forever until the user types 'quit'. This is a very common technique that you see amongst
//professional programmers. Just remember that, if you're using this technique, make sure to have a 'break' statement,
//otherwise, you will have an infinite loop that executes forever. So you're using a 'while true', make sure you have a
//'break' statement in your loop.

//package com.learningzone;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//                System.out.println(input);
//
//        }
//    }
//}


// 13- For-Each Loop

//The last type of loop we want to look at, is the For-Each-Loop in Java. We use For-Each-Loop to iterate over arrays or
//collections. So I'm going to start by declaring a string array called "Fruits", and initialized it with three items.
//Let's say Apple, Mango, and Orange. Now let's say we want to iterate over this array and print each item on the
//terminal. You can use any of the loops you learned earlier, like a 'For-Loop' or a 'While-Loop', but we can also use
//the 'For-Each-Loop', which is a bit easier. First I'm going to use the For-Loop to iterate over this array. So, we get
//each item on a new line;
//Apple
//Mango
//Orange
//Now, there is another way to write the same code using the 'For-Each-Loop'. Here we type 'for', in parenthesis we
//declare a loop variable, but the type of this variable should be based on the type of items in our array. So, here we
//we a string array and that means every item in this array is a string, so we should declare a string variable, we call
//it fruit, and we type a colon and then the name of our array, fruits. Now in each iteration, fruit will hold the value
//of one item in this array. So here we don't have to declare a numeric counter, we don't have to write a boolean
//expression, we don't have to increment our counter. It's much easier to iterate over an array. Now, if we print fruit,
//we get the same result as before. So this is the 'For-Each-Loop'. However, this 'For-Each-Loop' has a couple of
//limitations. One of the limitations is that it is always forward only, so, we cannot iterate over this array from the
//end to the beginning. In contrast, we can easily do this with a 'For-Loop'. We can initialize i to fruits.length, then
//we change the operator to greater than and replace fruits.length with 0, so as long as i is greater than 0, we're going
//to increment i. The second limitation of the 'For-Each-Loop' is that we don't have access to the index of each item,
//all we have is the loop variable (fruit), which holds the value of each item in the array. In contrast, in the 'For-
//Loop' you can access both the index and the actual item. So, i represents the index of each item and fruits[i] returns
//the item at the given index. So if you need the index then you have to use the 'For-Loop', otherwise, it's much easier
//to use the 'For-Each-Loop'.

//package com.learningzone;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String[] fruits = { "Apple", "Mango", "Orange" };
//
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }
//
//        for (String fruit : fruits)
//            System.out.println(fruit);
//    }
//}


// 14- Project- Mortgage Calculator

//Let's get back to our mortgage calculator and implement some basic error handling. So here I've changed the question
//by adding this label that identifies the range of values we can enter, so the minimum amount of loan we can get is
//1,000 dollars and maximum is 1 million dollars => Principal ($1K - $1M): 1
//So if I enter 1 in the label, I get this message: Enter a number between 1,000 and 1,000,000.
//And we're asked the question one more time => Principal ($1K - $1M):
//If we keep entering invalid values, we get asked the same question. Now let's enter a valid value like 1 million
//dollars. => Principal ($1K - $1M): 1000000
//Next we need to enter the annual interest rate => Annual Interest Rate: 0
//Now here we need to enter a value that is greater than zero, and less than or equal to 30. So if we enter 0, we get
//this message: Enter a value greater than 0 and less than or equal to 30.
//Once again we're asked this question one more time, so let's enter a valid value, like 3.92.
//=> Annual Interest Rate: 3.92
//In => Period(Years): 30
//We need to enter a value between 1 and 30. So if we entered 0, we get an error message and we're asked same question
//again. So let's enter 30, and finally we get the result.
//=> Mortgage: $4,728.13
//Here is our mortgage or monthly payments. So go ahead and spend  5-10 minutes on extending this mortgage calculator by
//adding error handling to it.


// 15- Solution

//Alright, let me show you how I'm going to solve this problem step by step. So for each question, we want to validate
//the value that the user enters. If the value is invalid, we want to keep asking the same question. So this is where we
//can use an infinite loop. Let me show you. So here's our first question, Principal. So I'm going to wrap the two lines
//inside an infinite loop, 'While(true)'. So we're going to keep asking the same question until the user enters a valid
//value. So, after we read the Principal, we can write an 'if' statement as written in the code. So if the user enters a
//valid value, then we can break out of the infinite loop. Otherwise, we're going to print an error message as written
//in the code. Where we calculated our mortgage, Principal is highlighted in red. So we have a compilation error,
//"cannot resolve symbol 'principal'". The reason is because we wrapped those few lines of code inside a while loop, and
//earlier I told you that whenever you declare a variable, that variable is scoped to the block in which it's defined.
//It's not available outside of the block. That's why we got the compilation error. So to solve the problem, we need to
//declare the variable outside the while loop and initialize it to zero. Now we need to repeat the same pattern with
//other questions. So our second question is in where we read the annual interest. Once again, we add an infinite loop.
//Now the moment we read the 'annualInterest', we validate the data with an 'if' statement. We should also calculate the
//monthly interest and finally, we break out of the infinite loop as written in the code.

// package com.learningzone;
//
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        int principal;
//        float monthlyInterest;
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Principal: ");
//            principal = scanner.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a value between 1000 and 1000000");
//        }
//        while (true) {
//            System.out.println("Annual Interest Rate: ");
//            float annualInterest = scanner.nextFloat();
//            if (annualInterest >= 1 && annualInterest <= 30) {
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//                break;
//            }
//        }
//
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("mortgage: "  + mortgageFormatted);
//    }
//}