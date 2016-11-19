package hw;
import java.util.*;
public class hw01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數:");
		long a = scn.nextLong();
		int b = 0;
		while (a > 0) {
			b++;
			a = a / 10;
		}
		System.out.println("此數為"+ b +"位數");
	}

}
