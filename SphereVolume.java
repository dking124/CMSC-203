import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		System.out.println("This program will calculate the sphere volume\n");
		Scanner keyboard = new Scanner(System.in);
		double diam;
		System.out.println("Enter the diameter of the sphere: ");
		diam = keyboard.nextDouble();
		double radius = diam / 2;
		double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
		System.out.println("The volume of the sphere is " + volume + ".");
	}

}
