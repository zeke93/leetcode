package cn.hackcoder;

/**
 * 1108. Defanging an IP Address
 */
public class DefangingAnIPAddress {
	public String defangIPaddr(String address) {
		return address.replaceAll("\\.", "[.]");
	}

	public static void main(String[] args) {
		System.out.println(new DefangingAnIPAddress().defangIPaddr("1.1.1.1"));
		System.out.println(new DefangingAnIPAddress().defangIPaddr("255.100.50.0"));
	}
}
