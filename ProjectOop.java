/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mahmo
 */
public class ProjectOop {
  static ArrayList< administrator>storeadministrator=new ArrayList< administrator>();
    static ArrayList<workers>storeworker=new ArrayList<workers>();
    static ArrayList<technician>storetechnician=new ArrayList<technician>();
    static ArrayList<graduated>storegraduated=new ArrayList<graduated>();
    static ArrayList<students_in_college_now>storestudents_in_college_now=new ArrayList<students_in_college_now>();
     static ArrayList<postgraduated>storepostgraduated=new ArrayList<postgraduated>();
 static ArrayList<instuctor>storeinstuctor=new ArrayList<instuctor>();
     
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);
        Scanner  sc = new Scanner(System.in);
     while(true)
        {  
        System.out.println("To Select Student Enter 1  \n" + "To Select Worker Enter 2  \n" +
                     "To Select Instructor Enter 3  \n" + "To Select Administrator Enter 4  \n" +
                     "To Select Technicistudents_in_college_nowans Enter 5  \n" + "To Select Postgraduated Enter 6  \n" + "To Select Graduated Enter 7  \n");
       
        int x = input.nextInt();
        
         if(x == 1)
      {
          System.out.println("To Add Student Information Enter 1 \n" + "To Remove Student Information Enter 2 \n" 
                                            + "To Show Student Information Enter 3 \n" + "To Edit Student Information Enter 4 \n");
          
          int l = input.nextInt();
            if(l == 1)
         {
             students_in_college_now s = new students_in_college_now();
             System.out.println("Please Enter Student ID");
             s.id=sc.nextInt();
             System.out.println("Please Enter Student Name");
             s.name=sc.next();
             System.out.println("Please Enter Student Age");
             s.age=sc.nextInt();
             System.out.println("Please Enter Student Address");
             s.Adress=sc.next();
             System.out.println("Please Enter Student PhoneNumber");
             s.phone=sc.nextInt();
             System.out.println("Please Enter Student GPA");
             s.gpa=sc.nextDouble();
             System.out.println("Please Enter Student Level");
             s.level=sc.nextInt();
          storestudents_in_college_now.add(s);
         }
            else if(l == 2)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                for(int i=0;i<storestudents_in_college_now.size();i++)
                {
                  students_in_college_now  n =storestudents_in_college_now.get(i);
                    if(n.id == id)
                    {
                       storestudents_in_college_now.remove(n);
                        break;
                    }
                }
                 System.out.println("Student Information Has Removed");       
            }
        
          else if(l == 3)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                boolean  ok =true;
                for(int i=0;i< storestudents_in_college_now.size();i++)
                {
                    ok= true; 
                     students_in_college_now n = storestudents_in_college_now.get(i);
                    if(n.id == id)
                    {
                       /* System.out.println("ID : " + n.id);
                        System.out.println("Name : " + n.name);
                        System.out.println("AGE : " + n.age);
                        System.out.println("Addres : " + n.Adress);
                        System.out.println("PhoneNumber : " + n.phone);
                        System.out.println("GPA : " + n.gpa);
                        System.out.println("Level : " + n.level); */
                        n.printing();
                        
                        
                        
                        break;
                    }
                    else ok = false;

                }
                if (ok==false)
                {
                    System.out.println(" Student Not Found");
                }
            }
        
        else if(l == 4)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                for(int i=0;i<storestudents_in_college_now.size();i++)
                {
                  students_in_college_now  n =storestudents_in_college_now.get(i);
                    if(n.id == id)
                    {
                      System.out.println("Please Enter Student ID");
            n.id=sc.nextInt();
             System.out.println("Please Enter Student Name");
             n.name=sc.next();
             System.out.println("Please Enter Student Age");
             n.age=sc.nextInt();
             System.out.println("Please Enter Student Address");
             n.Adress=sc.next();
             System.out.println("Please Enter Student PhoneNumber");
             n.phone=sc.nextInt();
             System.out.println("Please Enter Student GPA");
             n.gpa=sc.nextDouble();
             System.out.println("Please Enter Student Level");
             n.level=sc.nextInt();
             storestudents_in_college_now.add(n);
                       
                        break;
                    }
                }
                   
            }
        
        
        
        
        
        
        
        
        
        
        
}
         
   if(x == 2)
                 {
                     System.out.println("To Add Worker Information Enter 1 \n" + "To Remove Worker Information Enter 2 \n" 
                                      + "To Show Worker Information Enter 3 \n" + "To Edit Worker Information Enter 4 \n");
                     int l = input.nextInt();
                     if(l == 1)
                     {
                         workers w = new workers();
                        System.out.println("Please Enter Worker ID");
                        w.id=sc.nextInt();
                        System.out.println("Please Enter Worker Name");
                        w.name=sc.next();
                        System.out.println("Please Enter Worker Age");
                        w.age=sc.nextInt();
                        System.out.println("Please Enter Worker Address");
                        w.Adress=sc.next();
                        System.out.println("Please Enter Worker PhoneNumber");
                        w.phone=sc.nextInt();
                        System.out.println("Please Enter Worker Salary");
                        w.salary = sc.nextDouble();
                         System.out.println("Please Enter Worker hors number");
                         w.hours_num=sc.nextInt();
                           System.out.println("Please Enter Worker hors rate");
                           w.rate=sc.nextFloat();
                        storeworker.add(w);
                     }      
                     
                       else if(l == 2)
                     {
                         System.out.println("Please Enter Worker ID");
                       int id = sc.nextInt();
                       for(int i=0;i<storeworker.size();i++)
                       {
                           workers n = storeworker.get(i);
                           if(n.id == id)
                           {
                               storeworker.remove(n);
                               break;
                           }
                       }
                        System.out.println("Worker Information Has Removed");
                     }
                     
                        else if(l == 3)
                   {
                       System.out.println("Please Enter Worker ID");
                       int id = sc.nextInt();
                       boolean  ok =true;
                       for(int i=0;i<storeworker.size();i++)
                       {
                           ok= true; 
                           workers n =storeworker.get(i);
                           if(n.id == id)
                           {
                               System.out.println("ID : " + n.id);
                               System.out.println("Name : " + n.name);
                               System.out.println("AGE : " + n.age);
                               System.out.println("Addres : " + n.Adress);
                               System.out.println("PhoneNumber : " + n.phone);
                               System.out.println("hours rate: " + n.rate);
                                 System.out.println("hours number " + n.hours_num);
                                System.out.println("Taxes : " + n.getTaxes());
                                  System.out.println("Salary : " + n.netSalary());
                               break;
                           }
                           else ok = false;                           
                        }
                       if (ok==false)
                        {
                            System.out.println(" Worker Not Found");
                        }
                    } 
                     else if(l == 4)
                     {
                         System.out.println("Please Enter Worker ID");
                       int id = sc.nextInt();
                       for(int i=0;i<storeworker.size();i++)
                       {
                           workers n = storeworker.get(i);
                           if(n.id == id)
                           {
                               storeworker.add(n);
                               break;
                           }
                     
                     
                           
                }
                     }}
                      if (x==3)
                           {
                               System.out.println("To Add Instructor Information Enter 1 \n" + "To Remove Instructor Information Enter 2 \n" 
                                            + "To Show Instructor Information Enter 3 \n" + "To Edit Instructor Information Enter 4 \n");
                                int l = input.nextInt();
                                if(l == 1)
                             {
                                 instuctor i = new instuctor();
                                 System.out.println("Please Enter Instructor ID");
                                 i.id=sc.nextInt();
                                 System.out.println("Please Enter Instructor Name");
                                 i.name=sc.next();
                                 System.out.println("Please Enter Instructor Age");
                                 i.age=sc.nextInt();
                                 System.out.println("Please Enter Instructor Address");
                                 i.Adress=sc.next();
                                 System.out.println("Please Enter Instructor PhoneNumber");
                                 i.phone=sc.nextInt();
                                 
                                 
                                 System.out.println("Please Enter Instructor Salary");
                                 i.salary = sc.nextDouble();
                                 
                                 System.out.println("Pleas Enter Instructor Course That He Is Tech ");
                                 i.job=sc.next();
                                 System.out.println("Pleas Enter Instructor Lectures That He Is Responsible for ");
                                 
                                 storeinstuctor.add(i);
                             }
                                else if(l == 2)
                                {
                                    System.out.println("Please Enter Instructor ID");
                                    int id = sc.nextInt();
                                    for(int i=0;i<storeinstuctor.size();i++)
                                    {
                                        instuctor n =storeinstuctor.get(i);
                                        if(n.id == id)
                                        {
                                            storeinstuctor.remove(n);
                                            break;
                                        }
                                    }
                                     System.out.println("Instructor Information Has Removed");       
                                }
                                else if(l == 3)
                                {
                                    System.out.println("Please Enter Instructor ID");
                                    int id = sc.nextInt();
                                    boolean  ok =true;
                                    for(int i=0;i<storeinstuctor.size();i++)
                                    {
                                        ok= true; 
                                        instuctor n =storeinstuctor.get(i);
                                        if(n.id == id)
                                        {
                                            System.out.println("ID : " + n.id);
                                            System.out.println("Name : " + n.name);
                                            System.out.println("AGE : " + n.age);
                                            System.out.println("Addres : " + n.Adress);
                                            System.out.println("PhoneNumber : " + n.phone);
                                            System.out.println("Salary : " + n.salary); 
                                            break;
                                        }
                                        else ok = false;

                                    }
                                    if (ok==false)
                                    {
                                        System.out.println(" Instructor Not Found");
                                    }
                                }
                            }
                      
                         if(x==4)
                                  {
                                        System.out.println("To Add Administrator Information Enter 1 \n" + "To Remove Administrator Information Enter 2 \n" 
                                            + "To Show Administrator Information Enter 3 \n" + "To Edit Administrator Information Enter 4 \n");
                                int l = input.nextInt();
                                if(l == 1)
                             {
                                 administrator a = new administrator();
                                 System.out.println("Please Enter Administrator ID");
                                 a.id=sc.nextInt();
                                 System.out.println("Please Enter Administrator Name");
                                 a.name=sc.next();
                                 System.out.println("Please Enter Administrator Age");
                                 a.age=sc.nextInt();
                                 System.out.println("Please Enter Administrator Address");
                                 a.Adress=sc.next();
                                 System.out.println("Please Enter Administrator PhoneNumber");
                                 a.phone=sc.nextInt();
                                 
                                 System.out.println("Please Enter Administrator Salary");
                                 a.salary = sc.nextDouble();
                                 System.out.println("Please Enter Administrators Deparment");
                                 
                                 storeadministrator.add(a);
                             }
                                else if(l == 2)
                                 {
                                    System.out.println("Please Enter Administrators ID");
                                    int id = sc.nextInt();
                                    for(int i=0;i<storeadministrator.size();i++)
                                    {
                                        administrator n =storeadministrator.get(i);
                                        if(n.id == id)
                                        {
                                            storeadministrator.remove(n);
                                            break;
                                        }
                                    }
                                     System.out.println("Administrators Information Has Removed");       
                                }
                                else if(l == 3)
                                {
                                    System.out.println("Please Enter Administrators ID");
                                    int id = sc.nextInt();
                                    boolean  ok =true;
                                    for(int i=0;i<storeadministrator.size();i++)
                                    {
                                        ok= true; 
                                        administrator n =storeadministrator.get(i);
                                        if(n.id == id)
                                        {
                                            System.out.println("ID : " + n.id);
                                            System.out.println("Name : " + n.name);
                                            System.out.println("AGE : " + n.age);
                                            System.out.println("Addres : " + n.Adress);
                                            System.out.println("PhoneNumber : " + n.phone);
                                            System.out.println("Salary : " + n.salary);           
                                            break;
                                        }
                                        else ok = false;

                                    }
                                        if (ok==false)
                                        {
                                            System.out.println(" Administrators Not Found");
                                        }
                                }
                            }
                                            if(x==5)
                                             {
                                                         System.out.println("To Add Technician Information Enter 1 \n" + "To Remove Technician Information Enter 2 \n" 
                                                         + "To Show Technician Information Enter 3 \n" + "To Edit Technician Information Enter 4 \n");
                                                  int l = input.nextInt();
                                                  if(l == 1)
                                               {
                                                   technician t = new technician();
                                                   System.out.println("Please Enter Technician ID");
                                                   t.id=sc.nextInt();
                                                   System.out.println("Please Enter Technician Name");
                                                   t.name=sc.next();
                                                   System.out.println("Please Enter Technician Age");
                                                   t.age=sc.nextInt();
                                                   System.out.println("Please Enter Technician Address");
                                                   t.Adress=sc.next();
                                                   System.out.println("Please Enter Technician PhoneNumber");
                                                   t.phone=sc.nextInt();
                                                   System.out.println("Please Enter Technician Salary");
                                                   t.salary = sc.nextDouble();
                                                   
                                                   
                                                   storetechnician.add(t);
                                               }
                                                  else if(l == 2)
                                                  {
                                                      System.out.println("Please Enter Technician ID");
                                                      int id = sc.nextInt();
                                                      for(int i=0;i<storetechnician.size();i++)
                                                      {
                                                          technician n =storetechnician.get(i);
                                                          if(n.id == id)
                                                          {
                                                              storetechnician.remove(n);
                                                              break;
                                                          }
                                                      }
                                                       System.out.println("Technician Has Removed");       
                                                  }
                                                  else if(l == 3)
                                                  {
                                                      System.out.println("Please Enter Technician ID");
                                                      int id = sc.nextInt();
                                                      boolean  ok =true;
                                                      for(int i=0;i<storetechnician.size();i++)
                                                      {
                                                          ok= true; 
                                                          technician n =storetechnician.get(i);
                                                          if(n.id == id)
                                                          {
                                                              System.out.println("ID : " + n.id);
                                                              System.out.println("Name : " + n.name);
                                                              System.out.println("AGE : " + n.age);
                                                              System.out.println("Addres : " + n.Adress);
                                                              System.out.println("PhoneNumber : " + n.phone);
                                                              System.out.println("Salary : " + n.salary);
                                                              
                                                              break;
                                                          }
                                                          else ok = false;

                                                      }
                                                      if (ok==false)
                                                      {
                                                          System.out.println(" Technician Not Found");
                                                      }
                                                  } 
                                             }
   
    if(x == 6)
      {
          System.out.println("To Add Student Information Enter 1 \n" + "To Remove Student Information Enter 2 \n" 
                                            + "To Show Student Information Enter 3 \n" + "To Edit Student Information Enter 4 \n");
          
          int l = input.nextInt();
            if(l == 1)
         {
              postgraduated s = new postgraduated();
             System.out.println("Please Enter Student ID");
             s.id=sc.nextInt();
             System.out.println("Please Enter Student Name");
             s.name=sc.next();
             System.out.println("Please Enter Student Age");
             s.age=sc.nextInt();
             System.out.println("Please Enter Student Address");
             s.Adress=sc.next();
             System.out.println("Please Enter Student PhoneNumber");
             s.phone=sc.nextInt();
             System.out.println("Please Enter Student GPA");
             s.gpa=sc.nextDouble();
            
          storepostgraduated.add(s);
         }
            else if(l == 2)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                for(int i=0;i<storepostgraduated.size();i++)
                {
                  postgraduated  n =storepostgraduated.get(i);
                    if(n.id == id)
                    {
                       storepostgraduated.remove(n);
                        break;
                    }
                }
                 System.out.println("Student Information Has Removed");       
            }
        
          else if(l == 3)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                boolean  ok =true;
                for(int i=0;i< storepostgraduated.size();i++)
                {
                    ok= true; 
                     postgraduated n = storepostgraduated.get(i);
                    if(n.id == id)
                    {
                       /* System.out.println("ID : " + n.id);
                        System.out.println("Name : " + n.name);
                        System.out.println("AGE : " + n.age);
                        System.out.println("Addres : " + n.Adress);
                        System.out.println("PhoneNumber : " + n.phone);
                        System.out.println("GPA : " + n.gpa);
                        System.out.println("Level : " + n.level); */
                        n.printing();
                        
                        
                        
                        break;
                    }
                    else ok = false;

                }
                if (ok==false)
                {
                    System.out.println(" Student Not Found");
                }
            }
        
        
   
   
         
    }
      if(x == 7)
      {
          System.out.println("To Add Student Information Enter 1 \n" + "To Remove Student Information Enter 2 \n" 
                                            + "To Show Student Information Enter 3 \n" + "To Edit Student Information Enter 4 \n");
          
          int l = input.nextInt();
            if(l == 1)
         {
              graduated s = new graduated();
             System.out.println("Please Enter Student ID");
             s.id=sc.nextInt();
             System.out.println("Please Enter Student Name");
             s.name=sc.next();
             System.out.println("Please Enter Student Age");
             s.age=sc.nextInt();
             System.out.println("Please Enter Student Address");
             s.Adress=sc.next();
             System.out.println("Please Enter Student PhoneNumber");
             s.phone=sc.nextInt();
             System.out.println("Please Enter Student GPA");
             s.gpa=sc.nextDouble();
            
          storegraduated.add(s);
         }
            else if(l == 2)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                for(int i=0;i<storegraduated.size();i++)
                {
                  graduated  n =storegraduated.get(i);
                    if(n.id == id)
                    {
                       storegraduated.remove(n);
                        break;
                    }
                }
                 System.out.println("Student Information Has Removed");       
            }
        
          else if(l == 3)
            {
                System.out.println("Please Enter Student ID");
                int id = sc.nextInt();
                boolean  ok =true;
                for(int i=0;i< storegraduated.size();i++)
                {
                    ok= true; 
                     graduated n = storegraduated.get(i);
                    if(n.id == id)
                    {
                       /* System.out.println("ID : " + n.id);
                        System.out.println("Name : " + n.name);
                        System.out.println("AGE : " + n.age);
                        System.out.println("Addres : " + n.Adress);
                        System.out.println("PhoneNumber : " + n.phone);
                        System.out.println("GPA : " + n.gpa);
                        System.out.println("Level : " + n.level); */
                        n.printing();
                        
                        
                        
                        break;
                    }
                    else ok = false;

                }
                if (ok==false)
                {
                    System.out.println(" Student Not Found");
                }
            }
        
        
   
   
         
    }
   System.out.println("To Continue Enter 1 \n" + "To End The Programe Enter 0 \n");
int con = input.nextInt();             
if(con == 0)
   break ;
    }
                                 

       
    }
    } 


    
