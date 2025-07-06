package twopoinerandslidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class friutbasketsliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of fruits
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Input fruit types
        }
        int k = 2; // Maximum number of distinct fruits
        int l = 0, r = 0, maxlen = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        while (r < n) {
            mpp.put(a[r], mpp.getOrDefault(a[r], 0) + 1);

            // Adjust window if there are more than k distinct fruits
            while (mpp.size() > k) {
                mpp.put(a[l], mpp.get(a[l]) - 1);
                if (mpp.get(a[l]) == 0) {
                    mpp.remove(a[l]);
                }
                l++;
            }

            // Calculate the maximum window size
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        System.out.println("Maximum number of fruits that can be picked: " + maxlen);
    }
}
