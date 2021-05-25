package prac;

import java.util.Scanner;

public class ChangeCalc {

	public int randomPrice() {
		return (int)(Math.random() * 100000) * 10;
	}
	
	
	public void initPrint(int price, String status) {
		if(status == "init") {
			System.out.println("가격 \t=\t" + price);
		} else {
			System.out.println(price + "원 더 내야댐");
		}
		System.out.print("지불 \t=\t");
	}
	
	
	public void changePrint(int[] changeResult, int[] coinUnit) {
		
		System.out.println("");
		System.out.println("");
		System.out.println("거스름 돈");
		
		for(int i = 0 ; i < changeResult.length ; i++) {
			if(changeResult[i] != 0) {
				System.out.println(coinUnit[i] + "원\t : \t" + changeResult[i] + "\t개");	
			}
		}
		System.out.print("계속할 거?(y/n) : ");
	}
	
	
	public static void main(String[] args) {

		ChangeCalc classInstance = new ChangeCalc();
		
		String controller = "y";
		int inputPay = 0;
		int price = classInstance.randomPrice(); 
		String printStatus = "init";
		
		int[] coinUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] changeResult = new int[coinUnit.length];
		
		Scanner scanner = new Scanner(System.in);
		
		while(controller.equals("y")) {
			
			classInstance.initPrint(price, printStatus);
		
			inputPay = scanner.nextInt();
			
			int change = inputPay - price;
			
			if(change < 0) {
				price = price - inputPay;
				printStatus = "";
				continue;
			}
			
			for(int i = 0 ; i < coinUnit.length ; i++) {
				changeResult[i] = change / coinUnit[i];
				change = change % coinUnit[i];
			}
			
			classInstance.changePrint(changeResult, coinUnit);
			controller = scanner.next();
			
			if(controller.equals("y")) {
				price = classInstance.randomPrice();
				printStatus = "init";
			} else if(controller.equals("n")) {
				System.out.println("");
				System.out.print("잘 가~");
			}
		}
	}
}
