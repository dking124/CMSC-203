import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int windSpeed;
		int temperature;
		
		System.out.println("What is the temperature in fahrenheit? (From -45-40F): ");
		temperature = keyboard.nextInt();
		System.out.println("What is the wind speed in MPH? (From 5-60 MPH): ");
		windSpeed = keyboard.nextInt();
		
		double windChill = 35.74 + (.6215 * temperature) - (35.75 * Math.pow(windSpeed, .16)) + (.4275 * temperature * Math.pow(windSpeed, .16));
		System.out.println("The wind chill is " + windChill);
	}

}
