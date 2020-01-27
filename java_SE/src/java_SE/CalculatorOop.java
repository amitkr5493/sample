package java_SE;

import java.util.Scanner;

class Cal1
{
	int result;
		Scanner s1=new Scanner(System.in);
		{
			System.out.println("enter first number");
		}
		int a=s1.nextInt();
		{
			System.out.println("enter Second number");
		}
		int b=s1.nextInt();
	void add()
	{
		result=a+b;
		System.out.println(result);
	}
	void sub()
	{
		if(a>b)
		{
			result=a-b;
			System.out.println(result);
		}else
		{
			result=b-a;
			System.out.println(result);
		}
	}
	void mul()
	{
		result=a*b;
		System.out.println(result);
	}
	void div()
	{
	
		if(b==0)
		{
			System.out.println("any number cannot divided by zero");
		}
		else
		{
			result=a/b;
			System.out.println(result);
		}
	}
	void mod()
	{
		if(b==0)
		{
			System.out.println("can not enter ZERO");
		}
		else
		{
			result=a%b;
			System.out.println(result);
		}
	}
}

public class CalculatorOop {

	public static void main(String[] args) 
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("enter your Choice");
		int ch=s2.nextInt();
		Cal1 obj=new Cal1();
		switch (ch)
		{
			case 1:
				System.out.println("the addition two number");
				obj.add();
				break;
			case 2:
				System.out.println("the substraction two number");
				obj.sub();
				break;
			case 3:
				System.out.println("the multiplication two number");
				obj.mul();
				break;
			case 4:
				System.out.println("the divide two number");
				obj.div();
				break;
			case 5:
				System.out.println("the moduls two number");
				obj.mod();
				break;
		}
	}

}
