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
public class administrator extends employee {

    public administrator() {
    }
    

    public administrator(double salary, double taxes, String n, int agee, int ph, int idd, String adresss, String e) {
        super(salary, taxes, n, agee, ph, idd, adresss, e);
    }

    @Override
    public double getTaxes() {
        return super.salary*.1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalary() {
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }
    
      public double netSalary(){
      
      return super.getSalary()-super.getTaxes();
      }


      
      
      
}
