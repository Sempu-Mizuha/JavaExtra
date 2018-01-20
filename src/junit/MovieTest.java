/**
 * パッケージ.クラス名:
 * junit.MovieTest
 */
package junit;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import jp.miyabilink.atm.Movie;

/**
 * MovieクラスをJUnitでテストするクラス.
 * @author Sempu-Mizuha
 * @version 1.0
 * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
 */
public class MovieTest {
  /**
   * テスト用Movieクラス.
   * @since 1.0 Sempu-Mizuha 2018/01/01 <br>
   */
  private static Movie target;
  /**
   * テスト用Movieクラスを作成する.
   * @throws java.lang.Exception クラスの作成に失敗した場合
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @BeforeClass
  public static void getTestClass()  throws Exception {
      target = new Movie();
  }

  /**
   * テスト終了を知らせる.
   * @throws java.lang.Exception クラスの作成に失敗した場合
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    StringBuilder sb = new StringBuilder();
    System.out.println(
        sb.append(target.getClass().getName()).append("のテストが終了しました。")
        );
  }

  /**
   * 例外処理を詳細にテストできるようにする.
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * {@link jp.miyabilink.atm.Movie#Movie(java.lang.String)} のためのテスト・メソッド.
   * タイトルのみを指定してnewが可能.
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testMovieStringNew() {
    Movie movie = new Movie("タイトル");
    assertEquals("タイトル", movie.getTitle());
    assertNull(movie.getRelease());
  }

  /**
   * {@link jp.miyabilink.atm.Movie#Movie(java.lang.String)} のためのテスト・メソッド.
   * タイトルにnullはセットできない.
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testMovieStringNull() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("タイトルにnullはセットできません。");
    new Movie(null);
  }

  /**
   * {@link jp.miyabilink.atm.Movie#Movie()} のためのテスト・メソッド.
   * 因数なしでnewが可能.
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testMovieNew() {
    Movie movie = new Movie();
    assertNull(movie.getTitle());
    assertNull(movie.getRelease());
  }

  /**
   * {@link jp.miyabilink.atm.Movie#setTitle(java.lang.String)} のためのテスト・メソッド.
   * タイトルのgetter/setter確認
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testSetTitleOK() {
    target.setTitle("aoaoaoao");
    assertEquals("aoaoaoao", target.getTitle());
  }

  /**
   * {@link jp.miyabilink.atm.Movie#setTitle(java.lang.String)} のためのテスト・メソッド.
   * タイトルにNullがセットできない。
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testSetTitleNull() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("タイトルにnullはセットできません。");
    target.setTitle(null);
//    fail("正当な例外処理を行いませんでした。");
  }

  /**
   * {@link jp.miyabilink.atm.Movie#setRelease(java.time.LocalDate)}
   * のためのテスト・メソッド.
   * リリース日のgetter/setter確認
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testSetReleaseOK() {
    LocalDate ld1 = LocalDate.of(2017, 3, 1);
    target.setRelease(ld1);
    assertEquals(ld1, target.getRelease());
  }

  /**
   * {@link jp.miyabilink.atm.Movie#setRelease(java.time.LocalDate)}
   * のためのテスト・メソッド.
   * リリース日にNullがセットできない。
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testSetReleaseNull() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("リリース日にnullはセットできません。");
    target.setRelease(null);
  }

  /**
   * {@link jp.miyabilink.atm.Movie#setRelease(java.time.LocalDate)}
   * のためのテスト・メソッド.
   * 公開日は現在より未来の日付を指定できない
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:29:45 <br>
   */
  @Test
  public void testSetReleaseNotFuture() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("公開日は現在より未来の日付を指定できません。");
    target.setRelease(LocalDate.of(2018, 1, 2));
  }



}
