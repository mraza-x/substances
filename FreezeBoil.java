/**
Mohammed Raza
CSC 162 - Lab2 # 2 (class)
*/

public class FreezeBoil
{
   private int temperature;
   private boolean test;

   /**
      Constructor
      @param temp is the temperature of the substance
   */

   public void FreezeBoil(int temp)
   {
      temperature = temp;
   }

   /**
      The setTemperature method stores the temperature
      @param temp is the temperature
   */

   public void setTemperature(int temp)
   {
      temperature = temp;
   }

   /**
      The getTemperature method returns the temperature of the substance
      @return is the value of the temperature
   */

   public int getTemperature()
   {
      return temperature;

   }

   // Testing freezing temperature for Ethyl Alcohol

   public boolean isEthylFreezing()
   {
	   if (temperature <= -173)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }

   // Testing boiling temperature for Ethyl Alcohol

   public boolean isEthylBoiling()
   {
	   if (temperature >= 173)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }

   // Testing freezing temperature for Oxygen

   public boolean isOxygenFreezing()
   {
	   if (temperature <= -362)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }

   // Testing boiling temperature for Oxygen

   public boolean isOxygenBoiling()
   {
	   if (temperature >= -306)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }


   // Testing feezing temperature for Water

   public boolean isWaterFreezing()
   {
	   if (temperature <= 32)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }

   // Testing boiling temperature for Water

   public boolean isWaterBoiling()
   {
	   if (temperature >= 212)
	   {
		   test = true;
	   }
	   else
	   {
		   test = false;
	   }

	   return test;
   }


}
