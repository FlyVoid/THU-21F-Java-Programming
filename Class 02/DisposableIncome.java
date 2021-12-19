// Example for PPT page No.26

import java.util.Scanner;

public class DisposableIncome {
	/** Main method */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// ��ʾ�û�����������
		System.out.print("������ÿ�����루Ԫ��:");
		double monthlyIncome=input.nextDouble();
		
		// ��֧������ = ������ - �ճ����� - ���� - ���� - �������Ѵ���
		double disposableIncome=monthlyIncome-DailyExpenses()-HouseLoan()-CarLoan()-ConsumerLoan();
		
		System.out.printf("ÿ�¿�֧�������Ϊ��%.2f", disposableIncome);
	}
	
	/** �����ճ����� */
	public static double DailyExpenses() {
		System.out.println();
		System.out.println("�����ճ�����......");
		
		Scanner input=new Scanner(System.in);
		System.out.print("ÿ�³Է����ѣ�");
		double mealCost=input.nextDouble();
		
		System.out.print("ÿ�³��л��ѣ�");
		double travleExpenses=input.nextDouble();
		
		System.out.print("ÿ��ͨѶ���ѣ�");
		double communicationCost=input.nextDouble();
		
		System.out.print("ÿ�������ճ����ѣ�");
		double otherExpenses=input.nextDouble();
		
		double dailyExpenses=mealCost+travleExpenses+communicationCost+otherExpenses;
		return dailyExpenses;
	}
	
	/** ����ס��������� */
	public static double HouseLoan() {
		// �ֱ���ù��������ҵ������ȼ���ķ���
		return ProvidentFund()+CommercialLoan();
	}
	
	/** ����ס�������������� */
	public static double ProvidentFund() {
		System.out.println();
		Scanner input=new Scanner(System.in);

		System.out.print("�Ƿ���ס�����������(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("ס��������");
		}
		return payment;
	}
	
	/** ����ס����ҵ������� */
	public static double CommercialLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("�Ƿ���ס����ҵ����(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("ס����ҵ");
		}
		return payment;
	}
	
	/** ��������������� */
	public static double CarLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("�Ƿ�����������(1-yes, 0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("����");
		}
		return payment;
	}
	
	/** �����������Ѵ������ */
	public static double ConsumerLoan() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		
		System.out.print("�Ƿ����������Ѵ���(1-yes,0-no)?");
		int answer=input.nextInt();
		
		double payment=0;
		if (answer==1) {
			payment=monthlyPayment("��������");
		}
		return payment;
	}
	
	/** ���õȶϢ�����㻹���� */
	public static double monthlyPayment(String s) {
		System.out.println("���ڼ���"+s+"�������......");
		
		Scanner input=new Scanner(System.in);
		System.out.print(s+"�����");
		double loanAmongt=input.nextDouble();

		System.out.print(s+"��������(��)��");
		int year=input.nextInt();
		int month=year*12;
		
		System.out.print(s+"����������(%)��");
		double annualInterestRate=input.nextDouble()*0.01;
		double monthlyInterestRate=annualInterestRate/12.;
		
		double monthlyPayment=loanAmongt*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,month));
		System.out.printf("%s����ÿ�»�����Ϣ��ӦΪ��%.2f\n",s,monthlyPayment);

		return monthlyPayment;		
	}
}