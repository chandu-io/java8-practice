package com.chandu.java8.practice.examples;

import java.util.function.Consumer;

public class C02 implements Runnable {

  @Override
  public void run() {
    Resource.consume(r -> {
      r.op1();
      r.op2();
    });
  }
}

class Resource {
  private Resource() {
    System.out.println("Initializing...");
  }

  public void op1() {
    System.out.println("openration 1");
  }

  public void op2() {
    System.out.println("openration 2");
  }

  private void close() {
    System.out.println("Cleaning up...");
  }

  public static void consume(final Consumer<Resource> block) {
    final Resource resource = new Resource();
    try {
      block.accept(resource);
    } finally {
      resource.close();
    }
  }
}