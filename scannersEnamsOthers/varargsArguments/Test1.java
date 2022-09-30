package varargsArguments;

public class Test1 {
	static void summa(int a, int b) {
		System.out.println(a+b);
	}
	static void summa(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	static void summa(int a, int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
	//System.out.println("zero Element of array: "+args[0]);
	//will call exeption
	System.out.println("array Length"+args.length);
	}
}
