import java.util.Scanner;
public class Table{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=9;i++){
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