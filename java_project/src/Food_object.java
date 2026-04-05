// Maintains a list (using a Java Collection class) of Food objects
// ▪ Each Food object represents a food item on the menu of a specific restaurant 
// ▪ Each Food should contain the following information:
// o Restaurant Id
// o Category 
// o Name
// o Price
// ▪ Restaurants can be added to the list
// ▪ Food items can be added to the menu list
// ▪ Lists the details of an existing restaurant (or restaurants)
// ▪ Produces a report of restaurants and food items based on some criteria
// ▪ Produces different statistics of the restaurants and food items
// ▪ Loads a list of restaurants from a text file and saves the list of current restaurants to a text file
// ▪ Loads a list of food items on the menu of restaurants from a text file and saves the list of 
// current food items on the menu to a text fil
public class Food_object {
    int restaurantId;
    String catagory;
    String Name;
    double price;
    public void setRestaurantId(String Id){
        this.restaurantId=Id;

    }
    public void setName(String Name){
        this.Name=Name;
    }
    public void setCatagory(String catagory){
        this.catagory=catagory;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getRestaurantId(){
        return restaurantId;
    }
    public String getName(){
        return Name;
    }
    public String getCatagory(){
        return catagory;
    }
    public double getPrice(){
        return price;
    }
    
}
