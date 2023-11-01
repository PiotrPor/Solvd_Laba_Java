package com.solvd.library;

public class Employee extends Person {
    public int employeeNumber;
    private float salary;
    
    public Employee() {
        super();
        employeeNumber = 0;
        salary = 3000f;
    }
    
    public Employee(String nm, String sn, int epnb, float slr) {
        super(nm, sn);
        employeeNumber = epnb;
        salary = slr;
    }
    
    public void setSalary(float newSalary) {
        if (newSalary > 0f) {
            salary = newSalary;
        }
        return;
    }
    
    public float getSalary() {
        return salary;
    }
}
