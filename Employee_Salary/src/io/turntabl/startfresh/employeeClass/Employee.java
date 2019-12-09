package io.turntabl.startfresh.employeeClass;

public class Employee {
//    these are instance variables.
    private short employeeId;
    private int salary;
    private String name;
    private static String companyName;
    private static String ceo;

//    this is the static block
//    which makes what is declared
//    in its scopes static or unchangeable.

    static {
        companyName="turntabl Ghana Limited";
        ceo= "Sam Moorhouse";
    }

//    this is a constructor that takes three parameters.
//    but this can be overloaded by creating multiple
//    constructors with different or even no parameters.
   public Employee(short employeeId,int salary,String name){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }



// method to print the output.
    public void printEmpDetails(){
        System.out.println(employeeId +" \t "+ name.toUpperCase() + "  \t"
                + companyName.toUpperCase()+"    \t"+ salary+" \t" +ceo.toUpperCase());
        }

}
