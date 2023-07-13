/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

/**
 *
 * @a.
 */
public abstract class person {

        //class without ihertance
	String name;
	int age;
	int phone;
	int id;
	String Adress;
	String email;
        public person(){};//
        //n=name,agee=age,ph=phone,idd=id,adresss=address,e=email
        public person(String n,int agee,int ph,int idd,String adresss,String e ) {
		name=n;
		age=agee;
		id=idd;
		Adress=adresss;
		email=e;
	}
//methodes set and get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    
  public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" + "Name => " + name + ", Age => " + age + ", Phone => " + phone + ", id => " + id + ", Adress => " + Adress + ", email => " + email + '}';
    }

    
    public void printing() {
        System.out.println( );
    }
	
    
  
    
}
