package hello.sum;

import hello.sum.SumList;
import hello.sum.SumListTest;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SumListTest extends TestCase {
    public SumListTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(SumListTest.class);
    }

    public void testCompute() {
      SumList list = new SumList(new ArrayList<Integer>());
      assertTrue(list.compute() == 0); 
    }
}