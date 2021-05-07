package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void notBalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("(]"));
    }

    @Test
    public void backwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void fourBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void catchSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void catchesSingleBracketWithWords() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch"));
    }

    @Test
    public void startsWithClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    @Test
    public void twoOpensTwoCloses() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void hasThreeOpenClose() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("At least has " +
                "brackets"));
    }


}
