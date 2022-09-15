package nestedClasses2;

public class LockalInnerEx2 {
public static void main(String[] args) {
	class Slojenie implements Math2{

		@Override
		public int doOperation(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		}
	Slojenie s= new Slojenie();
	System.out.println(s.doOperation(5, 3));
}
}
interface Math2 {
	int doOperation(int a, int b);
}