package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thinsky on 16-7-4.
 */
public class ExcelSheetColumnTitle {
    String alphabet = "ZABCDEFGHIJKLMNOPQRSTUVWXY";

    public String convertToTitle(int n) {
        List<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        System.out.println(n);
        while (n != 0) {
            list.add(n % 26);
            n = n / 26;
        }
        boolean hasZero = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0 && hasZero && list.get(i) - 1 != 0) {
                sb.append(alphabet.charAt(list.get(i) - 1));
            } else if (list.get(i) != 0 ) {
                sb.append(alphabet.charAt(list.get(i)));
            } else if (i != list.size() - 1 && list.get(i) == 0) {
                sb.append(alphabet.charAt(list.get(i)));
                hasZero = true;
                if (i != list.size() - 1 && list.get(i + 1) != 0) {
                    list.set(i + 1, list.get(i + 1) - 1);
                }
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(1));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(52));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(53));
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(702));
    }
}
