
package com.djs.learn.javalang.unicode;

import java.util.Formatter;

// The file format should be UTF-8, UTF-16.

public class UnicodeTest
{
	public static String bytesToHexString(byte[] array){
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			temp.append((new Formatter()).format("0x%02X", array[i]));

			if (i < (array.length - 1)) {
				temp.append(", ");
			}
		}

		return temp.toString();
	}

	public static void main(String[] args){
		Utf8 utf8 = new Utf8();
		Utf16 utf16 = new Utf16();
		Utf16_2 utf16_2 = new Utf16_2();

		try {
			System.out.println("============================================================");

			utf8.test();

			System.out.println("============================================================");

			utf16.test();

			System.out.println("============================================================");

			utf16_2.test();

			System.out.println("============================================================");
			System.out.println();

			// System.out.println( "====== System property ======== " );
			// System.getProperties().list( System.out );
		} catch (Exception e) {
			System.err.println("Exception =" + e);
		}
	}
}
