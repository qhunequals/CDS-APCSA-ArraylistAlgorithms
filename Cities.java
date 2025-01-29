import java.util.ArrayList;

public class Cities
{
   private ArrayList<City> cityList;
  
  public Cities(String[] names, int[]pop)
  {
     cityList = new ArrayList<City>();
     for(int i = 0; i < names.length; i++){
         cityList.add(new City(names[i], pop[i]));
     }
     
  }

  public void insertCity(String name, int pop)
  {
    cityList.add(0, new City(name, pop));
  }

  public void deleteCity(String name)
  {
    for(int i = 0; i < cityList.size(); i++){
      if(cityList.get(i).getName().equals(name)){
         cityList.remove(i);
         i--;
      }
    }
  }

 
  public ArrayList<String> visitedCities()
  {
   ArrayList<String> cityNames = new ArrayList<String>();
   for(int i = 0; i < cityList.size(); i++){
      if(cityList.get(i).getTourism()){
         cityNames.add(cityList.get(i).getName());
      }
   }  
   return cityNames;
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