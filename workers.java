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
public class workers extends employee {

    public workers(){};

    public workers(int hours_num, float rate, double salary, double taxes, String n, int agee, int ph, int idd, String adresss, String e) {
        super(salary, taxes, n, agee, ph, idd, adresss, e);
        this.hours_num = hours_num;
        this.rate = rate;
    }

    public int getHours_num() {
        return hours_num;
    }

    public void setHours_num(int hours_num) {
        this.hours_num = hours_num;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

 

    int hours_num;
   float rate;
   
   
     @Override
    public double getTaxes() {
        return super.salary/100;


//super.getTaxes(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalary() {
        return hours_num*rate; //To change body of generated methods, choose Tools | Templates.
    }
   
 public double netSalary(){
     return (this.getSalary()-this.getTaxes() );

}
 @Override
    public void printing() {
        super.printing();
System.out.println("hours_num=" + hours_num + ", rate=" + rate + '}')  ;      

//To change body of generated methods, choose Tools | Templates.
    }
    
}
