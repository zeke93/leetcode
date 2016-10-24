package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i=s.length()-1;i>=0;i--){
            sum+=Math.pow(26,s.length()-i-1)*(s.charAt(i)-'A'+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AB"));
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("A"));
    }
}
