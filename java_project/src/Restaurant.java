import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    String Id;
    String Name;
    double score;
    String Price;
    int zipcode;
    List<Food_object> Catagory = new ArrayList<>();
public void setId(String Id){
    this.Id=Id;}
    public void setName(String Name){
        this.Name=Name;
    }
    public void setScore(double score){
        this.score=score;
    }
    public void setPrice(String Price){
        this.Price=Price;
    }
    public void setZipcode(int zipcode){
        this.zipcode=zipcode;
    }   public String getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public double getScore(){
        return score;
    }
    public String getPrice(){
        return Price;
    }
    public int getZipcode(){
        return zipcode;
    }
    Restaurant(String Id,String Name,double score,String Price,int zipcode){
        this.Id=Id;
        this.Name=Name;
        this.score=score;
        this.Price=Price;
        this.zipcode=zipcode;
    }
    
    public showDetails()
    {
        System.out.println("Restaurant ID: "+Id);
        System.out.println("Restaurant Name: "+Name);
        System.out.println("Restaurant Score: "+score);
        System.out.println("Restaurant Price: "+Price);
        System.out.println("Restaurant Zipcode: "+zipcode);
    }
    public void displayFood()
    {
        for (Food_object food : Catagory) {
            System.out.println("Category: " + food.getCatagory() + ", Name: " + food.getName());
        }
    }
    public void displayCatagory(String catagory)
    {
        for (Food_object food : Catagory) {
            if (food.getCatagory().equals(category)) {
                System.out.println(food.getName());
            }
        
           }
    }
    public int showbyrange(double range1,double range2)
    {   int flag=0;
        for (Food_object r : catagory) {
            if (r.getPrice() >= range1 && r.getPrice() <= range2) {
                System.out.println(r.getName());flag++;
            }
        }
        return flag;
    }
    public void showCostliestFood()
    {
        double max=0;
        for (Food_object r : catagory) {
            if (r.getPrice() > max) {
                max=r.getPrice();
            }
        }
        for (Food_object r : catagory) {
            if (r.getPrice() == max) {
                System.out.println(r.getName());
            }
        }
    }
    public countfoodonmenu()
    {
        int count=0;
        for (Food_object r : catagory) {
            count++;
        }
        return count;
    }
}
