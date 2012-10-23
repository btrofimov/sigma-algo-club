package algorithms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;

public class ToolsTest extends TestCase {
    public ToolsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ToolsTest.class);
    }

    public void testMerge() {
        int[] actuals = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] expecteds = new int[] { 1, 2, 3, 4, 5, 6 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { 1, 2, 3, 4, 5 };
        expecteds = new int[] { 1, 2, 3, 4, 5 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { -1, -2, -3, -4, -5 };
        expecteds = new int[] { -3, -4, -5, -1, -2 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { 6, 5, 4, 3, 2, 1 };
        expecteds = new int[] { 3, 2, 1, 6, 5, 4 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { 5, 4, 3, 2, 1 };
        expecteds = new int[] { 3, 2, 1, 5, 4 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { -5, -4, -3, -2, -1 };
        expecteds = new int[] { -5, -4, -3, -2, -1 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { 1, 8, 3, 6, 5 };
        expecteds = new int[] { 1, 3, 6, 5, 8 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);

        actuals = new int[] { 1, -8, 3, -6, 5 };
        expecteds = new int[] { 1, -8, 3, -6, 5 };
        Tools.merge(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }
}
