package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/14.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int size = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        if (numRows == 1) return s;
        while (index < s.length()) {
            sb.append(s.charAt(index));
            index += size;
        }
        for (int row = 2; row < numRows; row++) {
            index = row;
            while (index <= s.length()) {
                sb.append(s.charAt(index - 1));
                int diff = size - 2 * (row - 1);
                if ((index + diff) <= s.length()) {
                    sb.append(s.charAt(index + diff - 1));
                }
                index += size;
            }

        }
        index = numRows - 1;
        while (index < s.length()) {
            sb.append(s.charAt(index));
            index += size;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("ABCD", 1));
    }
}
