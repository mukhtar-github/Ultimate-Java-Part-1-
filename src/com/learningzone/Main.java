// 1-GETTING STARTED

// 1- Setting Up the Development Environment

//In this Java tutorial, we're going to download and install the necessary tools to build Java applications. So open up
//your browser and search for JDK download. JDK is short for Java Development Kit, and it's basically software
//development environment for building Java applications. It has a compiler, it ahs a bunch of code that we could reuse,
//it has a Java runtime environment and a bunch of other stuff. Head over to oracle.com to download Java SE which is
//short for 'Java Standard Edition'. Now the next piece of software we need is a code editor. There are so many code
//editors for building Java applications. The popular one are Netbeans, Eclipse and IntelliJ. In this Java course I'm
//going to use IntelliJ.


// 2- Anatomy of a Java Program

//In this Java tutorial, we're going to look at the anatomy of Java programs. The smallest building block in Java
//programs are functions. A function is a block of code that performs a task. As a metaphor, think of the buttons on the
//remote control of your TV. Each button performs a task. Functions in programming languages are exactly the same. For
//example, we can have a function for sending emails to people, we have a function for converting someone's weight in
//pounds to kilograms. We can have a function for validating users input and so on.
//Now let's see how we can code a function in Java. We start by specifying the return type of the function:
//ReturnType Name() {
//  ...
//}
//Some functions return a value like a number, a day time, and so on. Other functions don't return anything. So the
//return of these functions is Void.
//void Name() {
//  ...
//}
//Void is a reserve keyword in Java, and that's why I've coded it in blue. Now after the return type, we have the Name
//of our function. So here we should give our function a proper descriptive name, like sendEmail.
//void sendEmail()
//  ...
//}
//This name clearly identifies the purpose of this function.Now after the name we have a pair of parenthesis, and inside
//these parenthesis we add the parameters for this function. We use these parameters to pass values to our function.
//For example, our sendEmail function should have parameters like,who's the receiver, what is the subject of this email,
//what is the content of this email and so on. Now in this tutorial we're not going to worry obout parameters. We'll
//look at them in the future. Now after the parenthesis, we add a pair of curly braces, and inside these braces we write
//the actual Java code. Now, one thing I want you to pay attention to here is that in Java, we put the left brace on the
//same line where we define our function. In other programming languages like C#, it's more conventional to put the left
//brace on a new line. But we don't do that in Java. Now, every Java program should have at least one function, and that
//function is called 'main'. So, main is the entry point to our programs. Whenever we execute a Java program, the main
//function gets called and the code inside this function gets executed. Now these functions don't exist on their own,
//they should always belong to a class. So a class is a container for one or more related functions. Basically we use
//these classes to organize our code. Just like how products are organized in a super market. Each section contains
//related products. By the same token a class in Java contains related functions. Now every Java program should have
//at least one class that contains the main function. So this is how we define a class in Java. We start with a class
//keyword, then we give our class a proper descriptive name, and then we add a pair of curly braces. Now the functions
//that we define in between this curly braces belong to this class. And more accurately, we refer to them as methods. So
//a method is a function that is part of a class. In some programming languages like Python, we can have a function that
//exist outside of a class. So we call it a function. But when a function belongs to a class, we refer to it as method
//of that class. In Java, all these classes and methods, should have an Access Modifier. An Access Modifier is a special
//keyword that determines if other classes and methods in this program can access these classes and methods. We have
//various access modifiers like public, private and so on. Most of the time we use the public access modifier, so we put
//that in front of our class and method declarations. So this is the basic structure of a Java program. At a minimum we
//have a Main class, and inside this main class we have the main method.
//public class Main {
//  public void main() {
//      ...
//  }
//}
// You might be curious why we have a capital M in the name of this class. Because in Java we use different conventions
//for naming our classes and our methods. To name our classes, we use the PascalNamingConvention. And that basically
//means the first letter of every word should be uppercase. In contrast, to name our methods, we use the camel naming
//convention and that means the first letter of every word should be uppercase except the first word. So that is why we
//a capital M in the name of this class.


// 3- Your First Java Program

//In this Java tutorial, you're going to learn how to write and execute your first Java program. So let's open up
//IntelliJ IDEA. Here in the home screen, let's create a new project. On the left side, select Java and make sure
//project SDK is not blank. Earlier we downloaded JDK or Java Development Kit, the latest version. So the latest version
//is selected in the drop down. Now let's click on next. On this page select create project from template. So we're
//going to create a command line application, which is an application that we can run from the command line. It doesn't
//have a graphical user interface or GUI. Now, I know a command line application is not as exciting as an application
//with a graphical user interface, like mobile app or a desktop app. But trust me, building an app with a graphical user
//user interface is very complicated. So for now, we're just going to build a command line applications to learn Java
//properly. Once you learn Java properly, then you can learn about building desktop or mobile applications with Java.
//Alright, now lets click on next. On this page we have to give our project a name, let's call it 'HelloWorld'. Now, you
//can see the location of this project, so it's inside the idea projects folder. Now right below that you can see the
//base package which is set to com.code-with-mosh on my machine. On your machine it's probably going to be com.package.
//What is this? Well, earlier we talked about Classes and Methods. I told you that a Class is a container for related
//Methods. So, we use classes to organize our code. By the same token, we have a concept called Package, and we use the
//Package to group related Classes. So, as our applications grow, we're going to end up with hundreds or even thousands
//of classes. So, we should properly organize these Classes into Packages. Now by convention, the base Package for a
//Java project is the domain name of your company in reverse. So my website is code-with-mosh.com, that is why I'm going
//to set the base package for this project to com.code-with-mosh. Now it doesn't mean that you should have an actual
//domain registered on the internet, this is just a way to create a namespace for our Classes. So now every class that
//you create in this project will belong to this package. We're going to talk about packages in more detail in the
//future. So for now, just type a base package for your project. It can be com.your-name or whatever, it doesn't really
//matter. Alright, now let's go forward, alright here is our first Java project. Now this code editor might look a little
//intimidating at first, but trust me, it's really easy, and you are going to learn about it through out this course. On
//the left side we have the project panel, where we can see all the folders and files in our project. For example, on
//the top we have a HelloWorld project. Inside this project we have the source folder, where we have the source code of
//our project. Now in this folder, we have another folder that is com.code-with-mosh. That is the name of our base
//package, and in this package we have the Main Class. So, you can see this Main file, opened on the right side here.
//Now, look at the name of this file, in 'Main.java'


package com.learningzone;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
