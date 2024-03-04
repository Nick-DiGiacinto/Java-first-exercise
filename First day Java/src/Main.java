public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int product = number(5,2);
        System.out.println("The result is: " + product);
        String username =("Nick", "DG");
        System.out.println("Il mio username è:  " + username);
        String[] arrayOfAnimal = {"cat", "dog", "lion", "zebra","bear"};
        String[] arrayOfNewAnimal = ArrayOfString(arrayOfAnimal, "elephant");
        for (String i : arrayOfNewAnimal) {
            System.out.println(i);
        }
    }
    public static int number (int x, int y) {
        return x * y;
    }
    public static String name (String x, String y){
        return x + y;
    }
    public static String[] ArrayOfString (String[] original, String newName) {
        String[] newArray = new String[6];
        for (int i = 0; i < 2; i++) {
            newArray[i] = original[i];
        }
        newArray[2] = newName;
        for (int i = 3; i < 6; i++) {
            newArray[i] = original[i - 1];
        }
        return newArray;
    }
    }

