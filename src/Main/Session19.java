package Main;

import java.util.Scanner;

import Entity.CountUpThread;

class PrintingThread extends Thread {

  /**
   *
   * @see java.lang.Thread#run()
   * @since x.x Sempu-Mizuha 2018/01/03 <br>
   */
  @Override
  public void run() {
    for (int j = 0; j < 10; j++) {
      System.out.print(j);
    }
    System.out.println("\n");
  }

}





public class Session19 {

  public static void main(String[] args) {
    // 普通の場合
    System.out.println("何か入力してください");
    new Scanner(System.in).nextLine();
    for (int j = 0; j < 10; j++) {
      System.out.print(j);
    }
    System.out.println("\n");


    // スレッド利用
    System.out.println("何か入力してください");
    Thread t = new PrintingThread();
    t.start();
    new Scanner(System.in).nextLine();

    // スレッド実行(並列処理を下手に行うとカオスなことになることがわかる)
    Thread count1 = new CountUpThread();
    Thread count2 = new CountUpThread();
    Thread count3 = new CountUpThread();

    count1.start();
    count2.start();
    count3.start();


  }

}
