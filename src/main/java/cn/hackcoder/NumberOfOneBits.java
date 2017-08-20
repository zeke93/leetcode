package cn.hackcoder;

/**
 * 利用无符号移位操作符，循环移位计算最后一位是不是1将结果累加即可。
 * Created by Thinsky on 16/2/28.
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
