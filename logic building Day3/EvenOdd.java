package haha;
import java.util.*;
public class EvenOdd{
	//isEven function
	public static int   isEven(int num){
		if(num%2==0) {
			return 2;
		}
		else 
		return 1;
	}
	//isOdd function
	public static int isOdd(int num1) {
		if(num1%2!=0) {
			return 2;
		}
		else
			return 1;
	}
	public static void main(String [] args) {
		int num,num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check the num is even");
		num=sc.nextInt();
		System.out.println("enter the number to check the num is odd");
		num1=sc.nextInt();
		System.out.println("Even number is:"+isEven(num));
		System.out.println("Odd number is:"+isOdd(num1));
		
	}
	}


