



import java.util.Scanner;

public class sec {

	public static int[] variable (int[]z,int target)
	{
		int[]e=new int [2];
		for(int i=0;i<z.length;i++){
			for (int j=i;j<z.length;j++){
				if(z[i]+z[j]==target){
					e[0]=i; e[1]=j;
					
				}
			}
		}
		return e;
	}
	public static void main(String[] args) {
		
		int [] arr = {30,40,70,90};
		int []  res = variable(arr,100);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}

