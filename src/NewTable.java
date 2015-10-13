import java.util.Scanner;
public class NewTable{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÕûÊý-->");
		int num=in.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"=");
				//String c=in.next();
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}  
		System.out.println();
	}
}