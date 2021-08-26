import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingResult {

    public static void main(String[] args){

        List<Fruit> listOfFruits = new ArrayList<Fruit>();

        Fruit apple = new Fruit(1,"Apple");
        Fruit orange = new Fruit(2,"Orange");
        Fruit banana = new Fruit(3,"Banana");

        listOfFruits.add(apple);
        listOfFruits.add(banana);
        listOfFruits.add(orange);

        Collections.sort(listOfFruits);

        listOfFruits.forEach(fruit ->

        {System.out.println(fruit.getId()+""+fruit.getName());

        });


    }
}
