interface Shape{
	public void printLine(String s);
}
public class Message implements Shape{
	public void printLine(String s){
		for(int i = 1; i <=8; i++)
		{
			System.out.print(s);
		}
		System.out.println();
	}
	public static void main(String[] args){
		Message m = new Message();
		System.out.println("Hi, everybody");
		m.printLine("!");
		System.out.println("How are you");
		m.printLine("-");
	}
}