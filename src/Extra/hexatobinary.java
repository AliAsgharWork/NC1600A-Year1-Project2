package Extra;

import java.util.ArrayList;
import java.util.Scanner;
	public class hexatobinary {
	    
	    public static void main(String args[])
	    {
	    	
	    	//Inputs
	        String hexdecinum;
	        //Just adding this comment to check the github page 
	        
	        int decinum;
	        int i=1;
	        int x;
	        int binnum[] = new int[100];
	        ArrayList<Integer> display = new ArrayList<Integer>(); 
	        //
	        System.out.print("Enter Your Hexadecimal Number : ");
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        hexdecinum = scan.nextLine();
	        
	        /* Converting hexadecimal to decimal */        
	        decinum = hexatodeci(hexdecinum);
	        
	        /* Converting decimal to binary */        
	        while(decinum != 0)
	        {
	            binnum[i++] = decinum%2;
	            decinum = decinum/2;
	           
	        }
			
	        System.out.print("The Binary Number is: ");
	        
	        for( x=i-1 ; x>0 ;x--)
	        {
	        	display.add(binnum[x]);
	           
	        }
	       
	        StringBuilder sb = new StringBuilder();
	        for (int s : display)
	        {
	            sb.append(s);
	        }

	        System.out.println(sb.toString());
	        
	        System.out.print("\n");
	    } 
	    
	    
	    public static int hexatodeci(String y)
	    {
	             String hexaDecibase = "0123456789ABCDEF";
	             y = y.toUpperCase();//change the Characters to Uppercase
	             int val = 0;
	             for (int i = 0; i < y.length(); i++)
	             {
	                 char c = y.charAt(i);
	                 int d = hexaDecibase.indexOf(c);
	                 val = 16*val + d;
	                 
	             }
	             System.out.println("The Decimal Number is: "+val);
	             return val;
	    }
	}