import java.io.File;
import java.util.Scanner;

public class Match {
	private Scanner x;

	public static void main(String[] args) {
	}
	public static void intro(){
		int[] stdnt = new int[100];
	}
	public void match(){
		try{
			x = new Scanner (new File("FullRoster.txt"));
		}catch (Exception e){ 
			System.out.println("Error");
		}
	}

	public void readFile(){
		while (x.hasNext()){
			String name = x.next();
			String gender = x.next();	
			String age = x.next();
			String pref = x.next();

			System.out.printf("%s %s %s %s %s\n", name, gender, age, pref);
		}
	}

	public void closeFile(){
		x.close();
	}
}

