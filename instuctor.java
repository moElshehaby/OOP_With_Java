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
public class instuctor extends employee { 
 String job;

    public instuctor() {
    }
 
    public instuctor(String job, double salary, double taxes, String n, int agee, int ph, int idd, String adresss, String e) {
        super(salary, taxes, n, agee, ph, idd, adresss, e);
        this.job = job;
    }
    
    
   

    public String getSubject() {
        return job;
    }

    public void setSubject(String subject) {
        this.job = subject;
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

   

    @Override
    public void printing() {
          System.out.println("job=" + job + '}');
        //To change body of generated methods, choose Tools | Templates.
    }
      
      
   
}
