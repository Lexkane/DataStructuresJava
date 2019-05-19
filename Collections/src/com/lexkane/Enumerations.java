package com.lexkane;
import java.util.Vector;
import java.util.Enumeration;

public class Enumerations {

	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for (int i =0;i<10;i++) {
			v.addElement(i);
		}
		
		
		System.out.println(v);
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements()) {
			int i=(Integer) e.nextElement();
			System.out.println(i +" ");
		}
		
		
		
	}
}
