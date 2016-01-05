package com.chandu.java8.practice.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C01 implements Runnable {

  public static boolean isPrime(final int number) {
    return number > 1
        && IntStream.range(2, number)
            .noneMatch(i -> number % i == 0);
  }

  @Override
  public void run() {
    final List<String> sqrtOfFirst10Primes = Stream.iterate(1, n -> n + 1)
        .filter(C01::isPrime)
        .map(Math::sqrt)
        .limit(10)
        .map(n -> String.format("%.3f", n))
        .collect(Collectors.toList());
    System.out.println(sqrtOfFirst10Primes);
  }
}
