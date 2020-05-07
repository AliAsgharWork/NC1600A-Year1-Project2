package Extra;
import java.util.ArrayList;

public class reg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] binnum = new int[6];
		int decinum=10;
		int i = 1;
		
		
		 while(decinum != 0)
	      {
			  System.out.println(decinum);
	          binnum[i++] = decinum%2;
	          decinum = decinum/2;
	          
	      }
		 
		 System.out.println(" ");
		 
		 for (int j = 0; j < binnum.length; j++) 
			{System.out.println(binnum[j]);}
		 
		 System.out.println(" ");
		 
		 System.out.println(binnum[1]);
		 System.out.println(binnum[2]);
		 System.out.println(binnum[3]);
		 System.out.println(binnum[4]);
		 
		 System.out.println(" ");
		 
		 ArrayList<Integer> display = new ArrayList<Integer>(); 
		 int x ;
		 for( x=i-1 ; x>0 ;x--)
	      {
	      	display.add(binnum[x]);
	        System.out.println(x);
	      }
		 
		 System.out.println(" ");
		 
		 String y = "12a";
		 String hexaDecibase = "0123456789ABCDEF";
         y = y.toUpperCase();
         int val = 0;
         for (int ix = 0; ix < y.length(); ix++)
         	{
       	  	char cha = y.charAt(ix);
       	  	int d = hexaDecibase.indexOf(cha);
       	  	val = 16*val + d;  
       	  	
       	  	System.out.println(d);
         	}
		 
		 
	}

}
