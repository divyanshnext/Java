package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args){
    // Array vs ArrayList
    // Array is not resizable but arrayList can be resized

    ArrayList<String> cars = new ArrayList<String>(); // creating an arraylist object

    cars.add("volvo");
    cars.add("bmw");
    cars.add("bugati");

    cars.add(0,"rolls royce");
    cars.add(0,"tata magic");

    cars.set(0,"bullet");
    cars.remove(4);

    System.out.println(cars.get(0));
    System.out.println(cars);

    

    // lopp through an arerayList

    for(int i=0;i<cars.size();i++){
        System.out.println(cars.get(i));
    }

    Collections.sort(cars); // this is how we sort the array list

    for(String i: cars){
        System.out.println(i);
    }

    System.out.println(cars.contains("fortuner"));
    System.out.println(cars.toArray());



}
}
