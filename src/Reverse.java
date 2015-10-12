import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÕûÊý-->");
		int num=in.nextInt();

		while(num!=0){			
			double temp=num/10.0;
			int value=num%10;
			System.out.print(value);
			
			num=(int)temp;
		}
		
	}
}