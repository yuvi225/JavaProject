package tamilnadu.chennai;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternProgram pp=new PatternProgram();
		//pp.starPattern();
		//pp.starPattern1();
		//pp.starPattern2();
		//pp.patternTask();
		//pp.printT();
		//pp.printLine();
		//pp.printStar();
		//pp.printAT();
		//pp.print();
		pp.pp();
	}
public void starPattern() {
	int star=1;
	for(int row=5;row>=1;row--) {
		for( star=1;star<row;star++) {
			System.out.print(" ");
		}
		for(int no=1;no<=6-row;no++) {
			System.out.print(no+" ");
		}
		System.out.println();
	}
}
public void starPattern1() {
	for(int row=1;row<=10;row++) {
	for(int col=1;col<=7;col++) {
System.out.print("*"+" ");
}
	System.out.println();
	}
}
public void starPattern2() {
	for(int row=1;row<=9;row++) { 
		
		if(row==1||row==5||row==9) {
			
	for(int col=1;col<=7;col++) {
		
System.out.print("* ");
	}
}else {
	for(int star=1;star<=7;star++) {
		
		if(star==1||star==7)
			System.out.print("* ");
		else 
			System.out.print(" ");
		
	}

}
	System.out.println();
	}
}

private void patternTask() {
	// TODO Auto-generated method stub
	for(int row=1;row<=5; row++)
    {
      
    for(int col=0; col<row; col++)
    {
    
    System.out.print((6-row)-col +" ");
    }
    
    System.out.println();
    }
  }
private void printLine() {
	// TODO Auto-generated method stub
	for(int row=1; row<=7; row++)
	{
	for(int col=1; col<=7; col++)
		{
		if(col==1 || col==7){
		System.out.print("* "); 
		}
		else{
		System.out.print("  "); 
		}
	}
	System.out.println(); 
	}
	for(int col=1; col<=7; col++)
	{
	System.out.print("* "); 
	}
		System.out.println();
	
}

private void printT() {
	// TODO Auto-generated method stub
for(int col=1; col<=7; col++)
	{
	System.out.print("* "); 
	}
System.out.println(); 
for(int row=1; row<=7; row++)
{
for(int col=1; col<=7; col++)
	{
	if( col==1){
	System.out.print("* "); 
	}
	else{
	System.out.print("  "); 
	}
}
System.out.println(); 
}
for(int col=1; col<=7; col++)
{
System.out.print("* "); 
}
	System.out.println();
} 
private void printStar() {
	// TODO Auto-generated method stub
	for(int row =1; row<=6; row++)
	{
		for(int col=1; col<=row; col++)
		{
			if(col==1 || col==row)
				System.out.print("* "); 
			else
				System.out.print(" ");
		}
		for(int at=6-row; at>0	; at--)
		{
		System.out.print("  ");
		}
		for(int star=1;star<=row;star++) {
			if(star==1)
			System.out.print("* ");
			else
				System.out.print(" ");
		}
		System.out.print("*");
		System.out.println(); 
		}
	
} 
public void printAT() {
	for(int row=0;row<=4;row++) {
		
		for(int at=1;at<=row;at++) {
			System.out.print(" ");
		}
		for(int star=5-row;star>=1;star--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}


public void print() {
	for(int i=1;i<=10;i+=2) {
		System.out.print(i+" ");
	}
	for(int i=1;i<=5;i++) {
		System.out.print(i*2+" ");
	}
}

public void pp() {
int no=2;
 
for(int row=1;row<=6;row++) {
	System.out.print(row*no+" ");
	no++;
}

}
}

