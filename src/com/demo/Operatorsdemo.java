package com.demo;

public class Operatorsdemo
{
	public static void main(String[] args)
	{
		//arithmetic operator
		int a=100;
		int b=50;
		int add,sub,mul,div,mod;
		
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		
		System.out.println("Addition : "+add);
		System.out.println("Subtraction : "+sub);
		System.out.println("Multiplication : "+mul);
		System.out.println("Division : "+div);
		System.out.println("Modulos : "+mod);
		boolean result;
		
		//relational operator
		result= (a==b);
		System.out.println("Equal to : "+result);
		
		result=(a!=b);
		System.out.println("Not Equal to : "+result);
		
		result=(a<=b);
		System.out.println("Greater than equal to  : "+result);
		
		result=(a>=b);
		System.out.println("Less than equal to : "+result);
		
		result=(a<b);
		System.out.println("Greater than  : "+result);
		
		result=(a>b);
		System.out.println("Less than : "+result);
		
		double percent=80.00;
		double science=60.00;
		
		boolean admission=(percent >=70.00)||(science>=70.00);
		System.out.println("Admitted : "+admission);
		
		admission=(percent >=70.00)&&(science>=70.00);
		System.out.println("Admitted : "+admission);
		
		boolean demo=true;
		System.out.println("Negation : "+ !demo);
		//assignment operator
		char demo2='@';
		System.out.println("character: " +demo2);
		//ternary operator(conditional operator)
		double salary=50000.00;
		double increament=5000.00;
		double decreament=3000.00;
		double result1=(salary>=45000.00)? decreament:increament;
		System.out.println("salary decreamented by:" +result1);
		
		//increament operator and decreament(unary)
		int counter1=12;
		int counter=10;
		System.out.println("increament:"+counter++);
		System.out.println("decreament:"+counter--);
		
		counter1++;
		counter1--;
		
		System.out.println("counter:"+counter1);
		int res1 ,res2,res3;
		int d=12;
		int e=12;
		res1=++d;
		System.out.println(res1);
		res2=e++;
		System.out.println(res2);
		res3=e++;
		System.out.println(res3);
		int res4=++d;
		System.out.println(res4);
		int res5=d--;
		System.out.println(res5);
		int res6=--d;
		System.out.println(res6);
		System.out.println(~res6);
		
		int x=12;
		int y=25;
		System.out.println("x^y : "+(x^y));
		System.out.println("x&y : "+(x&y));
		System.out.println("x|y : "+(x|y));
		
		
		
		
		
		
		
		
		
	}
	

}
