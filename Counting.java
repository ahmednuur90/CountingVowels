import java.util.*;
import java.io.*;

public class Counting{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String sentence;

		int a = 0;		//going to be used to count the number of each individual vowel
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int total = 0;

		System.out.println("Enter a sentence and I'll tell you what vowels there are and how many!");
		sentence = sc.nextLine();		//entering a sentence

		String[] words = sentence.split(" ");		//splits the sentence into seperate words

		for(int k = 0; k < words.length; k++){		//goes through every word
			for(int j = 0; j < words[k].length(); j++){
				if(words[k].charAt(j) == 'a' || words[k].charAt(j) == 'A'){
					a += 1;
				}
				else if(words[k].charAt(j) == 'e' || words[k].charAt(j) == 'E'){//adding the letters to their respective vowels
					e += 1;
				}	
				else if(words[k].charAt(j) == 'i' || words[k].charAt(j) == 'I'){ //making sure that both cases are considered
					i += 1;
				}
				else if(words[k].charAt(j) == 'o' || words[k].charAt(j) == 'O'){
					o += 1;
				}
				else if(words[k].charAt(j) == 'u' || words[k].charAt(j) == 'U'){
					u += 1;
				}
			}
		}

		total = a + e + i + o + u;
		

		System.out.println("Here are the vowels that you have: ");		
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("The total number of vowels is: " + total);
	}
}