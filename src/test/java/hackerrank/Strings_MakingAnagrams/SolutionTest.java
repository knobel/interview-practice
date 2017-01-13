package hackerrank.Strings_MakingAnagrams;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Michal Knobel on 13.01.2017.
 */
public class SolutionTest {
  @Test
  public void numberNeeded() throws Exception {
    String a = "cde";
    String b = "abc";
    assertEquals(4, Solution.numberNeeded(a,b));
  }

  @Test
  public void getDictionary() throws Exception {
    String testString = "qwertzuiopp";
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('q'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('w'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('e'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('r'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('t'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('z'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('u'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('i'));
    assertEquals(new Integer(1),Solution.getDictionary(testString).get('o'));
    assertEquals(new Integer(2),Solution.getDictionary(testString).get('p'));
  }

}