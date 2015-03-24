package webapp.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalendarTest {
	
	public static void printCalendar(int year,int month){
		System.out.println("Year = "+year+", Month = "+month);
		
	}

	public static void main(String[] args) {

		
		Scanner scan=  new Scanner(System.in);
		
		while (true) {
			
			boolean flag=true;
			String param ="";
			do{
				flag = true;
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
//				System.out.println("param : "+param);
			
				//flag= param.matches("[1-9][0-9][0-9][0-9]/[0-9][0-9]");
				flag= param.matches("[1-9][0-9]{3}/[0-9]{2}");
			
			}while(!flag);
		
			StringTokenizer tokens = new StringTokenizer(param,"/");
		
			
			printCalendar(Integer.parseInt((String)tokens.nextElement()), Integer.parseInt((String)tokens.nextElement()));
		
		
		}
		
	}

}
