package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import jp.miyabilink.atm.Bank;

public class BankTest2 extends BankTest {

  @Test
  public void testBankStringString() {
    Bank bank = new Bank("aaa","bbb");
    assertEquals("aaa", bank.getName());
    assertEquals("bbb", bank.getAddress());
  }

}
