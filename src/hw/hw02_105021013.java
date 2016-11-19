package hw;
import java.util.*;
public class hw02_105021013 {
/*讓使用者輸入多個數，統計正數、負數及零各有多少個。
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請問要輸入幾個數:");
		int a = scn.nextInt();
		System.out.println("請輸入"+ a +"個數:");
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		for(int i=1;i<=a;i++){
			int b = scn.nextInt();
			if(b>0){
				v1++;
			}else if(b == 0){
				v2++;
			}else{
				v3++;
			}
		}
		System.out.println("正數"+v1+"個");
		System.out.println("零"+v2+"個");
		System.out.println("負數"+v3+"個");
	}

}
