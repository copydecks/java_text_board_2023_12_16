package org.ost.exam.board;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 게시판 시작 ==");
    System.out.printf("(명령)");
    String cmd = sc.nextLine();
    System.out.printf("입력된 명령어 : %s\n",cmd);
    System.out.println("== 게시판 실행 끝 ==");

    sc.close();
  }
}