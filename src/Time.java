/*Contributor: Daniel Phan
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 */

public class Time implements Comparable
{
     private int hour;
     private int minute;
    
    /*
     * Sets the default time to 12:00.
     */
    public Time ()
    {
         this(12, 0);
    }
    
    /*
     * Sets hour to h and minute to m.
     */
    public Time (int h, int m)
    {
         hour = 0;
         minute = 0;
         if (h >=1 && h <= 23)
              hour = h;
         if (m >= 1 && m <= 59)
              minute = m;
            
    }
    
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
     public String toString ()
     {
          
          String h = "";
          String m = "";
          if ( hour <10)
               h +="0";
          if (minute <10)
               m +="0";
          h += hour;
          m+=minute;
          
          return "" + h + "" + m;
     }

     
     //Returns -1 if current time is less than other.
     //Returns 0 if current time is equal to other.
     //Returns 1 if current time is greater than other.
	public int compareTo(Object other) {		
		Time time= (Time)other;
		if (this.hour +(this.minute/10)<time.hour+(time.minute/10)){
			return -1;
		}
		else if (this.hour +(this.minute/10)>time.hour+(time.minute/10)){
			return 1;
		}
			
		else{
			return 0;
		}
	}
	 //Returns a String holding the difference between the current time  
    // and the Time t passed in via parameter.
	public String difference(Time t){
		
		int difference;
		int hours;
		int minutes;
		if (this.compareTo((Object)t)==-1){
			difference=((t.hour*60)+t.minute)-((this.hour*60)+this.minute);
			hours=difference/60;
			minutes=difference-hours*60;
			return hours+":"+minutes;
		}
		if (this.compareTo((Object)t)==1){
			difference=((this.hour*60)+this.minute)-((t.hour*60)+t.minute);
			hours=difference/60;
			minutes=difference-hours*60;
			return hours+":"+minutes;
		}
		else{
			return "00:00";
		}
	}
}