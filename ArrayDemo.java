package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
		// System.out.println(args.length);
		// ad.printArray2();
		// ad.moveleft();
		// ad.moveright();
		 //ad.findMax();
	//	ad.moveUsing2Temp();
		ad.moveUsing1Temp();
	}

	public void printArray() {
		// TODO Auto-generated method stub
		int[] marks = { 90, 67, 34, 78, 90 };
		int total = 0;
		for (int i = 4; i >= 0; i--) {
			total = total + marks[i];
			// System.out.println();
		}
		System.out.println(total);
		System.out.println(total / 5);
	}

	public void printArray1() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of sub");
		int count = sc.nextInt();
		int[] marks = new int[count];
		System.out.println(marks.length);

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter mrks");
			marks[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(marks[i]);
		}
	}

	public void printArray2() {
		int[] ar = new int[5];
		ar[0] = 90;
		ar[1] = 89;
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar);
		}
	}

	public void moveleft() {
		String[] friends = { "muthu", "selva", "kurinji", "mani", "deepi" };
		String temp;
		int i = 0;
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
		temp = friends[0];

		for (i = 0; i < friends.length - 1; i++) {
			friends[i] = friends[i + 1];
		}

		friends[i] = temp;
		System.out.println();
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
	}

	public void moveright() {
		String[] friends = { "muthu", "selva", "kurinji", "mani", "deepi" };
		String temp;
		int len = friends.length;
		int i = 0;
		for (i = 0; i < len; i++) {
			System.out.print(friends[i] + " ");
		}
		temp = friends[len - 1];

		for (i = 1; i < len; i++) {
			friends[len - i] = friends[len - (i + 1)];
		}

		friends[len - i] = temp;
		System.out.println();
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
	}

	public void moveUsing2Temp() {
		String[] friends = { "muthu", "selva", "sathish", "kurinji", "elumalai" };
		String temp, temp1;
		int len = friends.length;
		int i = 0;
		System.out.println("before moving");
		for (i = 0; i < len; i++) {
			System.out.print(friends[i] + " ");
		}
		temp = friends[len - 2];
		temp1 = friends[len - 1];

		for (i = len - 1; i > 1; i--) {
			friends[i] = friends[i - 2];
		}

		friends[i - 1] = temp;
		friends[i] = temp1;
		System.out.println();
		System.out.println("After moving");
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}

		temp = friends[len - 1];
		for (i = len - 1; i > 0; i--) {
			friends[i] = friends[i - 1];
		}
		friends[i] = temp;
		System.out.println();
		System.out.println("Second shift");
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
	}

	public void moveUsing1Temp() {
		String[] friends = { "muthu", "selva", "sathish", "kurinji", "elumalai" };
		String temp;
		int len = friends.length;
		int i = 0;
		System.out.println("before moving");
		for (i = 0; i < len; i++) {
			System.out.print(friends[i] + " ");
		}
		
		temp = friends[len - 1];
		for (i = len - 1; i > 0; i--) {
			friends[i] = friends[i - 1];
		}

		friends[i] = temp;
		System.out.println();
		System.out.println("After moving");
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}

		temp = friends[len - 1];
		for (i = len - 1; i > 0; i--) {
			friends[i] = friends[i - 1];
		}
		friends[i] = temp;
		System.out.println();
		System.out.println("Second shift");
		for (i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
	}

	public void findMax() {
		String[] subject = { "tamil", "english", "maths", "science", "social" };
		int[] marks = { 67, 89, 90, 100, 69 };
		int max = 0;
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >max)
				max = marks[i];
		}
		System.out.println(max);
		for (int i = 0; i < marks.length; i++) {
			if (max == marks[i])
				System.out.println("High " + subject[i]);
		}
	}
}
