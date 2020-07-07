package testcases;

import org.testng.annotations.Test;

public class samplethree {
	
	
	String firstname = "SD";
	String lastname = "ET";

	@Test
	public void arraylooping() {
		
		String[] cars = {"volvo","bmw","benz","nissan"};
		
		for (String x : cars ) {
			System.out.println(x);
			if (x == "benz") {
				break;
			}
		}
	}
	
	@Test(groups= {"Smoke"})
	public void javatwodimensionalarray() {
		
		int[][] mynumbers = {{1,2,3,4},{5,6,7}};
		
		for (int i = 0; i<mynumbers.length; i++) {
			System.out.println(i);
		}
	}
	
	
	@Test(groups= {"Smoke"})
	public void javaconcat() {
		String fullname = firstname + lastname;
		System.out.println(fullname);
	}
	
	@Test
	public void javawhile() {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}
	
	@Test
	public void javadowhile() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 7);
		
	}
	
	@Test
	public void javaswitch() {
	   int day = 4;
	   switch(day) {
	   case 1:
		   System.out.println("monday");
		   break;
	   case 2:
		   System.out.println("tuesday");
		   break;
	   case 3:
		   System.out.println("wednesday");
		   break;
	   case 4:
		   System.out.println("thursday");
		   break;
	}
	
}}
