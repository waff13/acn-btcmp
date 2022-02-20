package Day03;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    //TODO 1
    // 1. declare and initialize String array with 7 arbitrary colors.
    // 2. Create new list "colors" (ArrayList) of type String
    // 3. Copy/add all elements from String array to colors list
    // 4. Remove 3rd element from colors list
    // 5. Add new color at the end of the colors list
    // 6. Add new color at the beginning of the colors list
    // 7. Loop through colors list and output all values (use for each loop)
    // 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
    // index 2 to index 5)
    //    (hint: take a look at List interface and find a method which you can use to achieve this)
    // 9. Use for loop to output each element of colorsSublist list

    public static void main(String[] args) {

        String[] myColors = {"red", "green", "blue", "yellow", "orange", "violet", "black"};

        ArrayList<String> colors = new ArrayList<>();

        System.out.println("Initial list: ");
        for (String element : myColors) {
            colors.add(element);
            System.out.println(element);
        }

        colors.remove(2); // third element actually has index 2
        colors.add("white");
        colors.add(0, "magenta");

        System.out.println("\nWith white and magenta: ");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\nSublist: ");
        List<String> colorsSublist = colors.subList(2, 6);
        for (String element : colorsSublist) {
            System.out.println(element);
        }
    }
}