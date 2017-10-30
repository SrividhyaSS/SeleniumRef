package demopackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexr
{

	public static void main (String args[])
	{
		String pattern="(\\D*)(\\d+)(\\D*) (\\d+)";
		String text="There are 365 days on earth! from day 1!";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(text);
		if (m.find()) {
		    System.out.println(m.group(0));
		    System.out.println(m.group(1));
		    System.out.println(m.group(2));
		    System.out.println(m.group(3));
		    System.out.println(m.group(4));
		 
		    	      String sampleString = "Cat  Dog    Elephant     Fox";
		    	      String[] animals = sampleString.split("\\s+");
		    	      int animalIndex = 1;
		    	      for (String animal : animals) {
		    	         System.out.println(animalIndex + ". " + animal);
		    	         animalIndex++;
		    	      }
		    	   }

		String str = "abc$def^ghi#jkl";
		 
	      Pattern p1 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	      Matcher m1 = p1.matcher(str);
	   
	      int count = 0;
	      while (m1.find()){
	         count = count+1;
	        // System.out.println("position "  + m1.start() + ": " + str.charAt(m1.start()));
	      }
	      System.out.println("There are " + count + " special characters");
	   }
	
		}





