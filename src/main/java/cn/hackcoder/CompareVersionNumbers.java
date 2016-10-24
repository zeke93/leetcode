package cn.hackcoder;

/**
 * Created by thinsky on 16-7-3.
 */
public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int i = 0;
        if (a.length > b.length) {
            for (i = 0; i < b.length; i++) {
                if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                    return 1;
                } else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                    return -1;
                }
            }
            for (; i < a.length; i++) {
                if (Integer.parseInt(a[i]) != 0) {
                    return 1;
                }
            }
        } else if (b.length > a.length) {
            for (i = 0; i < a.length; i++) {
                if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                    return 1;
                } else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                    return -1;
                }
            }
            for (; i < b.length; i++) {
                if (Integer.parseInt(b[i]) != 0) {
                    return -1;
                }
            }
        } else {
            for (i = 0; i < b.length; i++) {
                if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                    return 1;
                } else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1"));
    }
}
