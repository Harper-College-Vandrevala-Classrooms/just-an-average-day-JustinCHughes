package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
