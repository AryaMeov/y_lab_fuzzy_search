package com.y.lab.fuzzy.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuzzySearchUtilTest {

    @Test
    public void testCar() {
        var actual = FuzzySearchUtil.fuzzySearch("car", "ca6$$#_rtwheel");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testCwhl() {
        var actual =  FuzzySearchUtil.fuzzySearch("cwhl", "cartwheel");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testCwhee() {
        var actual =  FuzzySearchUtil.fuzzySearch("cwhee", "cartwheel");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testCartwheel() {
        var actual =  FuzzySearchUtil.fuzzySearch("cartwheel", "cartwheel");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testCwheeel() {
        var actual =  FuzzySearchUtil.fuzzySearch("cwheeel", "cartwheel");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testLw() {
        var actual =  FuzzySearchUtil.fuzzySearch("lw", "cartwheel");
        Assertions.assertFalse(actual);
    }
}
