// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Country implements Comparable{
    private String name;
    public String getName() {
        return this.name;
    }
    public Country(String name){
        this.name = name;
    }
    
    public int compareTo(Object o){
        Country country = (Country)o;
        return this.getName().compareTo(country.getName());
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Country> available = List.of(new Country("Country D"), new Country("Country B"), new Country("Country A"), new Country("Country Z"));
         List<Country> special = List.of(new Country("Country D"), new Country("Country Z"), new Country("Country C"));
        List<Country> result = Main.sortCountries(available, special);
        System.out.println("result : ");
        result.forEach(country -> {
            System.out.println(country.getName());
        });
    }
     /* Available: United States, Mexico, Canada, Costa Rica, Bermuda, Belgium
       * Special: Canada, Mexico, France, Belgium
       * Result: Canada, Mexico, Belgium, Bermuda, Costa Rica, United States
     */
    private static List<Country> sortCountries(List<Country> availableCountries, List<Country> specialCountries) {
        System.out.println("Available countries : ");
      for(Country country : availableCountries)  {
            System.out.println(country.getName());
        }
        System.out.println("Special countries : ");
      for(Country country : specialCountries)  {
            System.out.println(country.getName());
        }
        List<String> availableCountriesNames = new ArrayList();
        for(Country country : availableCountries)  {
            availableCountriesNames.add(country.getName());
        }
      List<Country> commonCountries = new ArrayList();
      Set<Country> availableSortedSet = new TreeSet();
      for (Country country : specialCountries) {
          if(availableCountriesNames.contains(country.getName())) {
               System.out.println("Common countriy found: " + country.getName());
            commonCountries.add(country);
          }
          else {
              System.out.println("Not Common countriy : " + country.getName());
          }
      }
       System.out.println("Common countries : ");
      for(Country country : commonCountries)  {
            System.out.println(country.getName());
        }
      for (Country country : availableCountries) {
          availableSortedSet.add(country);
      }
      List<Country> availableSortedList = new ArrayList();
       System.out.println("Available countries sorted set : ");
      for(Country country : availableSortedSet)  {
            System.out.println(country.getName());
        }
      for (Country country : availableSortedSet) {
          availableSortedList.add(country);
      }
      System.out.println("Available countries sorted : ");
      for(Country country : availableSortedList)  {
            System.out.println(country.getName());
        }
        List<Country> commonCountriesNew = new ArrayList(commonCountries);
        List<String> commonCountriesNewNames = new ArrayList();
        System.out.println("commonCountriesNew : ");
      for(Country country : commonCountriesNew)  {
            System.out.println(country.getName());
        }
        for(Country country : commonCountriesNew)  {
            commonCountriesNewNames.add(country.getName());
        }
      for (Country country : availableSortedList) {
          if(!commonCountriesNewNames.contains(country.getName())){
              
          commonCountriesNew.add(country);
          }
      }
      return commonCountriesNew;
      
    }
}
    
    
    
    
    
