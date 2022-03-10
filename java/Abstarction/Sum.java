package abstraction;

public class Sum extends Arthmaticops{
	
	public void arthematicoperations() {
		
		System.out.println("This is SUM operation");
		
		int a = 2;
		int b = 3;
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		Arthmaticops sum = new Sum();
		sum.arthematicoperations();
	}

}
