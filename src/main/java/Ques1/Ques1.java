/*
    Write a program to demonstrate Tightly Coupled code.
 */

package Ques1;

class Food{
    Chinese c = new Chinese();
    public void show(){
        c.display();
    }
}

class Chinese{
    public void display(){
        System.out.println("Chinese");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Food b = new Food();
        b.show();
    }
}
