package Extra;
//
//public class yfu {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		package com.Servlet;
//
//		import java.io.IOException;
//
//		import javax.servlet.ServletException;
//		import javax.servlet.annotation.WebServlet;
//		import javax.servlet.http.HttpServlet;
//		import javax.servlet.http.HttpServletRequest;
//		import javax.servlet.http.HttpServletResponse;
//
//		/*
//		  Servlet implementation class Mylet
//		 */
//		@WebServlet("/Collection")
//		public class Collection extends HttpServlet {
//			private static final long serialVersionUID = 1L;
//		       
//		    /*
//		      @see HttpServlet#HttpServlet()
//		     */
//		    public Collection(){
//		        super();
//		        // TODO Auto-generated constructor stub
//		    }
//
//			/**
//			 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//			 */
//			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				// TODO Auto-generated method stub
//				
//			}
//
//			/**
//			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//			 */
//			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				// TODO Auto-generated method stub
//				
//				
//				
//				
//				
//
//				
//					try {
//						String check=request.getParameter("s_Number");
//
//						 int nameLength = check.length();
//					    	char[] myNums = new char[nameLength]; 
//
//					        // Get the index 
//					        for (int i =0; i<nameLength; i++)
//					        { 
//					            myNums [i] = getCharFromString(check, i);
//					        }
//					        
//					        for (int j = 0; j < myNums.length; j++) {
//					            if( (myNums[j] >= 'a' && myNums[j] <= 'z') || (myNums[j] >= 'A' && myNums[j] <= 'Z')||(myNums[j]>='!'&& myNums[j]<= '/') || (myNums[j]>=':'&& myNums[j]<= '@')||(myNums[j]>='['&& myNums[j]<= '_')||(myNums[j]>='{'&& myNums[j]<= ' ')||( myNums[j] == 32 ))
//					            {
//					            	response.getWriter().append(myNums[j]+ "is not a number");
//					            }
//					            else
//					            {
//					            	
//					            	 int decimal = Integer.parseInt(check);
//					            	String hexadecimal = "";
//					        		
//					        		while (decimal!=0)
//					        		{
//					        			int hexValue = decimal % 16;
//					        			char hexChar;
//					        			if(hexValue <=9 && hexValue >=0)
//					        			{
//					        				hexChar = (char)(hexValue + '0');
//					        			}			
//					        			else
//					        			{
//					        				hexChar = (char)(hexValue - 10 + 'A');
//					        			}
//					        			hexadecimal = hexChar + hexadecimal;
//					        			decimal = decimal/16;
//					        		}
//					        		
//					        		
//					        		
//					        		response.getWriter().append("the Hexadecimal number is  " + hexadecimal );
//					        	}
//					        		
//
//					        		
//					        		String Octadecimal = "";
//					    	        int decimal1 = Integer.parseInt(check);
//
//					        		
//					        		while (decimal1>0)
//					        		{
//					        			int hexValue2 = decimal1 % 8;
//					        			char hexChar;		
//					        				hexChar = (char)(hexValue2 + '0');
//					        				Octadecimal = hexChar + Octadecimal;
//					        			decimal1 = decimal1/8;
//					        		}
//					        		
//					        		response.getWriter().append("the Octadecimal number is  " + Octadecimal );
//					        		
//
//					            }
//						
//						} catch (Exception e) 
//							{
//						       e.printStackTrace();
//							}
//				
//				doGet(request, response);}
//			
//			        
//			        
//		//Function to get the specific character 
//
//		public static char
//		getCharFromString(String str, int index) 
//		{ 
//		    return str.charAt(index); 
//		}
//		}
//	}
//
//}
