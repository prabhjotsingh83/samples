package com.ps.designpatterns.main;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.*;

public class AbstractFactoryMain {

	
	//Factory of Factories
	//Factory of related object
	//Common Interface
	//Defer to subclasses
	//Composition
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		String xmlStr = "<test>abc</test>";
		ByteArrayInputStream bais = new ByteArrayInputStream (xmlStr.getBytes());  
		
		DocumentBuilderFactory dbabstractfactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder dbf = dbabstractfactory.newDocumentBuilder();
		
		Document doc =dbf.parse(bais);
		
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		
		System.out.println(dbabstractfactory.getClass());
		System.out.println(dbf.getClass());
		
	}

}
