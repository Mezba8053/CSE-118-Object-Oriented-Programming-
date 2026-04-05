import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurantList = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }

    public void searchByName(String name) {
        for (Restaurant r : restaurantList) {
            if (r.getName().equals(name)) {
                System.out.println(r);
            }
        }
    }

    public void searchByScore(double range1, double range2) {
        for (Restaurant r : restaurantList) {
            if (r.getScore() >= range1 && r.getScore() <= range2) {
                System.out.println(r);
            }
        }
    }

    public void searchByZipcode(int zipcode) {
        for (Restaurant r : restaurantList) {
            if (r.getZipcode() == zipcode) {
                System.out.println(r);
            }
        }
    }

    public void searchByPrice(String price) {
        for (Restaurant r : restaurantList) {
            if (r.getPrice().equals(price)) {
                System.out.println(r);
            }
        }
    }

    public void printRestaurantList() {
        for (Restaurant r : restaurantList) {
            System.out.println(r);
        }
    }

    public void searchByCatagory(String catagory) {
        for (Restaurant r : restaurantList) {
            if (r.getCatagory().equals(catagory)) {
                System.out.println(r);
            }
        }
    }

    public void searchByFoodname(String na) {
        boolean flag = false;
        for (Restaurant r : restaurantList) {
            for (Food f : r.getFoodList()) {
                if (f.getName().equals(na)) {
                    System.out.println(r);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("No such food item with this name");
        }
    }

    public void searchByFood_restaurant(String name, String rest) {
        boolean flag = false;
        for (Restaurant r : restaurantList) {
            if (r.getName().equals(rest)) {
                for (Food f : r.getFoodList()) {
                    if (f.getName().equals(name)) {
                        // System.out.println(f);
                        r.displayFood();
                        flag = true;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("No such food item with this name on the menu of this restaurant");
        }

    }
    public void searchByCatagory_restaurant(String name,String rest)
    {   boolean flag=false;
        for(Restaurant r:restaurantList)
        {
            if(r.getName().equals(rest))
            {
                for(Food f:r.getFoodList())
                {
                    if(f.getCatagory().equals(name))
                    {
                        r.displayCatagory(name);
                        flag=true;
                    }
                }
            }
        }
        if(flag==false)
        {
            System.out.println("No such food item with this category on the menu of this restaurant");
        }
    }
    public void searchByPricerange(double ran1,double ran2)
    {
        int flag=0;
        for(Restaurant r:restaurantList)
        {
            flag+=r.showbyrange(ran1, ran2);
        }
        if(flag==0)
        {
            System.out.println("No such food item with this price range on the menu of this restaurant");
        }
    }
    public void searchByPricerange_restaurant(double range1,double range2,String rest)
    {
        int flag=0;
        for(Restaurant r:restaurantList)
        {
            if(r.getName().equals(rest))
            {
               flag+= r.showbyrange(range1, range2);
                
            }
        }
        if(flag==0)
        {
            System.out.println("No such food item with this price range on the menu of this restaurant");
        }
    }
    public void costliestfood(String rest)
    {
        for(Restaurant r:restaurantList)
        {
            if(r.getName().equals(rest))
            {
                r.showCostliestFood();
            }
        }
    }
    public void displaytotalfood()
    {
        for(Restaurant r:restaurantList)
        {
            System.out.print(r.getName());
            System.out.println(r.countfoodonmenu());
        }
    }
        
}
