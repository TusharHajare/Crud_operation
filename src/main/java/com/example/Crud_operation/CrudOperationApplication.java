package com.example.Crud_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
		System.out.println("Start Application...!");

		//find the factorial of 5 ex.120

//		int a=4;
//		int x=1;
//		for (int i=a; i>0; i--)
//		{
//			x = x * i;
//		}
//		int x=5;
//		int a=1;
//		for (int i=1; i<=x;i++)
//		{
//			a=a*i;
//		}
//		System.out.println("Factorial of "+x+" is a "+ a);

		//even/ odd
//		int num=5555;
//		if(num%2==0)
//			System.out.println("even num");
//	    else
//			System.out.println("odd num");
//	}
//		System.out.println( x = num % 1000);

//		int num1 = 1221;
//		int num = num1;
//		int rem=0;
//		int i=0, x=0;
//		while(num1!=0)
//		{
//			rem = num1 % 10;
//			x = (x*10)+rem;
//			num1 = num1/10;
//
//		}
//			System.out.println(x);
//		if (num==x)
//			System.out.println("Palindrome");
//        else
//			System.out.println("not Palindrome");
//

		int a=100;
		try {
			System.out.println(a/10);
		}catch (Exception e) {
			new ArithmeticException("/ by zero exception is found not used / 0 ");
		}finally {
			int b=10;
			int c=20;
			System.out.println(b+c);

		}
	}
}
