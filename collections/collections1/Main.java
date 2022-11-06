package collections1;

public class Main {

//	String name= "IBM";
	public static void main(String[] args) {
		Computer computer = new Computer("IBM", 2020, "black");
		// char [] array= {'p','r' ,'i', 'v','e','t'};
//		//String s = new String(array);
//	//	System.out.println(s);
//		StringBuilder sb2 =new StringBuilder("privet");
//		sb2.insert(1, array,2,3);
//		System.out.println(sb2);
		computer.on();
		computer.off();

	}
}
