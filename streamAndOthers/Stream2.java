package streamAndOthers;

import java.util.Arrays;

public class Stream2 {
public static void main(String[] args) {
	int[] array=  {5,9,3,8,1};
	Arrays.stream(array).forEach(Utils::myMethod);
	Arrays.stream(array).forEach(el->Utils.myMethod(el));
}}
class Utils{
	public static void myMethod(int a) {
		a=a+5;
		System.out.println("Element = " +a);
	}
}