package com.myLet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

import java.io.PrintWriter;


import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.ServletException;


import javax.servlet.annotation.WebServlet;


import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;




@SuppressWarnings("unused")
@WebServlet("/myLet")


public class myLet extends HttpServlet 
{    

	private static final long serialVersionUID = 1;



	public myLet() {


		super();


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Inputs
        String hexdecinum;
        int altdecinum;
        int decinum;
        int i=1;
        int x;
        int idx;
        int binnum[] = new int[100];
        ArrayList<Integer> display = new ArrayList<Integer>(); 
        
      
        hexdecinum = request.getParameter("s_Number");
         
        
        int nameLgh = hexdecinum.length();
    	char[] inputnumber = new char[nameLgh]; 

        // Get the index 
        for (idx = 0;idx < nameLgh;idx++)
        { 
            inputnumber [idx] = hexdecinum.charAt(idx);    
        }
        
      for (int check=0; check < inputnumber.length;check++) 
        	
       {
        
        if( (inputnumber[check] >=48  && inputnumber[check] <= 57) || (inputnumber[check] >= 65  && inputnumber[check] <= 70)||(inputnumber[check]>=97&& inputnumber[check]<= 102) )
        {
        	
        	{
        		if(check ==  inputnumber.length-1)
        	      {
	        	      // Converting hexadecimal to decimal         
	        	      
        			  decinum = hexatodeci(hexdecinum);
	        	      altdecinum=decinum;
	        	      
	        	      // Converting decimal to binary      
	        	
	        	      while(decinum != 0)
	        	      {
	        	          binnum[i++] = decinum%2;
	        	          decinum = decinum/2;
	        	      }
	        	
	        	      //The Binary Number is stored here
	        	      //Making sure that the values entered are starting from the index "0" and inverting the array to make up the binary number
	        	      for( x=i-1 ; x>0 ;x--)
	        	      {
	        	      	display.add(binnum[x]);
	        	         
	        	      }
	        	     
	        	      //from array into string
	        	      StringBuilder sb = new StringBuilder();
	        	 
	        	      
	        	      for(int s=0; s < display.size(); s++)
	        	      {
	        	          int p = display.get(s);
	        	          sb.append(p);
	        	      }
	        	      
	        	      String bnum =sb.toString();    
	        	      
	        	      
	        	      
	        	      
	        	      response.getWriter().append("The Decimal Number is: " + altdecinum + "," + "The Binary Number is: " + bnum);
        	      }
        	      
        	     
        	}
		} 
        	
		else{    	 
			response.getWriter().append(hexdecinum + " is not a valid input" + "," + " ERROR: " );    	 	
			break;
			}
		
       }
      
      
      
     
        
        doGet(request, response);
		
		

        	


	}

	public static int hexatodeci(String y)
    {
          String hexaDecibase = "0123456789ABCDEF";
          y = y.toUpperCase();
          int val = 0;
          for (int i = 0; i < y.length(); i++)
          	{
        	  	char cha = y.charAt(i);
        	  	int d = hexaDecibase.indexOf(cha);
        	  	val = 16*val + d;  
          	}
          return val;
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	
	}



}