package webapp.main;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import webapp.escape.Background;
import webapp.escape.Screen;

public class CalendarTest {
	
	public static void printCalendar(int year,int month){
		Screen.cursorPosition(3, 8);
		System.out.println("Year = "+year+", Month = "+month);
		
		Date date = new Date(year -1900, month-1, 1);

		   int week = date.getDay();
		   
		   int month2 = date.getMonth();
	 
		   while(true){
			   date.setDate(date.getDate()+ 1);
			   if(month2 != date.getMonth())
				   break;
		   }
		   date.setDate(date.getDate()-1);
		   
		   Screen.cursorPosition(8, 1);
		   
		   System.out.println("Sun	Mon	Tus	Wed	Thu	Fri	Sat");
		   
		   switch(week){
		   
		   case 1:System.out.print("__	"); break;
		   case 2:System.out.print("__	__	");break;
		   case 3:System.out.print("__	__	__	");break;
		   case 4:System.out.print("__	__	__	__	");break;
		   case 5:System.out.print("__	__	__	__	__	");break;
		   case 6:System.out.print("__	__	__	__	__	__	");break;
		   
		   }

		   
		   for(int i=0;i<date.getDate();i++ ){
			   Screen.background(Background.BLACK); 
			   if((week+i+1)%7==0)
				   Screen.background(Background.BLUE);   
			   if((week+i+1)%7==1)
				   Screen.background(Background.RED); 
			   System.out.print((i+1) + "	");
			   Screen.reset();
			   
			   
			   
			   if((week+i+1)%7==0)
				   System.out.println();	
			   
		   } 
		
		
	}

	public static void main(String[] args) {

		Screen.clear();
		
		Scanner scan=  new Scanner(System.in);
		
		while (true) {
			
			boolean flag=true;
			String param ="";
			do{
				flag = true;
				Screen.cursorPosition(20, 1);
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
				Screen.clear();
				System.out.println("param : "+param);
			
				//flag= param.matches("[1-9][0-9][0-9][0-9]/[0-9][0-9]");
				flag= param.matches("[1-9][0-9]{3}/[0-9]{2}");
			
			}while(!flag);
		
			StringTokenizer tokens = new StringTokenizer(param,"/");
			int year  =Integer.parseInt((String)tokens.nextElement()); 
			int month =Integer.parseInt((String)tokens.nextElement());
		
			if(month >0 && month < 13)
				printCalendar(year, month);

		}
		
	}

}
