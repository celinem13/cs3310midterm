import java.util.Random;
public class BubbleSort {
    public static void main (String[] args){
        Random random = new Random();
        int randomNum;
        int[] arrayTest4 = new int[1000000];

        System.out.println("Array 4: 1,000,000 elements\nArray 4 Unsorted: ");
        for (int i = 0; i < arrayTest4.length; i++){
            randomNum = random.nextInt(1000000);
            arrayTest4[i] = randomNum;
            System.out.print(arrayTest4[i] + "\t");
        }
        System.out.println();

        bubbleSort(arrayTest4);
        System.out.println("Array 4 sorted:");
        for (int j : arrayTest4) {
            System.out.println(j + "\t");
        }
        System.out.println();

        int[] arrayTest3 = new int[100000];

        System.out.println("Array 3: 100,000 elements\nArray 3 Unsorted: ");
        for (int i = 0; i < arrayTest3.length; i++){
            randomNum = random.nextInt(100000);
            arrayTest3[i] = randomNum;
            System.out.print(arrayTest3[i] + "\t");
        }
        System.out.println();

        bubbleSort(arrayTest3);
        System.out.println("Array 3 sorted:");
        for (int j : arrayTest3) {
            System.out.println(j + "\t");
        }
        System.out.println();

        int[] arrayTest2 = new int[1000];

        System.out.println("Array 2: 100,000 elements\nArray 3 Unsorted: ");
        for (int i = 0; i < arrayTest2.length; i++){
            randomNum = random.nextInt(1000);
            arrayTest2[i] = randomNum;
            System.out.print(arrayTest2[i] + "\t");
        }
        System.out.println();

        bubbleSort(arrayTest2);
        System.out.println("Array 2 sorted:");
        for (int j : arrayTest2) {
            System.out.println(j + "\t");
        }

        int[] arrayTest = new int[100];

        System.out.println("Array 1: 100 elements\nArray 3 Unsorted: ");
        for (int i = 0; i < arrayTest.length; i++){
            randomNum = random.nextInt(100);
            arrayTest[i] = randomNum;
            System.out.print(arrayTest[i] + "\t");
        }
        System.out.println();

        bubbleSort(arrayTest);
        System.out.println("Array 1 sorted:");
        for (int j : arrayTest) {
            System.out.println(j + "\t");
        }
    }

    public static void bubbleSort(int[] array){
        sort(array, array.length);
    }

    public static void sort(int[] array, int length){
        boolean switchedPlaces;
        for (int i = 0; i < length-1; i++){
            switchedPlaces = false;
            for (int j = 0; j < length-i-1; j++){
                if (array[j] > array[j+1]){
                    swap(array, j, (j+1));
                    switchedPlaces = true;
                }
            }
            if (!switchedPlaces)
                break;
        }
    }

    public static void swap(int[] array, int num1, int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}
