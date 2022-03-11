package interfacepkg;

public class ImplementParent implements ParentInterface{

	@Override
	public void behaviour() {
		
		System.out.println("Sometimes Aggressive \n Sometimes");
		
	}

	@Override
	public void color() {
		
	  System.out.println(name + "in brown color");
		
	}

	@Override
	public void isgood() {
		
		System.out.println(name + "is good");
		
	}

	@Override
	public void ishealth() {
		System.out.println(name + "is healthy");
		
	}

	public static void main(String[] args) {
		ImplementParent IP1 = new ImplementParent();
		IP1.behaviour();
		IP1.color();
		IP1.isgood();
		IP1.ishealth();
	}
}
