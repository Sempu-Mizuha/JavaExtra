package Main;

import Entity.SingletonFlower;

public class Session18 {

  public static void main(String[] args) {
//    SingletonFlower flower = new SingletonFlower(); // エラー
    @SuppressWarnings("unused")
    SingletonFlower flower = SingletonFlower.getInstance(); // OK
  }

}
