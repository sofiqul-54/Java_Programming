
package com.sofiqul54.inheritance;
/* 
A class su
*/
public class B extends A{
    double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }
    
    
}
