package Entity;

public class CountUpThread extends Thread {

  /**
   *
   * @see java.lang.Thread#run()
   * @since x.x Sempu-Mizuha 2018/01/03 <br>
   */
  @Override
  public void run() {
    for (int i = 0; i <= 50; i++) {
      System.out.printf("%4d",i);
    }
    System.out.println();
  }

}
