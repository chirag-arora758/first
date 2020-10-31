import java.util.*;
public class MyDate{
	private int day,month,year;
	MyDate()
	{
        day=20;
	month=10;
	year=2020;
	}
	MyDate(int a,int b,int c)
	{
	 day=a;
	 month=b;
	 year=c;
	}
	int getDay()
	{
	return day;
	}
	void setDay(int d)
	{
	day=d;
        }
	int getMonth()
	{
	return month;
	}
	void setMonth(int d)
	{
	day=d;
        }
	int getYear()
	{
	return year;
	}
	void setYear(int d)
	{
	day=d;
        }

void display(){
System.out.println(day+"/"+month+"/"+year);
}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
MyDate d=new MyDate();
d.display();
/*System.out.println("Enter details");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
MyDate d1=new MyDate(x,y,z);

d1.display();

System.out.println("Enter details to modify(DD/MM/YYYY) ");
int b=sc.nextInt();
int n=sc.nextInt();
int m=sc.nextInt(); 
d.setDay(b);
d.setDay(n);
d.setDay(m);
System.out.println("Modified details are"+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
*/
}
}
	
	
	
	
	
