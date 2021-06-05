package org.univ;

public class College extends University {
public void ug() {
System.out.println("UG is B.E");	
}
public void pg() {
	System.out.println("PG is M.E");
}
public static void main(String[] args) {
	College c=new College();
	c.ug();
	c.pg();
}
}
