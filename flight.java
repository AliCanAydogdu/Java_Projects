

public class Flight
{
   private String airline, origin, destination;
   private int flightNumber;f	
   public Flight (String airlineInit, String originInit,
                  String destinationInit, int flightNumberInit)
   {
      airline = airlineInit;
      origin = originInit;
      destination = destinationInit;
      flightNumber = flightNumberInit;
   }
   public String getAirline ()
   {
	   return airline;
   }

   public String getOrigin ()
   {
	   return origin;
   }

   public String getDestination ()
   {
	   return destination;
   }

   public int getFlightNumber ()
   {
	   return flightNumber;
   }

   public void setAirline (String airlineUpdate)
   {
	   airline = airlineUpdate;
   }

   public void setOrigin (String originUpdate)
   {
	   origin = originUpdate;
   }

   public void setDestination (String destinationUpdate)
   {
	   destination = destinationUpdate;
   }

   public void setFlightNumber (int flightNumberUpdate)
   {
	   flightNumber = flightNumberUpdate;
   }

      public String toString ()
   {
      return airline + " " + flightNumber + " --  From: " + origin +
             ", To: " + destination;
   }
}
