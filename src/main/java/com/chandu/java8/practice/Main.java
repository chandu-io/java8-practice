package com.chandu.java8.practice;

import com.chandu.java8.practice.examples.C01;
import com.chandu.java8.practice.examples.C02;

public class Main {

  public static void main(final String[] args) {
    new Thread(new C01()).start();
    new Thread(new C02()).start();
  }
}
