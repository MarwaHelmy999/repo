import java .util.Scanner;

public class Test2 {
	

	public static void main(String[] args) {
		

	String result="";  int x=1235 ; String str="";
			
		  while(x>0){
				  
	    char c=(char)((x%10)+'0');
				
         result = c+result;

		x=x/10;
			
			  }
			System.out.println(result);
			
	}
}
