import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> words=new LinkedList<Integer>();
		words.add(10);
		words.add(15);
		words.add(20);
		
		Integer item1 =(Integer)words.get(0);
		Integer item2=(Integer)words.get(1);
		System.out.println(item1+item2);
		
	}
}
