package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");
        
        System.out.println("List of fruits:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chickoo present?: " + myList.contains("Chicku"));
        System.out.println("Size of arrayList: " + myList.size());
        
        myList.remove("Papaya");
        
        System.out.println("New Size: " + myList.size());
    }
}