package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, BankTest.class, BankTest2.class,
    MovieTest.class, sample.class })

public class AllTests {

}
