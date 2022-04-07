package tamilnadu.chennai;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayPrograms ap=new ArrayPrograms();
//ap.findMax();
//ap.findMin();
//ap.findSecondMax();
//ap.findSecondMin();
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
	public void findMin() {
		String[] subject = { "tamil", "english", "maths", "science", "social" };
		int[] marks = { 67, 89, 90, 100, 69 };
		int min = marks[0];
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] <min)
				min = marks[i];
		}
		System.out.println(min);
		for (int i = 0; i < marks.length; i++) {
			if (min == marks[i])
				System.out.println("Minimum " + subject[i]);
		}
	}
	public void findSecondMax() {
		String[] subject = { "tamil", "english", "maths", "science", "social" };
		int[] marks = { 67, 89, 90, 100, 69 };
		int max = 0;
		int secondMax=0;
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >max) {
				secondMax=max;
				max = marks[i];
		}
		
		else if(marks[i]>secondMax) {
			secondMax=marks[i];
		}
		}
		System.out.println(max);
		System.out.println(secondMax);
		for (int i = 0; i < marks.length; i++) {
			if (max == marks[i])
				System.out.println("High " + subject[i]);
			
		}
		for (int i = 0; i < marks.length; i++) {
			if (secondMax == marks[i])
				System.out.println("Second High " + subject[i]);
			
		}
	
}
	
}
