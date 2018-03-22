/**
 * John Locklear
 * IT2045C002/ Spring
 * Assignment 07
 */
package alphaCounter;	

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class alphaCounter {

 
	public static void main(String[] args) throws IOException {
		 // pass the path to the file as a parameter
	    FileReader file = new FileReader("E:\\locklejr_Assignment07\\src\\alphaCounter\\words.txt");
	    BufferedReader reader = new BufferedReader(file);
	    /**
	     *this is the hash map used to store the amount of letters 
	     */
	    HashMap<Character,Integer> myHashSet = new HashMap<Character, Integer>();// I used a hashMap to store the ammount of letters found instead of an array
	    /**
	     * after going through the loop the letter amounts are stored here 
	     */
	    myHashSet.put('a', 0);
	    myHashSet.put('b', 0);
	    myHashSet.put('c', 0);
	    myHashSet.put('d', 0);
	    myHashSet.put('e', 0);
	    myHashSet.put('f', 0);
	    myHashSet.put('g', 0);
	    myHashSet.put('h', 0);
	    myHashSet.put('i', 0);
	    myHashSet.put('j', 0);
	    myHashSet.put('k', 0);
	    myHashSet.put('l', 0);
	    myHashSet.put('m', 0);
	    myHashSet.put('n', 0);
	    myHashSet.put('o', 0);
	    myHashSet.put('p', 0);
	    myHashSet.put('q', 0);
	    myHashSet.put('r', 0);
	    myHashSet.put('s', 0);
	    myHashSet.put('t', 0);
	    myHashSet.put('u', 0);
	    myHashSet.put('v', 0);
	    myHashSet.put('w', 0);
	    myHashSet.put('x', 0);
	    myHashSet.put('y', 0);
	    myHashSet.put('z', 0);
	    
	    /**
	     * these are the variables for storng my answers 
	     */
	    String bigWord = "";
	    int mostCommon = 0;
	    char mostCommonLtr = ' ';
	    int leastCommont = Integer.MAX_VALUE;
	    char leastCommonLtr = ' ';
	    		
	    
	   
	    Object[] words = reader.lines().toArray();
	    
	    /**
	     * this loop has changed all the letters to lower case
	     */
	    for(Object word : words){
	    	String wordString = word.toString();
	    	wordString = wordString.toLowerCase();
	    	/**
	    	 * 
	    	 */
	    	if(wordString.length() > bigWord.length()){
	    		bigWord = wordString;
	    	}
	    	/**
	    	 * this will find the longest word
	    	 */
	    	for(int alpha = 0; alpha < wordString.length(); alpha++){
	    		myHashSet.put(wordString.charAt(alpha), myHashSet.get(wordString.charAt(alpha)) + 1);
	    	}
	    	
	    }
	    
	    /**
	     * these loops count the number of letters
	     */
	    for(int alpha = 'a'; alpha<= 'z'; alpha++){
	    	System.out.println("Number of " + (char)alpha +  "'s is = " + myHashSet.get((char)alpha ));
	    	
	    	if(myHashSet.get((char)alpha) > mostCommon)  {
	    		mostCommonLtr = (char)alpha;
	    		mostCommon = myHashSet.get((char)alpha); 
	    		/**
	    		 * this loop moves through the letters and gave me the most common letter
	    		 */
	    	}
	    	 
	    	if(myHashSet.get((char)alpha) < leastCommont)  {
	    		leastCommonLtr = (char)alpha;
	    		leastCommont = myHashSet.get((char)alpha);
	    		/**
	    		 * this  gives me the least common letter 
	    		 */
	    	}	
	    	
	    }
	    
	   
	    System.out.println("The letter that appeared the least is " + leastCommonLtr);	
	    	
	    System.out.println("The letter that appears the most is " + mostCommonLtr);	
	    
	    System.out.println("This is the longest word = " + bigWord);
	    
	  }
	
	}


