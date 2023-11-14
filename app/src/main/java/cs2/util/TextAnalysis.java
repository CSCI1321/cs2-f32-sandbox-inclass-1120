package cs2.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TextAnalysis {
  
  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<String>();
    try {
      File file = new File(filename);
      Scanner fin = new Scanner(file);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          String word = parts[i].replaceAll("[^A-Za-z]", "");
          words.add(word.toLowerCase());
        }
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    return words;
  }
  public static HashMap<String,Integer> countWords(String filename) {
    HashMap<String,Integer> words = new HashMap<String,Integer>();
    try {
      File file = new File(filename);
      Scanner fin = new Scanner(file);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          String word = parts[i].replaceAll("[^A-Za-z]", "");
          //words.add(word.toLowerCase());
          word = word.toLowerCase();
          if(words.containsKey(word)) {
            words.put(word, 1 + words.get(word));
          } else {
            words.put(word, 1);
          }
        }
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    words.remove("");
    return words;
  }
  public static void main(String[] args) {
    Map<String, Integer> tempestCounts = countWords("tempest.txt");
    System.out.println(tempestCounts);
    System.out.println(tempestCounts.size());

    Iterator<String> it = tempestCounts.keySet().iterator();
    while(it.hasNext()) {
      String key = it.next();
      if(tempestCounts.get(key) > 100) {
        System.out.println(key + ": " + tempestCounts.get(key));
      }
    }
    for(String key : tempestCounts.keySet()) {
      if(tempestCounts.get(key) > 100) {
        System.out.println(key + ": " + tempestCounts.get(key));
      }
    }
    /*
    for(Map.Entry<String,Integer> entry : tempestCounts) {
      if(entry.getValue() > 100) {
        System.out.println(entry.getKey());
      }
    }*/


    /*
    HashSet<String> myWords = getWords("tempest.txt");
    HashSet<String> midWords = getWords("midsummer.txt");
    System.out.println(myWords.size());
    System.out.println(midWords.size());

    myWords.removeAll(midWords);
    System.out.println(myWords);
    System.out.println(myWords.size());
    */
  }

}
