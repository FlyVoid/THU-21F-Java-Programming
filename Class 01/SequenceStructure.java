// Example for PPT page No.54

import java.util.Scanner;

public class SequenceStructure {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);				//定义输入来源(对象)
		System.out.print("Input an integer: ");				//显示提示文字
		int k=input.nextInt();								//输入数据
		int s=k*k;											//计算平方值
		System.out.println("The square of "+k+" is: "+s);	//输出结果
	}
}