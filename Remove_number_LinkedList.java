import java.util.LinkedList;
public class Main
{


	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		LinkedList<Integer>Number=new LinkedList<Integer>();
		Number.add(10);
		Number.add(15);
		Number.add(20);
		Number.add(25);
		Number.remove(1);
		for(int Numbers:Number)
		{
		    System.out.println(Numbers);
		}
	}
}
