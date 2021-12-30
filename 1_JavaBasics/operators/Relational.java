package operators;

public class Relational {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		boolean res = a>b;
		System.out.println("a>b = " + res);
		
		res = a<b;
		System.out.println("a<b = " + res);
		
		res = a<=10;
		System.out.println("a<=10 = " + res);
		
		res = a>=10;
		System.out.println("a>=10 = " + res);
		
		res = a>=9;
		System.out.println("a>=9 = " + res);
		
		res = a>=11;
		System.out.println("a>=11 = " + res);
		
		res = a==9;
		System.out.println("a==9 = " + res);
		
		res = a!=11;
		System.out.println("a!=11 = " + res);
				
	}

}
