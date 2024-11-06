package com.test;

class Animal1 {
    public void eat(Animal1 b) {
        System.out.println("Animal is eating...."); }}


class Lion1 extends Animal1 {
  public void eat(Lion1 l) {
      System.out.println("Lion is eating...."); }}


class Cub1 extends Lion1 {
  public void eat(Cub1 c) {
      System.out.println("Cub is eating...."); }}


public class Test15 {
 public static void main(String[] args) {
      Lion1 a = new Cub1();
      a.eat(a);
      new Cub1().eat(a);
 }
}

