package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/24.
 */
public class CountAndSay {
    //1, 11, 21, 1211, 111221
    public String countAndSay(int n) {
        String s = "1";
        while (--n > 0) {
            s = compute(s);
        }
        return s;
    }

    public String compute(String s) {
        String result = "";
        int n = 1;
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                n++;
            } else {
                result += n + "" + s.charAt(i);
                n = 1;
            }
        }
        result += n + "" + s.charAt(i);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(1));
        System.out.println(new CountAndSay().countAndSay(2));
        System.out.println(new CountAndSay().countAndSay(3));
        System.out.println(new CountAndSay().countAndSay(4));
        System.out.println(new CountAndSay().countAndSay(5));
    }
}
