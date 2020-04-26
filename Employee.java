/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author M N Khakse
 */
public class Employee {
    
    String name, addr;
    int year;
    double salary;
    
    public void GetInput() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        name= sc.next();
        System.out.println("Enter the address of the employee: ");
        addr= sc.next();
        System.out.println("Enter the joining year of the employee: ");
        year= sc.nextInt();
        System.out.println("Enter the salary of the employee: ");
        salary= sc.nextDouble();
    }
    
    public void Display() {
        System.out.println("Name: "+name);
        System.out.println("Address: "+addr);
        System.out.println("Joining year: "+year);
        System.out.println("Salary: "+salary);
    }    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Enter the number of employees: ");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        
        Employee e[]= new Employee[n];
        
        for(int i=0; i<n; i++) {
            e[i]= new Employee();
            e[i].GetInput();
        }
        
        System.out.println();
        System.out.println("DETAILS OF THE EMPLOYEES ARE PRINTED BELOW:-");
        System.out.println();
        
        for(int i=0; i<n; i++) 
            e[i].Display();
            
    }
    
}
