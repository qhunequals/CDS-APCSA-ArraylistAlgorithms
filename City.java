import java.util.ArrayList;

public class City
{
   private String name;
   private int population;
   private boolean tourism;

   public City(String n, int pop)
   {
      name = n;
      population = pop;
      if(pop < 100000)
         tourism = false;
      else
         tourism = true;

       /*alternative to assign boolean value
      
        tourism = pop < 100000;
      */
   }
   
   public String getName()
   {
      return name;
   }

   public int getPopulation()
   {
      return population;
   }

   public boolean getTourism()
   {
      return tourism;
   }

   public void setPopulation(int pop)
   {
      population = pop;
      if(pop < 100000)
         tourism = false;
      else
         tourism = true;
   }

   public String toString()
   {
      String output = "City Name:\t" + name;
      output += "\nPopulation:\t" + population;
      output +="\n\n";
      return output;
   }
}