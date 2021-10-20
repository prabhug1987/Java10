package com.example.java10;

import java.lang.Runtime.Version;

public class VersionExample {
	
	public static void main(String[] args) {
		Version version = Runtime.version();
		
		
		System.out.println(version.feature());
		System.out.println(version.interim());
		System.out.println(version.update());
		System.out.println(version.patch());
		
		version = Runtime.Version.parse("10.0.1");
		
	}

}
