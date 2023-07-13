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
public class students_in_college_now extends students{

    public students_in_college_now() {
    }
    
    int level;

    public students_in_college_now(int level, double gpa, String n, int agee, int ph, int idd, String adresss, String e) {
        super(gpa, n, agee, ph, idd, adresss, e);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

  
    @Override
    public void printing() {
        super.printing(); 
          System.out.println ( "Level => " + level + '}');

//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
