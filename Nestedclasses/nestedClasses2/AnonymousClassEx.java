package nestedClasses2;

public class AnonymousClassEx {
	public static void main(String[] args) {
	Math1 m = new Math1() {
		int c =10;
		void abc() {}
		@Override	 
		 public int doOperation(int a,int b) {
			return a+b;
		}
	};
	Math1 m2 = new Math1() {
		
		@Override	 
		 public int doOperation(int a,int b) {
			return a*b;
		}
	};
	
	System.out.println(m.doOperation(3, 6));
	System.out.println(m2.doOperation(3, 6));
}
}
class Math1{
	int doOperation(int a,int b) {
	return a/b;  
}}
