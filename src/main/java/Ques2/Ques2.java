/*
    Write a program to demonstrate Loosely Coupled code.
 */
package Ques2;

interface Food{
    public void display();
}
class Chinese implements Food {
    public Chinese(){}
    public void display(){
        System.out.println("Chinese");
    }
}

class Mexican implements Food {
    public Mexican(){}

    public void display(){
        System.out.println("Mexican");
    }
}

public class Ques2 {
    public static void main(String args[]){

        Food b = new Chinese();
        b.display();

    }
}
