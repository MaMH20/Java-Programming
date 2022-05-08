package ArrayList;

import java.util.ArrayList;


public class ArrayListExampel{
    public static void main(String[] args){

        //ArrayList.ArrayListExampel = a resizeble array


        /*ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Reis");
        food.add("Hamburger");

        food.set(2, "hotdog");
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++) {

            System.out.println(food.get(i));

        }*/

          ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);

        numbers.set(2, 55);
        numbers.remove(3);
        numbers.clear();


        for(int i = 0; i < numbers.size(); i++) {

          System.out.println(numbers.get(i));

        }

    }
}

