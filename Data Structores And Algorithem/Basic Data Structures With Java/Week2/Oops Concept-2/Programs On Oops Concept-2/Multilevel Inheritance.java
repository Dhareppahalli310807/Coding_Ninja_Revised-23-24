// Problem statement
// Create a class GrandFather that has a parameterized constructor and a grandFatherName attribute.

// Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.

// Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a printName method that prints the sonName,fatherName, and grandFatherName into the format as shown below in SampleOutput 1.

// You need to create the object of Son class and pass the value of sonName,fatherName,grandFatherName as 'Saurabh', 'Ramesh', and 'Suresh' respectively and call the printName method.

// Sample Output 1 :
// sonname:  Saurabh
// fathername:  Ramesh
// grandfather:  Suresh
// Note:
// Keep all the attribute value static as  above mention in sample output 1.


import java.util.* ;
import java.io.*; 

// Create the classes here
class GrandFather {
    String grandFatherName;
    public GrandFather(String grandFatherName) {
        this.grandFatherName = grandFatherName;
    }
}
class Father extends GrandFather {
    String fatherName;
    public Father(String fatherName, String grandFatherName) {
        super(grandFatherName); 
        this.fatherName = fatherName;
    }
}
class Son extends Father {
    String sonName;
    public Son(String sonName, String fatherName, String grandFatherName) {
        super(fatherName, grandFatherName);  // Call the Father constructor
        this.sonName = sonName;
    }
    public void printName() {
        System.out.println("sonname: " + sonName);
        System.out.println("fathername: " + fatherName);
        System.out.println("grandfather: " + grandFatherName);
    }
}
class Solution {
    public static void main(String args[]) {
        Son son = new Son("Saurabh", "Ramesh", "Suresh");
        son.printName();
    }
}

