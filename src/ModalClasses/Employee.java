
package ModalClasses;


public class Employee extends User{
    private double salary;

    public Employee() {
    }
    

    public Employee( String username, String password, String firstName, String lastName, String address, double salary) {
        super(username, password, firstName, lastName, address, "EMPLOYEE");
        this.salary = salary;
    }
}
