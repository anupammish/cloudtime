package demos;

import java.util.Scanner;

public class A {
	
private static Scanner s;

public static void main(String[] args)

{
	int a,b,c;
	
	System.out.println("enter the two number ");

	
	s = new Scanner(System.in);
	
	a=s.nextInt();
	b=s.nextInt();
	
	c=a+b;
	System.out.println("sum of number is "+c);
}
}
