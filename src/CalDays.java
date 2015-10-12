/*
 * 求1900年1月1日--2015年 12月31日 有多少天
 * */
import java.util.Scanner;
public class CalDays{
	public static void main(String[] args){
		int sum=0;
		int now;
		Scanner in=new Scanner(System.in);
		System.out.print("请输入年份-->");
		now=in.nextInt();
		for(int year=1900;year<=now;year++){
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		System.out.println("1900年到"+now+"年相隔"+sum+"天");
	}
}