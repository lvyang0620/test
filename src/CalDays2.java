/*
 * ��1900��1��1��--2016�� 5��7�� �ж�����
 * */
import java.util.Scanner;
public class CalDays2{
	public static void main(String[] args){
		int sum=0;
		int y,m,d;
		Scanner in=new Scanner(System.in);
		System.out.print("���������-->");
		y=in.nextInt();
		System.out.print("�������·�-->");
		m=in.nextInt();
		System.out.print("����������-->");
		d=in.nextInt();
		for(int year=1900;year<=(y-1);year++){
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int mon=1;mon<=(m-1);mon++){
			if(mon==2){
				if(((y%4==0)&&(y%100!=0))||(y%400==0)){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				if(mon==4||mon==6||mon==9||mon==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
		sum+=d;		
		System.out.println("1900��1��1�յ�"+y+"��"+m+"��"+d+"��һ��"+sum+"��");
	}
}