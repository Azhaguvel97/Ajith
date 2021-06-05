package org.univ;

public class College extends University {
	// its is used to know abt the college info
public void ug() {
System.out.println("UG is B.E");	
}
public void pg() {
	System.out.println("PG is M.E");
}
	public void ag(){
	}
public static void main(String[] args) {
	College c=new College();
	c.ug();
	c.pg();
}
}
