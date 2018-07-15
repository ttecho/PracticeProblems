

public class BubbleSort {
    public static int[] sortBasic(int[] arr) {
        for(int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortMoreEfficient(int[] arr) {
        for(int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortMostEfficient(int[] arr) {
        for(int j = 0; j < arr.length - 1; j++) {
            boolean swapsMade = false;
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapsMade = true;
                }
            }
            if (!swapsMade) {
                return arr;
            }
        }

        return arr;
    }

}
