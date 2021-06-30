package com.blogging.Stringsexample;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a = new String("Java");//Created using new keyword
		  String b = new String("Java");
	      
	      String c = "Java";//created using string literal
	      String d = "Java";
	      
	      System.out.println(a.equals(b));
	      System.out.println(a.equals(c));//True because equals() compares content
	      System.out.println(a.equals(d));
	      System.out.println(c.equals(d));
	      System.out.println(a==b);//False because compares the address value
	      System.out.println(b==c);
	      System.out.println(a==d);
	      System.out.println(c==d);
	      
	      
	      String blog = new String("Hello this is easyjavatechprogramming");
	      
	      blog.replace("Hello", "Hi");//The word that has to be replaced is mentioned first and
	                                 //then the new string that will replace the old one is mentioned second.
	      System.out.println(blog);//This wont work because strings are immutable.
	      
	      System.out.println("\nAfter assigning it to blog");
	      blog = blog.replace("Hello", "Hi");
	      System.out.println(blog);
	      
	      System.out.println("\nThe length of the string blog is "+blog.length());
	      System.out.println("The character at index 4 is "+blog.charAt(4));//starting from index zero.
	      System.out.println("The index of character t in the string is "+blog.indexOf('t'));
	      System.out.println("After concating with the string c "+blog.concat(c));
	      System.out.println("The sub string of the string blog starting from the index 5 "+blog.substring(5));
	      System.out.println("To check if the given string is empty "+blog.isEmpty());
	      
	      
	     

	}

}
