// Example for PPT page No.26

import java.util.Scanner;

public class DisposableIncome {
	/** Main method */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// 提示用户输入月收入
		System.out.print("请输入每月收入（元）:");
		double monthlyIncome=input.nextDouble();
		
		// 可支配收入 = 月收入 - 日常消费 - 房贷 - 车贷 - 其他消费贷款
		double disposableIncome=monthlyIncome-DailyExpenses()-HouseLoan()-CarLoan()-ConsumerLoan();
		
		System.out.printf("每月可支配的收入为：%.2f", disposableIncome);
	}
	
	/** 计算日常消费 */
	public static double DailyExpenses() {
		System.out.println();
		System.out.println("计算日常消费......");
		
		Scanner input=new Scanner(System.in);
		System.out.print("每月吃饭花费：");
		double mealCost=input.nextDouble();
		
		System.out.print("每月出行花费：");
		double travleExpenses=input.nextDouble();
		
		System.out.print("每月通讯花费：");
		double communicationCost=input.nextDouble();
		
		System.out.print("每月其他日常花费：");
		double otherExpenses=input.nextDouble();
		
		double dailyExpenses=mealCost+travleExpenses+communicationCost+otherExpenses;
		return dailyExpenses;
	}
	
	/** 计算住房贷款还款额度 */
	public static double HouseLoan() {
		// 分别调用公积金和商业贷款还款额度计算的方法
		return ProvidentFund()+CommercialLoan();
	}
	
	/** 计算住房公积金贷款还款额度 */
	public static double ProvidentFund() {
		System.out.println();
		Scanner input=new Scanner(System.in);

		System.out.print("是否有住房公积金贷款(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("住房公积金");
		}
		return payment;
	}
	
	/** 计算住房商业贷款还款额度 */
	public static double CommercialLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("是否有住房商业贷款(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("住房商业");
		}
		return payment;
	}
	
	/** 计算汽车贷款还款额度 */
	public static double CarLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("是否有汽车贷款(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("汽车");
		}
		return payment;
	}
	
	/** 计算其他消费贷款还款额度 */
	public static double ConsumerLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("是否有其他消费贷款(1-yes,0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("其他消费");
		}
		return payment;
	}
	
	/** 利用等额本息法计算还款额度 */
	public static double monthlyPayment(String s) {
		System.out.println("正在计算"+s+"贷款还款额度......");
		
		Scanner input=new Scanner(System.in);
		System.out.print(s+"贷款金额：");
		double loanAmongt=input.nextDouble();

		System.out.print(s+"贷款年限(年)：");
		int year=input.nextInt();
		int month=year*12;
		
		System.out.print(s+"贷款年利率(%)：");
		double annualInterestRate=input.nextDouble()*0.01;
		double monthlyInterestRate=annualInterestRate/12.;
		
		double monthlyPayment=loanAmongt*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,month));
		System.out.printf("%s贷款每月还本付息额应为：%.2f\n",s,monthlyPayment);

		return monthlyPayment;		
	}
}