package com.rakuten.ems.date_time;

public class AlphabetIndex {
	
	    public static void main(String[] args) {
	        String str = "The quick brown fox jumps over the lazy dog";
	        str = str.toLowerCase(); // convert to lower case to ignore case sensitivity
	        int[] index = new int[26]; // create an array to store the index of each alphabet
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') { // check if the character is an alphabet
	                index[ch - 'a'] = i; // store the index of the alphabet
	            }
	        }
	        // display the index of each alphabet
	        for (int i = 0; i < 26; i++) {
	            char ch = (char) ('a' + i);
	            System.out.println(ch + "-> " + index[i]);
	        }
	    }
	}



