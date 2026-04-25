package recursion;

import java.util.Arrays;

public class problem_2 {

    // f(l, r)
    static void f(int[] a, int l, int r) {

        // if (l >= r) return
        if (l >= r) return;

        // swap(a[l], a[r])
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;

        // f(l+1, r-1)
        f(a, l + 1, r - 1);
    }

    public static void main(String[] args) {

        // arr
        int[] arr = {1, 3, 2, 3, 1};

        System.out.println("Original: " + Arrays.toString(arr));

        // f(0, n-1)
        f(arr, 0, arr.length - 1);

        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}