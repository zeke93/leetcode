package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/4.
 */
public class ValidateIPAddress {
    public String validIPAddress(String IP) {
        if (IP.matches(".*[.:]$|^[.:].*")) return "Neither";
        String[] ipv4Strs = IP.split("\\.");
        if (ipv4Strs.length == 4) {
            for (int i = 0; i < ipv4Strs.length; i++) {
                if (!ipv4Strs[i].matches("[0-9]*") || "".equals(ipv4Strs[i]) ||
                        ipv4Strs[i].length() > 3 || Integer.parseInt(ipv4Strs[i]) > 255 || (ipv4Strs[i].startsWith("0") && ipv4Strs[i].length() > 1))
                    return "Neither";
            }
            return "IPv4";
        }
        String[] ipv6Strs = IP.split(":");
        if (ipv6Strs.length == 8) {
            for (int i = 0; i < ipv6Strs.length; i++) {
                if (!ipv6Strs[i].matches("[0-9a-fA-F]*") || "".equals(ipv6Strs[i]) || ipv6Strs[i].length() > 4 || (ipv6Strs[i].matches(".*[A-F].*") && ipv6Strs[i].startsWith("0") && ipv6Strs[i].length() > 1))
                    return "Neither";
            }
            return "IPv6";
        }
        return "Neither";
    }

    public static void main(String[] args) {
//        System.out.println(new ValidateIPAddress().validIPAddress("172.16.254.1"));
//        System.out.println(new ValidateIPAddress().validIPAddress("172.16.254.01"));
//        System.out.println(new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
//        System.out.println(new ValidateIPAddress().validIPAddress("256.256.256.256"));
//        System.out.println(new ValidateIPAddress().validIPAddress("1e1.4.5.6"));
//        System.out.println(new ValidateIPAddress().validIPAddress("12..33.4"));
//        System.out.println(new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
//        System.out.println(new ValidateIPAddress().validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
//        System.out.println(new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(new ValidateIPAddress().validIPAddress("192.0.0.1"));
    }
}
