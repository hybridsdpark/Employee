package webapp.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import webapp.escape.Background;
import webapp.escape.Screen;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateTest {
   
   static Log log = LogFactory.getLog(DateTest.class);

   @SuppressWarnings("deprecation")
  // @Test
   public void test1() {
      
      Date current = new Date();
      
      //log.info(current);
      log.info(current.toLocaleString());
   }
   
   @SuppressWarnings("deprecation")
   //@Test
   public void test2() {
      
      Calendar current = Calendar.getInstance();
      
      log.info(current.getTime().toLocaleString());
   }
   
   @SuppressWarnings("deprecation")
   //@Test
   public void test3(){
         
      Date current = new Date();
      
      current.setDate(current.getDate() + 100);
      
      log.info("year = " + (current.getYear() + 1900));
      log.info("month = " + (current.getMonth() + 1));
      log.info("date = " + current.getDate());
      log.info("week = " + current.getDay());
      
   }

   
   //@Test
   public void test4(){
	  
	   Date date = new Date(2015 -1900, 3-1, 1);
	   
	   
	   
	   log.info("start week = "+date.getDay());
	   
	   
	   int month = date.getMonth();
	   
	   while(true){
		   date.setDate(date.getDate()+ 1);
		   if(month != date.getMonth())
			   break;
	   }
	   
	   date.setDate(date.getDate()-1);
	   
	   log.info("end week = "+date.getDay());
	   log.info("end date = "+date.getDate());
	   log.info(date.toLocaleString());
   
   
   }
   
   //@Test
   public void test5(){
	   
	   Scanner scan = new Scanner(System.in); 
	   int s =scan.nextInt();
	   
	   
	   Date date = new Date(2015 -1900, s-1, 1);

	   int week = date.getDay();
	   
	   int month = date.getMonth();
 
	   while(true){
		   date.setDate(date.getDate()+ 1);
		   if(month != date.getMonth())
			   break;
	   }
	   date.setDate(date.getDate()-1);
	   
	   System.out.println("일	월	화	수	목	금	토");
	   switch(week){
	   
	   case 1:log.info("31	");
	   break;
	   case 2:log.info("30	31	");break;
	   case 3:log.info("29	30	31	");break;
	   case 4:log.info("28	29	30	31	");break;
	   case 5:log.info("27	28	29	30	31	");break;
	   case 6:log.info("26	27	28	29	30	31	");break;
	   
	   }
	   
	   for(int i=0;i<date.getDate();i++ ){
		   
		   log.info((i+1) + "	");
		   
		   if((week+i+1)%7==0)
			   log.info("/n");
		   
	   } 
   	}
   
   
   @Test
   public void test6(){
	   
	   Scanner scan = new Scanner(System.in); 
	   
	   int s =scan.nextInt();
	   
	   Date date = new Date(2015 -1900, s-1, 1);

	   int week = date.getDay();
	   
	   System.out.println("일	월	화	수	목	금	토");
	  
	   switch(week){
	   case 1:System.out.print("31	");break;
	   case 2:System.out.print("30	31	");break;
	   case 3:System.out.print("29	30	31	");break;
	   case 4:System.out.print("28	29	30	31	");break;
	   case 5:System.out.print("27	28	29	30	31	");break;
	   case 6:System.out.print("26	27	28	29	30	31	");break;
	   
	   }
	   
	   int month = date.getMonth();
 
	   while(true){
		   date.setDate(date.getDate()+ 1);
		   if(month != date.getMonth())
			   break;
	   }
	   date.setDate(date.getDate()-1);
	   
	   
	   for(int i=0;i<date.getDate();i++ ){
		   
		   System.out.print((i+1) + "	");
		   
		   if((week+i+1)%7==0)
			   System.out.println();
		   
	   } 
   	}
   
   //@Test
   public void test7(){
   
   Screen.clear();
   
   
   Scanner scan = new Scanner(System.in); 
   
   while(true){
	   Screen.cursorPosition(8, 1);
	   System.out.println("[yyyy/MM] : ");
	   String param = scan.next();
   
	   if(param.equals(".")) break;
	   System.out.print("param = "+param);
   }
   
//   Screen.reset();
   }
  
   
   
}
  
