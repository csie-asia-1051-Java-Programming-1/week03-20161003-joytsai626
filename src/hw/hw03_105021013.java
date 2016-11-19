package hw;
import java.util.*;
public class hw03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int sum = 1;
       for(int i=n;i>0;i--){
    	  sum = i*sum;
       }
       System.out.println(sum);
	}

}
