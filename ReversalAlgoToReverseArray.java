// Reverse an algoritm but try only left rotation

import java.util.*;

class LeftRotate {
    static void leftRotate(int arr[], int d) {
        if (d == 0)
            return;

        int n = arr.length;
        d = d % n;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    static void reverseArray(int arr[], int start, int end) {
        int temp;
        
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = sc.nextInt();
        leftRotate(arr, d);
        printArray(arr);
        sc.close();
    }
}
