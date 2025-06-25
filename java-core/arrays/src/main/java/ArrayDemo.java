public class ArrayDemo {

    public static void main(String[] args) {

        // Initializing the array
        String[] colors = {"Red", "Blue", "Green", "Yellow"};

        // display contents of the array
        System.out.println("Contents fo the array");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        System.out.println();

        // display length of the array
        System.out.println("Length of the array: " + colors.length);

        System.out.println();

        // loop through the array using for loop - version 1
        System.out.println("Looping through the array - version 1");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        // loop through the array using enhanced for loop (for-each) - version 2
        System.out.println("Looping through the array using enhanced for loop (for-each) - version 2");

        for (String color : colors) {
            System.out.println(color);
        }


    }
}
