package practise_Programs;

interface Interf{
    void m1();
}

class lambdaExpression {
	public static void main(String[] args) {
		
	
	Interf m = ()->{
		System.out.println("hello");
	};
	
	m.m1();
}}