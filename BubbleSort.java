import java.util.Random;
public class BubbleSort {
    public static void main (String[] args){
        Random random = new Random();
        int randomNum;
        int[] arrayTest4 = new int[1000000];

        for (int i = 0; i < arrayTest4.length; i++){
            randomNum = random.nextInt(1000000);
            arrayTest4[i] = randomNum;
        }

        long startTime = System.currentTimeMillis();
        bubbleSort(arrayTest4);
        long stopTime = System.currentTimeMillis();

        System.out.println("Time for array 4 to be sorted (1,000,000 elements): " + (stopTime-startTime) + " ms");

        int[] arrayTest3 = new int[100000];
        for (int i = 0; i < arrayTest3.length; i++){
            randomNum = random.nextInt(100000);
            arrayTest3[i] = randomNum;
        }
        startTime = System.currentTimeMillis();
        bubbleSort(arrayTest3);
        stopTime = System.currentTimeMillis();
        System.out.println("Time for array 3 to be sorted (100,000 elements): " + (stopTime-startTime) + " ms");

        int[] arrayTest2 = new int[1000];

        for (int i = 0; i < arrayTest2.length; i++){
            randomNum = random.nextInt(1000);
            arrayTest2[i] = randomNum;
        }
        startTime = System.currentTimeMillis();
        bubbleSort(arrayTest2);
        stopTime = System.currentTimeMillis();
        System.out.println("Time for array 2 to be sorted (1,000 elements): " + (stopTime-startTime) + " ms");

        int[] arrayTest = new int[100];
        for (int i = 0; i < arrayTest.length; i++){
            randomNum = random.nextInt(100);
            arrayTest[i] = randomNum;
        }
        startTime = System.currentTimeMillis();
        bubbleSort(arrayTest);
        stopTime = System.currentTimeMillis();
        System.out.println("Time for array 1 to be sorted: (100 elements)" + (stopTime-startTime) + " ms");
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
