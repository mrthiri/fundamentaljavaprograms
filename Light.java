package javaexercises;

public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int lightspeed;
         long days;
         long seconds;
         long distance;
         
         lightspeed = 186000;
         days = 1000;
         seconds = 1000 * 24 * 60 * 60;
         distance = lightspeed * seconds;
         
         System.out.print("In " + days+" days light will travel about " + distance + " miles ");
	}

}
