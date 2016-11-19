package hw;
import java.util.*;
public class hw04_105021013 {
/*讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int sum = 1;
       int i = n;
       while(n>0){
    	   sum = i*sum;
    	   i = i-1;
       }
       System.out.println(sum);
	}

}
