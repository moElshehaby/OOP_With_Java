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
public class postgraduated extends students { 

   String search_area;

    public postgraduated() {
    }
   

    public postgraduated(String search_area, double gpa,  String n, int agee, int ph, int idd, String adresss, String e) {
        super(gpa,n, agee, ph, idd, adresss, e);
        this.search_area = search_area;
    }

    public String getSearch_area() {
        return search_area;
    }

    public void setSearch_area(String search_area) {
        this.search_area = search_area;
    }

    @Override
    public String toString() {
        return "postgraduated{" + "search_area=" + search_area + '}';
    }

    @Override
    public void printing() {
        super.printing();
                       System.out.println (   "search_area=" + search_area + '}');        

//To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
