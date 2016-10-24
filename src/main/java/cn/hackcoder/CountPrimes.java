package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/25.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (isNotPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isNotPrime[j] = true;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        new CountPrimes().countPrimes(1000);
    }
}
