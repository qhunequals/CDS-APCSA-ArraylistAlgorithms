import java.util.ArrayList;

public class Cities
{
   private ArrayList<City> cityList;
  
  public Cities(String[] names, int[]pop)
  {
     //complete the contructor code here
     
  }

  public void insertCity(String name, int pop)
  {
    //complete the code for this method here
  }

  public void deleteCity(String name)
  {
    //complete the code here
  }

 
  public ArrayList<String> visitedCities()
  {
     return null;  
  }

  public String toString()
  {
     String output = "LIST OF CITIES\n\n";
     for(City c : cityList)
     {
        output += c;
     }
     return output;
     
  }
}