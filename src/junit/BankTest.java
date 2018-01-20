/**
 * パッケージ.クラス名:
 * junit.BankTest
 */
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import jp.miyabilink.atm.Bank;

/**
 * TODO 作成したクラスの説明を↓に記載 & x.xにバージョンを記載:この行は削除すること
 * {@link jp.miyabilink.atm.Bank} を行うJUnitテストクラス
 * @author Sempu-Mizuha
 * @version 1.0
 * @since 1.0 Sempu-Mizuha 2017/12/30 12:33:52 <br>
 */
public class BankTest {

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 全角2文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSetNameStringLengthZsnkaku2() {
    Bank bank = new Bank();
    bank.setName("ああ");
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 半角2文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSetNameStringLengthHankaku2() {
    Bank bank = new Bank();
    bank.setName("1a");
    fail("ここまで到達できません");
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 全角3文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test
  public void testSetNameStringLengthZsnkaku3() {
    Bank bank = new Bank();
    bank.setName("ああう");
    assertEquals("ああう", bank.getName());
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 半角3文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test
  public void testSetNameStringLengthHankaku3() {
    Bank bank = new Bank();
    bank.setName("1a3");
    assertEquals("1a3", bank.getName());
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 全角4文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test
  public void testSetNameStringLengthZsnkaku4() {
    Bank bank = new Bank();
    bank.setName("ああうお");
    // assertEquals("ああうお", bank.getName());
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * 半角4文字を入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test
  public void testSetNameStringLengthHankaku4() {
    Bank bank = new Bank();
    bank.setName("1a3o");
    assertEquals("1a3o", bank.getName());
  }

  /**
   * {@link jp.miyabilink.atm.Bank#setName(java.lang.String)} のためのテスト・メソッド。
   * Nullを入れる
   * @since 1.0 Sempu-Mizuha 2017/12/30 12:36:06 <br>
   */
  @Test(expected = NullPointerException.class)
  public void testSetNameInputNull() {
    Bank bank = new Bank();
    bank.setName(null);
  }





}
