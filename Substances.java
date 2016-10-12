import java.util.Scanner;


/**
  Mohammed Raza
  CSC 162 - Lab2 #2 (main)
*/

public class Substances
{
   public static void main(String[] args)
   {

	 int temp;

	 Scanner keyboard = new Scanner(System.in);

     System.out.print("Enter the temperature: ");
     temp = keyboard.nextInt();

     FreezeBoil temperature = new FreezeBoil();


	 if (temperature.isEthylFreezing() == true)
	 {
		 System.out.println("Ethyl Alcohol will freeze at this temperature");
	 }

	 if (temperature.isEthylBoiling() == true)
	 {
		 System.out.println("Ethyl Alcohol will boil at this temperature");
	 }



	 if (temperature.isOxygenFreezing() == true)
	 {
		 System.out.println("Oxygen will freeze at this temperature");
	 }

	 if (temperature.isOxygenBoiling() == true)
	 {
		 System.out.println("Oxygen will boil at this temperature");
	 }



	 if (temperature.isWaterFreezing() == true)
	 {
		 System.out.println("Water will freeze at this temperature");
	 }

	 if (temperature.isWaterBoiling() == true)
	 {
		 System.out.println("Water will boil at this temperature");
	 }


   }
}
