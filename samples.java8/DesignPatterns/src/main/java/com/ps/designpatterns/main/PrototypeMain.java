package com.ps.designpatterns.main;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import com.ps.designpatterns.domain.Product;
import com.ps.designpatterns.domain.ProductList;
import com.ps.designpatterns.domain.ProductRegistry;

public class PrototypeMain {

	
	//Avoid Costly creation
	//Avoid subclassing
	//Dont use key word new
	//Often utilizes and interface
	//Usually implemented with a Registry
	//Uses/ implements java.lang.Object#clone() 
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		ProductRegistry reg = new ProductRegistry();
		
		
		Product prod= reg.createItem("FORWARD");
		prod.setProductCode("COMMFORWARD");
		prod.setDescription("Commodity Forward product");

		System.out.print(prod);
		
	}

}
