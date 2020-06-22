package haha;
import java.util.*;
public class LastDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int n,m=0;
	 n = sc.nextInt();
	 m=n%10;
	 if(m<0)
	 {
		 System.out.println(~(m-1));
	 }
	 else
	 
	 System.out.println(m);

}
}