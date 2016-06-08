package word.counts.docs;

import junit.framework.Test;
import junit.framework.TestSuite;
import word.frequency.doc.WordFreqMapperTest;
import word.frequency.doc.WordFreqReducerTest;
 
/**
 * All tests for the TF-IDF algorithm
 * Hadoop 0.20.1 API
 * @author Marcello de Sales (marcello.desales@gmail.com)
 */
public final class AllTests  {
 
  private AllTests() { }
 
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for the TF-IDF algorithm");
 
    suite.addTestSuite(WordFreqMapperTest.class);
    suite.addTestSuite(WordFreqReducerTest.class);
    suite.addTestSuite(WordCountsForDocsMapperTest.class);
    suite.addTestSuite(WordCountsForDocsReducerTest.class);
 
    return suite;
  }
}