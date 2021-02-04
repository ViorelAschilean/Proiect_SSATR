/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemente_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

        
public class Senzor {
 
	private long cnp;
	private String name;
 
	Senzor(String name, long cnp){
		this.name = name;
		this.cnp = cnp;
	}
 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Senzor){
			Senzor p = (Senzor)obj;
			return cnp == p.cnp;
		}
		return false;
	}
 
	public static void main(String[] args) {
		Senzor p1 = new Senzor("Alin",12345);
		Senzor p2 = new Senzor("Dan",12345);
		if(p1.equals(p2))
			System.out.println(p1+" and "+p2+ " are equals");
		else
			System.out.println(p1+" and "+p2+ " are NOT equals");
 
		if(p1==p2) //GRESIT !
			System.out.println(p1+" and "+p2+ " are equals");
		else
			System.out.println(p1+" and "+p2+ " are NOT equals");
 
		//Comparare stringuri
		if(p1.name.equals(p2.name))
			System.out.println(p1+" and "+p2+" have the same names");
		else
			System.out.println(p1+" and "+p2+" have different names");
		}
	}