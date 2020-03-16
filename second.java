package second;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
	int[]a={1,2,3,4,5,10,11};               int[] b= {1,5,6,7,8,9};          int[]r=new int[a.length +b.length];
	int aindex=0;        int bindex=0;         int rindex=0;
	while(aindex<a.length &&bindex<b.length){
		if(a[aindex]<=b[bindex]){
			r[rindex]=a[aindex];
			aindex++;
		}
		else{r[rindex]=b[bindex];
		bindex++;           
				}
		rindex++;
		
	}
	while(aindex==a.length && bindex<b.length)
	{
		r[rindex]=b[bindex];
				bindex++;
				rindex++;
	}while(bindex==b.length && aindex<a.length)
	{
		r[rindex]=a[aindex];
				aindex++;
				rindex++;
	}
	
	a=new int[a.length+b.length];
	a = (int[])r.clone();
	System.out.println(a.length);
	
	for(int i=0;i<a.length;i++){System.out.println(a[i]);}
	
			}
}

