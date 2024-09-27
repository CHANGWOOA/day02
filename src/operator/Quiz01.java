package operator;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("수 입력 : ");
	int num;
	num=input.nextInt();
	if(num%2==0){
		System.out.println(num + " = 짝수 ");}
	else {System.out.println(num + " = 홀수 ");}
	
	if(num%3==0)
	{System.out.println(num + " = 3의 배수다");}
	else {System.out.println(num + " = 3의 배수가 아니다");}
	
	System.out.print("두 수 입력 : ");
	int num1;
	num1=input.nextInt();
	int num2;
	num2=input.nextInt();
	System.out.println("num1 : "+ num1 + ", num2 : "+num2);
	if(num1<num2)
	{System.out.println("num2가 num1보다 크다");}
	
	
	
	
}
}
