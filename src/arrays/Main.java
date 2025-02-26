package arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 100;
        intArray[1] = 200;
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500;
        intArray[5] = 600;
        intArray[6] = 700;

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;  lastUnsortedIndex--) {

        }

        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 700) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
