/*
 * ��1900��1��1��--2015�� 12��31�� �ж�����
 * */
import java.util.Scanner;
public class CalDays{
	public static void main(String[] args){
		int sum=0;
		int now;
		Scanner in=new Scanner(System.in);
		System.out.print("���������-->");
		now=in.nextInt();
		for(int year=1900;year<=now;year++){
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		System.out.println("1900�굽"+now+"�����"+sum+"��");
	}
}