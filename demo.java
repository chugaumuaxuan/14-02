
public class demo {
	public class Demo  
	  
	{  
	   public enum Month  
	   {  
	        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC  
	   }  
	  
	   public static void main(String args[])  
	   {  
	       Month[] MonthNow = Month.values();  
	       for (Month Now : MonthNow)  
	       {  
	            switch (Now)  
	            {  
	                case JAN:  
	                {     
	                    System.out.println("JANUARY");  
	                    break;  
	                }  
	                case FEB:  
	                {  
	                    System.out.println("FEBRUARY");  
	                    break;  
	                }  
	                case MAR:  
	                {  
	                    System.out.println("MARCH");  
	                    break;       
	                }  
	                case APR:  
	                {  
	                    System.out.println("APRIL");  
	                    break;  
	                }  
	                case MAY:  
	                {  
	                    System.out.println("MAY");  
	                    break;  
	                }  
	                case JUN:  
	                {  
	                    System.out.println("JUNE");  
	                    break;  
	                }  
	                case JUL:  
	                {  
	                    System.out.println("JULY");  
	                    break;  
	                }  
	                case AUG:  
	                {  
	                    System.out.println("AUGUST");  
	                    break;  
	                }  
	                case SEP:  
	                {  
	                    System.out.println("SEPTEMBER");  
	                    break;  
	                }     
	                case OCT:  
	                {  
	                    System.out.println("OCTOBER");  
	                    break;  
	                }  
	                case NOV:  
	                {  
	                    System.out.println("NOVEMBER");  
	                    break;  
	                }  
	                case DEC:  
	                {  
	                    System.out.println("DECEMBER");  
	                    break;  
	                }     
	            }  
	        }
	       
	       int a= 1;
	       System.out.println(a++);
	       System.out.println(++a);
	       
	       
	    }  
	} 
}
