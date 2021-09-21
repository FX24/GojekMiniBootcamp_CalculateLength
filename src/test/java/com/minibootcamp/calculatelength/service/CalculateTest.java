package com.minibootcamp.calculatelength.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {

 @Test
 void calculate() {
  Calculate service = new Calculate();

  double x1 = 0;
  double y1 = 2;
  double x2 = 0;
  double y2 = 0;
  double result = service.calculateLength(x1,y1,x2,y2);

  assertEquals(2.0, result, 0.0);
 }
}
