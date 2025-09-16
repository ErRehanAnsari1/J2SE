interface TouristSpot{
void showAttractions();
}

interface FoodCulture{
void localFood();
}

class Indore implements TouristSpot,FoodCulture{
public void showAttractions(){
System.out.println("Rajwada,Sarafa,Chappan Dukan!");
}
public void localFood(){
System.out.println("Poha Jalebi,Garadu");
}
}
public class CityTest{
public static void main(String[] args){
Indore i=new Indore();
i.showAttractions();
i.localFood();
}
}