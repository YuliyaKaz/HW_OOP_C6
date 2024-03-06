package srp;

import java.util.Date;

/**
* класс Employee 
* Реализация принципа Single Responsibility Principle.
*/
public class Employee {
    private String name;
    private Date dob;
    /** конструктор */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    /** информация о работнике */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
