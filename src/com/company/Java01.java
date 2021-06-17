package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Java01 {

    public static void main(String[] args) {



/*
Java01. Eriks exam like questions.

------------------------------------------------------
S1. Why is Java not considered a pure objectoriented language.

+ fordi der findes funktioner fra funktionel programmering i java - fx lambda expressions
+ fordi der findes primitive datatyper som ikke er objekter

------------------------------------------------------
S2. Can a primitive have the value null ?
+ primitive datatyper kan IKKE være null

------------------------------------------------------
S3. For all primitives, java has wrapper classes.
  Are values in wrapper classes immutable (immutable = man kan ikke ændre objektets værdi) ?
  + man bruger final til at lave noget immutable
*/
    Integer imTest = valueOf(4);

    System.out.println(imTest);

    imTest = 6;

    System.out.println(imTest);





/*

------------------------------------------------------
S4.
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getClass().getName());
        }

What will the above print ?

+ java.lang.Integer
*/
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getClass().getName());

        }
/*
------------------------------------------------------
S5.
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        for (int ii: lst) {
            System.out.println(ii.getClass().getName());
        }

What will the above print ?
+ Denne compiler ikke, da det ikke er en int men en Integer
*/
        int[] test = new int[5];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;

        for(int ii: test){
            System.out.println("S5: " + ii);
        }
/*

------------------------------------------------------
S6.  Write a function that converts a string to an Integer (return int).
     In 1 line of code.
*/
        System.out.println(convertStringToInt("2"));
/*



Now enhance that function, using exceptions,
if the String passed to the function is not a valid Integer
return the smallest possible Integer
otherwise of course just return a valid integer.
*/
        System.out.println(convertStringToInt("921.5"));
/*

------------------------------------------------------
S7. What happens here ?
        Integer a = Integer.valueOf(9);
        a++;

+ Den laver et nyt Integer obj som den assigner til a variablen == 10

------------------------------------------------------
S8.
        Integer n1 = 9;
        Integer n2 = 9;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

What does the above print.
+ true
+ true
*/
        Integer n1 = 9;
        Integer n2 = 9;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
/*

--------------------------------------
S9.
        Integer n1 = new Integer(9);
        Integer n2 = new Integer(9);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

What does the above print.
+ False
+ True

   Integer n3 = new Integer(9);
        Integer n4 = new Integer(9);
        System.out.println(n3 == n4);
        System.out.println(n3.equals(n4));
*/

/*

--------------------------------------
S10.
        Integer i2 = Integer.valueOf("1111", 2);
        System.out.println(i2);

The above prints 15.
Explain the second argument of valueOf.

+ radix er talsystemet,  2 == binær

*/
        Integer i2 = Integer.valueOf("1111", 2);
        System.out.println(i2);
/*
--------------------------------------
S11.
        int big = 255;
        byte small = (byte) big;

What is the above called ?
 + typecasting

--------------------------------------
S12.
        int big = 255;
        byte small = (byte) big;
        System.out.println("small=" + small); // -1
        big = 256;
        small = (byte) big;
        System.out.println("small=" + small); // 0
        big = 257;
        small = (byte) big;
        System.out.println("small=" + small); // 1

What is printed in the above 3 lines ?
+ følgende printer ud i hexa:
System.out.println(Integer.toBinaryString(255)); // 11111111
System.out.println(Integer.toBinaryString(256)); // 00000000
System.out.println(Integer.toBinaryString(257)); // 00000001
*/

        int big = 255;
        byte small = (byte) big;
        System.out.println("small=" + small);
        big = 256;
        small = (byte) big;
        System.out.println("small=" + small);
        big = 257;
        small = (byte) big;
        System.out.println("small=" + small);

/*
--------------------------------------
S13. Are all Strings in Java immutable?
+ ja

--------------------------------------
S14.
        String str3 = "value1";
        str3.concat("value2");
        System.out.println(str3);

What happens in the above ? is the value2 string being added to the value1 string ?
So str3 now is "value1value2"
+ NEJ value2 bliver IKKE tilføjet til str3, fordi String er immutable
+ Hvis man skulle tilføje value2 til str3:
  +      str3 = str3.concat("value2");

*/
        String str3 = "value1";
        str3.concat("value2");
        System.out.println(str3);

/*
--------------------------------------
S15.
        String s1 = "abcde";
        s1.replace('a', 'x');
        System.out.println(s1);

 + NEJ String er immutable

*/

        String s1 = "abcde";
        s1.replace('a', 'x');
        System.out.println(s1);

/*
--------------------------------------
S16. Fix the above code to print xbcde
*/

        s1 = s1.replace('a', 'x');
        System.out.println(s1);

/*
----------------------------------------
S17. In Object Oriented Programming you can say an object has a state and a behaviour
what represents the state?
+ attributter
and what represents the behaviour?
+ metoder

----------------------------------------
S18. Are class variables (dvs. static variabler) part of an objects state.
+ nej - de tilhører klassen IKKE objektet

----------------------------------------
S19. What is the super class of every class in Java?
+ Object

----------------------------------------
S20. What is Method Overriding ?
*/

/*
------------------------------------------------
S21. What is Method Overloading ?
*/

/*
------------------------------------------------
S22. Is Multiple Inheritance allowed in Java ?
+ nej
------------------------------------------------
S23. What is an interface ?

------------------------------------------------
S24. Can an interface extend a class ?
+ nej
------------------------------------------------
S25. Can a class extend multiple interfaces ?
+ NEJ den kan IMPLEMENTERE flere interfaces
------------------------------------------------
S26. What is an abstract class ?
+ en klasse som ikke kan intialiseres - typisk er over-superklassen abstract
------------------------------------------------
S27. How do you define an abstract method ?
+ har ikke nogen body - laves i en abstract superklasse, og så implementeres den i subklasserne
------------------------------------------------
S28. Can a normal class have an abstract method ?
+ nej
------------------------------------------------
S29. Can we inherit an abstract class from another abstract class?
+ ja
------------------------------------------------
S30. Mention just one difference between an interface and an abstract class
+ man kan ikke lave subklasse/interfaces af et interface - tilgengælg er abstract klasser typisk superklasser
------------------------------------------------
S31. What is an Constructor ?
+ det som opretter et obj af en klasse - findes altså ikke i en abstract class
------------------------------------------------
S32. Mention 2 things that are different from a Constructor and a method.
+ man skriver ikke returtype + navnet er klassenavnet
------------------------------------------------
S33. Why does this code not compile ?

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student std = new Student();
    }
}

+ fordi vi ikke kan kalde default-constructoren når den er blevet overridet af vores som tager 1 param


------------------------------------------------
S34. How do you call a Super Class Constructor from a Constructor ?

    public Student(String name) {
        super();
        this.name = name;
    }

Is the above super() necessary ?

+ nej, men hvis superklassen have attributter, så ja for at sætte dem

*/
    Car car = new Volvo(4, "Vibes bil");
        System.out.println(car);

/*
------------------------------------------------
S35. This code doesnt compile, why ?

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
        super();
    }

    public static void main(String[] args) {
        Student std = new Student("hans");
    }
}

+ Student extender ikke nogen klasse
+ super() skal før this.name = name;

------------------------------------------------
S36. How would you create a constructor in class Student that takes no arguments
     but call the constructor in the same class that takes a name argument,
     meaning the class has a property String name, and a constructor that sets that name property.

    public Student() {
        this("Default name");
    }
*/

        Student stud = new Student();

        System.out.println(stud);

/*

------------------------------------------------
S37. What will be printed out from the main method in class Main ?


public class Student {
    public String name;

    public Student() {
        this("Default name");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("Student created with name =" + name);
    }

    public static void main(String[] args) {
        Student std = new Student("hans");
    }
}

public class KEAStudent extends Student {

    public KEAStudent() {
    // + her bliver super() kaldt automatisk
        System.out.println("KEA Student created");
    }
}

public class Main {

    public static void main(String[] args) {
        KEAStudent kea = new KEAStudent();
        System.out.println(kea.name);
    }
}

+ Student created with name = default name
+ KEA Student created
+ Default name


------------------------------------------------
S38. What is Polymorphism in one simple sentence ?

+ Polymorphism is defined as "Same Code" giving "Different Behavior".
+ Same method signature implemented diferrently in different Classes.

------------------------------------------------
S39. Can a private variable in a super class be accessed from a subclass.

+ Nej - men ja igennem en get

------------------------------------------------
S40. What is the use of a final modifier on a method ?

+ Final methods cannot be overriden.
+ Calling a final method has less overhead, so perform better.


------------------------------------------------
S41. What is a Final variable ?
+ en variabel hvis værdi ikke kan ændres
------------------------------------------------
S42. Write a method signature with an argument that cannot be changed inside the method.
*/

    testMethod(10);

/*

------------------------------------------------
S43. What are static variables and methods ?

+ de tilhører klassen - og udtrykker altså derfor ikke et objekts state eller behaviour

Static variables and methods are class level variables and methods.
There is only one copy of the static variable for the entire Class.
or you could say only one shared value between all instances.
You dont need an instance of the class to use a static variable or call a static method.

Another rule is, you can access a static method from an instance method
but you cannot access an instance method from a static method.

------------------------------------------------
S44.  A top-level class in Java cannot be declared static.
But what does the following mean ?

public final class MyStaticClass {}

+ alle metoder i en final class er også final

------------------------------------------------


*/





    }

    //S6
    /*
    Now enhance that function, using exceptions,
    if the String passed to the function is not a valid Integer
    return the smallest possible Integer
    otherwise of course just return a valid integer.
     */
    public static int convertStringToInt(String str){
        try{
            return Integer.parseInt(str);
        } catch(NumberFormatException e){
            return 0;
        }

    }





    public static void testMethod(final int finalArgument) {
        System.out.println(finalArgument);
    }





}




