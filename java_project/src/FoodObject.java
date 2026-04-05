public class FoodObject {
    int restaurantId;
    String category;
    String Name;
    double price;
    public FoodObject(int restaurantId, String Name, String category, double price){
        this.restaurantId=restaurantId;
        this.Name=Name;
        this.category=category;
        this.price=price;
    }
    public void setRestaurantId(int Id){
        this.restaurantId=Id;

    }
//    public void setName(String Name){
//        this.Name=Name;
//    }
//    public void setCategory(String category){
//        this.category=category;
//    }
//    public void setPrice(double price){
//        this.price=price;
//    }
    public int getRestaurantId(){
        return restaurantId;
    }
    public String getName(){
        return Name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
}
