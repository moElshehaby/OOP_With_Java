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
public class graduated extends students {
String department;

    public graduated() {
    }


    public graduated(String department, double gpa,  String n, int agee, int ph, int idd, String adresss, String e) {
        super(gpa, n, agee, ph, idd, adresss, e);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    
}
