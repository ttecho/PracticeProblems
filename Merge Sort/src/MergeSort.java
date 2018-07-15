import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        int length = arr.length;

        System.out.println("Arr: " + Arrays.toString(arr));
        if (length < 2) {
            return arr;
        }

        int middle = length / 2;

        int[] left = new int [middle];
        int[] right = new int [length-middle];


        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < (length - middle); j++) {
            right[j] = arr[length-middle+j];
        }


        System.out.println("    Left: " + Arrays.toString(left));
        System.out.println("    Right: " + Arrays.toString(right));

        int[] sortedLeft = sort(left);
        int[] sortedRight = sort(right);

        int[] merged = merge(sortedLeft, sortedRight, new int[left.length + right.length]);

        System.out.println("    Merged: " + Arrays.toString(merged));

        return merged;
    }

    private static int[] merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        System.out.println("    Merging " + Arrays.toString(left) + " " + Arrays.toString(right));

        while (i < left.length && j < right.length) {
            System.out.println("     Comparing - LEFT: " + left[i] + " RIGHT: " + right[j]);
            if (left[i] < right[j]) {
                System.out.println("        Left was smaller. Assigning arr[" + k + "] to be " + left[i]);
                System.out.println("            Increasing i from " + i + " to " + (i + 1));
                arr[k] = left[i];
                i++;
            } else {
                System.out.println("        Right was smaller. Assigning arr[" + k + "] to be " + right[j]);
                System.out.println("            Increasing j from " + j + " to " + (j + 1));
                arr[k] = right[j];
                j++;
            }
            System.out.println("            Increasing k from " + k + " to " + (k + 1));
            k++;
        }
        while (i < left.length) {
            System.out.println("        Left has remaining ints. Assigning arr[" + k + "] to be " + left[i]);
            System.out.println("            Increasing i from " + i + " to " + (i + 1));
            System.out.println("            Increasing k from " + k + " to " + (k + 1));
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            System.out.println("        Right has remaining ints. Assigning arr[" + k + "] to be " + right[j]);
            System.out.println("            Increasing j from " + j + " to " + (j + 1));
            System.out.println("            Increasing k from " + k + " to " + (k + 1));
            arr[k] = right[j];
            j++;
            k++;
        }

//        System.out.println("        Arr post merge: " + Arrays.toString(arr));
        return arr;
    }
}
