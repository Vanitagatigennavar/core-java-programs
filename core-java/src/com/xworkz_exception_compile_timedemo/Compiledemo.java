package com.xworkz_exception_compile_timedemo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Compiledemo {
public static void main(String[] args) {
	try {
		FileReader fd=new FileReader("D:\\JavatestSECOND.txt");
		BufferedReader br=new BufferedReader(fd);
		System.out.println(br.readLine());
		} catch (IOException e) {
		e.printStackTrace();
	   	System.out.println("Exception caught");
	}
  }
}
