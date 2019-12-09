package io.turntabl.startfresh;

import io.turntabl.startfresh.employeeClass.Employee;

public class Main {

    public static void main(String[] args) {

//      creating employee objects
     Employee employee1 = new Employee((short) 7,500000,"Franklin");
     Employee employee2 = new Employee((short)8, 20000, "Shadrach");
     Employee employee3 = new Employee((short)9,10000,"Alexan");

//     this block is useful with the default constructor.
//     It access the instance variables one by one.
//     while the are public or are giving no access modifier.

  /* Employee object = new Employee();
   object.employeeId =(short)3;
   System.out.println(object.employeeId);*/


//printing each employees  detail
        System.out.println("ID \t  \t NAME \t\t  COMPANY_NAME \t\t  SALARY \t\t CEO");
        System.out.println("...\t \t..... \t\t .............  \t  ........\t    ....\n");
        employee1.printEmpDetails();
        employee2.printEmpDetails();
        employee3.printEmpDetails();
   }

}
