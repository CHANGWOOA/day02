package operator;

public class Ex01 {
public static void main(String[] args) {
	System.out.println("----산술 연산자----");
	int n1=9, n2=2;
	System.out.println(n1/n2);
	System.out.println(n1/(double)n2);
	System.out.println(n1%n2);
	
	System.out.println("----복합대입 연산자---");
	n1=n2=5;
	n1+=1; // n1(6)=n1(5)+1
	System.out.println(n1);//결과?
	n1-=1; //n1(5)=n1(6)-1
	System.out.println(n1);//결과?
	n1*=n2;//n1(25)=n1(5)*(5)n2
	System.out.println(n1);//결과?
	n1/=n2;//n1(5)=n1(25)*(5)n2
	System.out.println(n1);//결과?
	n1%=n2;//n1(0)=n1(5)%(5)n2
	System.out.println(n1);//결과?
	
	System.out.println("---관계 연산자---");
	n1=5;
	n2=4;
	System.out.println(n1>n2);
	System.out.println(n1=n2);
	System.out.println(n1==n2);
	System.out.println(n1!=n2);
	
	boolean result=(n1!=n2);
	System.out.println("result : " + result);
	
	System.out.println("---논리 연산자---");
	int n3=10;
	n1=5; n2=7;
	System.out.println(n1>n2);
	System.out.println(n1>n3);
	System.out.println(n1>n2&&n1>n3);
	System.out.println(n2>n1&&n2>n3);
	System.out.println(n3>n2&&n3>n1);
	
	System.out.println("---or---");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("---and---");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);	
	
	System.out.println("---not---");
	System.out.println(!true);
	System.out.println(!(10>20));
	
	
	
	
	
	
}
}
