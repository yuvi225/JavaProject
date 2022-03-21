package tamilnadu.chennai;

import java.util.Scanner;

public class PracticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticePrograms pp = new PracticePrograms();

		pp.bus();

		pp.train();
		pp.printnum1();
		pp.printnum2();
		pp.printnum3();
		pp.printnum4();
		pp.printpower2();
		pp.printpower3();
		pp.printpower4();

		pp.numpattern1();

		pp.numpattern2();

		pp.numpattern3();
		pp.numpattern4();
		pp.numpattern5();

		pp.train();

	}

	public void train() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell me amount of your ticket per day");
		int amount = sc.nextInt();
		int amountPerMonth = 30 * amount;
		String seasonticket = "Yes";
		System.out.println(amountPerMonth);
		System.out.println("Do you have any season ticket?");
		String st = sc.next();
		if (st.equalsIgnoreCase(seasonticket)) {
			System.out.println("What is the amount for 3 months?");
			int stAmount = sc.nextInt();
			int profit = amountPerMonth - stAmount;
			System.out.println("Profit amount is: " + profit);
			int profitPercntage = (profit * 100) / amountPerMonth;
			System.out.println("Profit percentage is :" + profitPercntage);
		}
	}

	public void numpattern1() {
		// TODO Auto-generated method stub
		int no = 123456;
		while (no > 0) {
			System.out.println(no % 100);
			no = no / 100;
		}
	}

	public void numpattern2() {
		// TODO Auto-generated method stub
		int no = 123456;
		while (no > 0) {
			System.out.println(no % 10);
			no = no / 10;
		}
	}

	public void numpattern3() {
		// TODO Auto-generated method stub
		int no = 123456;
		while (no > 1) {

			System.out.println(no % 100);
			no = no / 10;

		}
	}

	public void numpattern4() {
		// TODO Auto-generated method stub
		int no = 123456;
		while (no > 1) {

			System.out.println(no % 1000);
			no = no / 10;

		}
	}

	public void numpattern5() {
		// TODO Auto-generated method stub
		int no = 123456;
		int count = 0;
		int addition = 0;
		while (no > 0) {

			System.out.println(no % 10);
			addition = addition + no % 10;
			no = no / 100;
			count++;
		}
		System.out.println("No of Digits: " + count);
		System.out.println("Addition of Digits:" + addition);
	}

	public void printpower2() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			double value = Math.pow(no, 2);
			System.out.println(value);
			no++;
		}
	}

	public void printpower3() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			double value = Math.pow(no, 3);
			System.out.println(value);
			no++;
		}
	}

	public void printpower4() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			double value = Math.pow(no, 4);
			System.out.println(value);
			no++;
		}
	}

	public void printnum1() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {

			System.out.println(no * 1 + " ");
			no++;
		}
	}

	public void printnum2() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {

			System.out.println(no * 2 + " ");
			no++;
		}
	}

	public void printnum3() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			System.out.println(no * 3 + " ");
			no++;
		}
	}

	public void printnum4() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			System.out.println(no * 4 + " ");
			no++;
		}
	}

	public void bus() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you going in bus?");
		boolean bus = sc.nextBoolean();

		if (bus == true) {
			System.out.println("cost for city bus:");
			int costcity = sc.nextInt();
			System.out.println("cost for mofussil bus:");
			int codtmof = sc.nextInt();
			System.out.println("How many working days?");
			int workingDays = sc.nextInt();
			System.out.println("Cost for city bus " + workingDays * costcity);
			System.out.println("Cost for mofussil bus " + workingDays * codtmof);

		} else {
			System.out.println("No I am not going in bus");
		}

	}

}
