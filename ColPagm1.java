package com.uttara.collections;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColPagm1 {
	   
	    public static void main(String[] args) throws FileNotFoundException{
	    	
	    	Scanner in = new Scanner(new FileReader("C:\\Users\\COMPAQ\\Desktop\\INFOSYS\\input.txt"));
	    	String name=in.next();
	    	int price=in.nextInt();
	    	
             String name1=in.next();
	    	int price1=in.nextInt();
	    	
	    	
	    	
	        HashMap<String, Integer> hmap = new HashMap<>();
            hmap.put(name, price);
            hmap.put(name1, price1);
            


	        int min = Collections.min(hmap.values());
	          int max = Collections.max(hmap.values());
              System.out.println("min "+min);
              System.out.println("max "+max);


	    	PrintWriter out=new PrintWriter("C:\\Users\\COMPAQ\\Desktop\\INFOSYS\\out.txt");
	    	int diff=max-min;
	    	out.println("the difference "+diff);
	    	out.close();

	        
	        System.out.println("difference is "+diff);
	    }
	}
