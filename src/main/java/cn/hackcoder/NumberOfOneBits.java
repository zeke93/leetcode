package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/28.
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
