import java.util.Random;
import java.util.Scanner;
public class Timestable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		int hi;
		int low;
		int low2;
		int dif;
		int counter=0;
		
		System.out.println("Please give me your highest number you want to work with.");
		hi=in.nextInt();
		System.out.println("Please give me your lowest number you want to work with.");
		low=in.nextInt();
		int temp=low;
		low=hi;
		hi=temp;
		low2=low;
		dif=hi-low;
		for (int x=low;x<=hi;x++) {
			System.out.print("\t"+x+"\t");
		}  	System.out.println();
		for (int x=low;x<=hi;x++) {
			System.out.println();
			System.out.print(x);
			for (int y=low;y<=hi;y++) {
				System.out.print(" \t"+(x*y)+"\t ");
		}
		}
		
		
		} 
		
}
