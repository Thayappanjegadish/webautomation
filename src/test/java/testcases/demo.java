package testcases;

import org.openqa.selenium.By;

public class demo {
	
	public static void main (String[] args) {
		String[] locators = {"ID","NAME","CLASSNAME","XPATH","LINK TEXT","PARTIAL LINK TEXT","TAGNAME","CSS SELECTOR"};

		for (String i :locators) {
			System.out.println(i);
		}	
				}
	}


