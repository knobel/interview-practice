package hackerrank.Strings_MakingAnagrams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 13.01.2017.
 */
public class Solution {

  public static int numberNeeded(String first, String second) {

    HashMap<Character, Integer> dictionaryFirst = getDictionary(first);
    HashMap<Character, Integer> dictionarySecond = getDictionary(second);

    int result = 0;
    {
      Iterator<Character> iterator = dictionaryFirst.keySet().iterator();
      while (iterator.hasNext()) {
        Character c = iterator.next();
        int countFirst = dictionaryFirst.get(c);
        iterator.remove();
        Integer countSecond = dictionarySecond.remove(c);
        if (countSecond == null)
          countSecond = 0;
        result += Math.abs(countFirst - countSecond);
      }
    }

    {
      Iterator<Character> iterator = dictionaryFirst.keySet().iterator();
      while (iterator.hasNext()) {
        Character c = iterator.next();
        int countFirst = dictionaryFirst.get(c);
        result += countFirst;
      }
    }

    {
      Iterator<Character> iterator = dictionarySecond.keySet().iterator();
      while (iterator.hasNext()) {
        Character c = iterator.next();
        int countSecond = dictionarySecond.get(c);
        result += countSecond;
      }
    }

    return result;
  }

  public static HashMap<Character, Integer> getDictionary(String first) {
    HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
    for (int i = 0; i < first.length(); i++) {
      if (dictionary.containsKey(first.charAt(i))) {
        Integer count = dictionary.get(first.charAt(i));
        dictionary.put(first.charAt(i), ++count);
      } else {
        dictionary.put(first.charAt(i), new Integer(1));
      }
    }
    return dictionary;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(numberNeeded(a, b));
  }
}
