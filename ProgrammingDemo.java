package tamilnadu.chennai;

import java.util.Scanner;

public class ProgrammingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingDemo pd = new ProgrammingDemo();
		pd.learn_if();
		pd.learn_if2();
		pd.learn_if3();
		pd.learn_looplerning();
		pd.learn_looplerning2();
		pd.learn_looplerning3();
		pd.learnScanner();
	}

	public void learnScanner() {
		Scanner sc = new Scanner(System.in);
		int sub=1;
		int total=0;
		while(sub<=5) {
			System.out.println("Enter mark");
			int mark=sc.nextInt();
			total=total+mark;
			sub++;
		}
		System.out.println("Enter the float value:");
		float f=sc.nextFloat();
		System.out.println("Enter the double value:");
		double d=sc.nextDouble();
		System.out.println("Enter the long value:");
		long l=sc.nextLong();
		System.out.println("Enter the boolean value:");
		boolean b=sc.nextBoolean();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Hi "+name + " welcome to java world");
		System.out.println("Your total mark is : "+total);
	}

	public void learn_looplerning3() {
		// TODO Auto-generated method stub
		int day=1;
		int gold=1;
		int total=0;
		while(day<=7) {
			gold=gold*2;
			total=total+gold;
			System.out.println(total);
			day=day+1;
			
		}
		System.out.println(gold);
		System.out.println(total);
	}

	public void learn_looplerning2() {
		// TODO Auto-generated method stub
		int flowers=1024;
		int temple=0;
		while(flowers>0) {
			flowers=flowers/2;
			temple=temple+1;
		}
		System.out.println(flowers);
		System.out.println(temple);
	}

	public void learn_looplerning() {
		// TODO Auto-generated method stub
		int purse =0;
		int day=1;
		while(day<=30) {
			purse=purse+day;
			day=day+1;
			//System.out.println(purse);
		}
		System.out.println(purse);
		System.out.println(true==true);
	}
	

	public void learn_if3() {
		// TODO Auto-generated method stub
		int amount=500;
		int petrol=104;
	if(amount>100) {
		if(petrol==104) {
		System.out.println("Fill Petrol");
	}
		else {
			System.out.println("half litre");
		}
	}else {
		System.out.println("no petrol");
	}
	}

	public void learn_if2() {
		// TODO Auto-generated method stub
		boolean school=true;
		boolean rain=true;
		if(school==true && rain==true) {
			System.out.println("Take Umbrella");
		}else
		{
			System.out.println("Take rest");
		}
	}
	
	

	public  void learn_if() {
		int no1=55,no2=55;
		if(no1>no2) {
			System.out.println(no1);
		}
		else if(no2>no1){
			System.out.println(no2);
		}else
		{
			System.out.println(no1+"="+no2);  //+Concatination
		}
		
	}

}
