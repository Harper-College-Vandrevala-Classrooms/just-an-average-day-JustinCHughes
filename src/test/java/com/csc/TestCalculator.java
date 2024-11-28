package com.csc;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  @BeforeEach
  void setUp() {
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testForMax() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(423345, Calculator.forMax(nums));
  }

  @Test
  void testForMin() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(-125242, Calculator.forMin(nums));
  }

  @Test
  void testForSum() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(298454, Calculator.forSum(nums));
  }

  @Test
  void testForAverage() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(22958, Calculator.forAverage(nums),.001);
  }

  @Test
  void testStreamMax() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(423345, Calculator.streamMax(nums));
  }

  @Test
  void testStreamMin() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(-125242, Calculator.streamMin(nums));
  }

  @Test
  void testStreamSum() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(298454, Calculator.streamSum(nums));
  }

  @Test
  void testStreamAverage() {
    int[] nums = {0,1,2,-3,-20,20,32,123,423345,342,-123,-125242,-23};
    assertEquals(22958, Calculator.streamAverage(nums),.001);
  }

  @Test
  void testEvens() {
    int[] nums = {0,1,2,3,4,5,6,7,8,9};
    int[] ans = {0,2,4,6,8};
    assertTrue(Arrays.equals(ans, Calculator.evens(nums)));
  }

  @Test
  void testOdds() {
    int[] nums = {0,1,2,3,4,5,6,7,8,9};
    int[] ans = {1,3,5,7,9};
    assertTrue(Arrays.equals(ans, Calculator.odds(nums)));
  }

  @Test
  void testSquares() {
    int[] nums = {0,1,2,3,4,5,6,7,8,9};
    int[] ans = {0,1,4,9,16,25,36,49,64,81};
    assertTrue(Arrays.equals(ans, Calculator.square(nums)));
  }

  @Test
  void testAddFive() {
    int[] nums = {0,1,2,3,4,5,6,7,8,9};
    int[] ans = {5,6,7,8,9,10,11,12,13,14};
    assertTrue(Arrays.equals(ans, Calculator.addFive(nums)));
  }
}
