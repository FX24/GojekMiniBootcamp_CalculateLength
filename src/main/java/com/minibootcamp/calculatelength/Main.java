package com.minibootcamp.calculatelength;

import com.minibootcamp.calculatelength.service.Calculate;

public class Main {
 public static void main(String[] args) {
  Calculate calculateService = new Calculate();
  System.out.println(calculateService.calculateLength(1.0,1.0,1.0,4.0));
 }
}
