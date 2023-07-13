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
public class students extends person {

    public students() {
    }

    public students(double gpa,String n,int agee,int ph,int idd,String adresss,String e ) {
        super(n,agee,ph,idd,adresss,e);
        this.gpa = gpa;
        
    }
    
    double gpa;
    

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

   
   

    @Override
    public void printing() {
        super.printing();
      System.out.println ("Gpa => " + gpa + '}');
//To change body of generated methods, choose Tools | Templates.
    }

 

  
    
}
