package com.duoduolicai360.utils_library.utils.encrypt.des;


public class DesDemo {
	public static void main(String[] args) throws Exception {
		String data = "强大的黑马51期";
		String key = "wang!@#$%";
		System.err.println(DesHelper.encrypt(data, key));
//		System.err.println(DesHelper.decrypt(encrypt(data, key), key));

	}

}
