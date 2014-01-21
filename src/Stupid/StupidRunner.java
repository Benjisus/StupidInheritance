package Stupid;

public class StupidRunner
{
	
		
	public static void main(String[] args)
	{
		Dumb lloyd = new Dumb();
		Dumber harry = new Dumber();
		Dumbest him = new Dumbest();
		
		System.out.println("Lets test inheritance!");
		
		System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("he is dumbest and his blerg is: " + him.getBlerg());
		System.out.println("Lets test more inheritance!");
		harry.setBlerg(45);
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		
		
		
	}
	

}
