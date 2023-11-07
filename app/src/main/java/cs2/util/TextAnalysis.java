package cs2.util;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class TextAnalysis {
  
  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<String>();
    try {
      File file = new File(filename);
      Scanner fin = new Scanner(file);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split(" ");
        for(int i=0; i<parts.length; i++) {
          words.add(parts[i]);
        }
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    return words;
  }
  public static void main(String[] args) {
    HashSet<String> myWords = getWords("tempest.txt");
    System.out.println(myWords);
    System.out.println(myWords.size()); 
  }

}
