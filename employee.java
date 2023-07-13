/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

/**
 *
 * @author mahmo
 */
public abstract class employee extends person {

    public employee() {
    }

    public employee(double salary, double taxes,String n,int agee,int ph,int idd,String adresss,String e ) {
        super(n,agee,ph,idd,adresss,e );
        this.salary = salary;
        this.taxes = taxes;
    }
    
    double salary;
    double taxes;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        return "employee{" + "salary=" + salary + ", taxes=" + taxes + '}';
    }

    @Override
    public void printing() {
        super.printing(); 
          System.out.println(toString());

//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
