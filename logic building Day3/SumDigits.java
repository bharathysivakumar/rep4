package haha;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,m,sum=0;
		n=sc.nextInt();
		m=sc.nextInt();
		n=n%10;
		m=m%10;
		
		if(n<0)
			n=(n-1);
		if(m<0)
			m=(m-1);
		System.out.println(m+n);
	}
}

	


