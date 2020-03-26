
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 5  Bike names");
		    ArrayList<String> Bike = new ArrayList<String>();
		    for(int i=0;i<5;i++)
		    Bike.add(sc.next());
		    System.out.println("The 5 Cars are");
		    System.out.println(Bike);
}
}
