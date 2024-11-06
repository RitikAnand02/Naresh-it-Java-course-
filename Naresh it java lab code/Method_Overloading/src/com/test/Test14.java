package com.test;

class Animal {
    public void eat(Animal b) {
        System.out.println("Animal is eating....");}}
class Lion extends Animal {
  public void eat(Lion l) {
      System.out.println("Lion is eating....");}}
class Cub extends Lion {
  public void eat(Cub c) {
      System.out.println("Cub is eating....");}}
public class Test14 {
 public static void main(String[] args) {
      Animal a = new Cub();
      a.eat(a);
      a.eat((Cub)a);
 }
}
