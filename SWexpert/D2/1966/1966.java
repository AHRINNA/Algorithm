import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.valueOf(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int N = Integer.valueOf(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] arrInt = new int[N];
            for (int k = 0; k < str.length; k++) {
                arrInt[k] = Integer.valueOf(str[k]);
            }

            // 정렬 알고리즘 작성
            // Bubble Sort 알고리즘
//                for(int k = 0; k < arrInt.length - 1; k++) {
//                    for(int l = 0; l < arrInt.length - 1; l++) {
//                        if(arrInt[l] > arrInt[l + 1]) {
//                            int temp = arrInt[l];
//                            arrInt[l] = arrInt[l + 1];
//                            arrInt[l + 1] = temp;
//                        }
//                    }
//                } timeout
            QuickSort qSort = new QuickSort();
            qSort.quickSort(arrInt, 0, arrInt.length - 1);

            System.out.print("#" + (i + 1) + " ");
            for (int k = 0; k < str.length; k++) {
                System.out.print(arrInt[k] + " ");
            }
            System.out.println();
        }
    }
}

class QuickSort {

    void quickSort(int[] input, int first, int last)
    {
        int pivot;
        int i;
        int j;
        int temp;

        if (first < last)
        {
            pivot = first;
            i = first;
            j = last;

            while (i < j)
            {
                while (input[i] <= input[pivot] && i < last)
                {
                    i++;
                }
                while (input[j] > input[pivot])
                {
                    j--;
                }
                if (i < j)
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }

            temp = input[pivot];
            input[pivot] = input[j];
            input[j] = temp;

            quickSort(input, first, j - 1);
            quickSort(input, j + 1, last);
        }
    }

//    public static int partition(int arr[], int left, int right) {
//
//        int pivot = arr[(left + right) / 2];
//
//        while (left < right) {
//            while ((arr[left] < pivot) && (left < right))
//                left++;
//            while (arr[right] > pivot)
//                right--;
//
//            if (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }
//
//        return left;
//    }
//
//    public static void quickSort(int arr[], int left, int right) {
//
//        if (left < right) {
//            int pivotNewIndex = partition(arr, left, right);
//
//            quickSort(arr, left, pivotNewIndex - 1);
//            quickSort(arr, pivotNewIndex + 1, right);
//        }
//    }
}
