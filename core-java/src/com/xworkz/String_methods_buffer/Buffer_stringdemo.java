package com.xworkz.String_methods_buffer;

public class Buffer_stringdemo {

	public static void main(String[] args) {
        StringBuffer place=new StringBuffer("tajmahal");
        place.append("place");

        System.out.println(place);
        System.out.println(place.capacity());
}

}
