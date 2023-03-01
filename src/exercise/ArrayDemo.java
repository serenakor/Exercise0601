package exercise;

public class ArrayDemo {
    public static void main(String[] args) {
        // declare an array
        int[] arrayInt = new int[5];
        // set values for each element of array.
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;    // int[] arrayInt = {1, 2, 3, 4, 5};
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        // get array length
        System.out.println("Array length: " + arrayInt.length);
        // access array element at a givin index to get value.
        System.out.println("Element at index 3: " + arrayInt[3]);

    }
}
