package yatrapages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PortRun {
	
	static int n;


	static List<Port> li =new ArrayList<Port>();


	public static void main(String[] args) throws IOException 
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(in);
	System.out.println("Enter the number of port details");
		n=sc.nextInt();
		String s[]= new String[n];
		System.out.println("Enter the port details");
		String portdetails[][]= new String[n][3];
		for(int i=0;i<n;i++)
		{
		s[i]=br.readLine();
		portdetails[i]= s[i].split(",");
		}
		Port port;
		for(int j=0;j<n;j++)
		{
			
	    port = new Port(Integer.valueOf(portdetails[j][0]),portdetails[j][1],portdetails[j][2]);
		li.add(port);
		}
		
		
		for(Port obj:li)
			
		{
		
			System.out.println(obj);
		}


	}

}
