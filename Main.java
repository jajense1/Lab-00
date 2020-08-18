import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<7; i++){
      if(i==0 || i==6)
      System.out.println("*  *****  *****");
      else
        System.out.println("*  *   *  *   *");
    }
    System.out.println("Hello, What is your name?");
    String name = sc.nextLine();
    System.out.println("Hello, " + name);
}}





