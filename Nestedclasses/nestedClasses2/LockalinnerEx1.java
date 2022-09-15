package nestedClasses2;

public class LockalinnerEx1 {
	public static void main(String[] args) {
		Math math = new Math();
		math.getResult();
	}
}
class Math{
	private int a =19;
	public void getResult() {
		class Divine{
			private int divined;
			private int divide;
			public int getDivined() {
				return divined;
			}
			public void setDivined(int divined) {
				this.divined = divined;
			}
			public int getDivide() {
				return divide;
			}
			public void setDivide(int divide) {
				this.divide = divide;
			} 
			public int getChastnoe() {
				return divined/divide;
				
			}public int getOstatok() {
				System.out.println(a);
				return divined%divide;
			}
		}
		Divine divine= new Divine();
	divine.setDivide(33);	
	divine.setDivined(100);
	System.out.println("Delimoe ="+ divine.getDivide());
	System.out.println("Delimoe ="+ divine.getChastnoe());
	System.out.println("Delimoe ="+ divine.getDivined());
	System.out.println("Delimoe ="+ divine.getOstatok());
		
}}