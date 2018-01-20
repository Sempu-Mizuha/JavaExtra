/**
 * パッケージ.クラス名:
 * jp.miyabilink.atm.Movie
 */
package jp.miyabilink.atm;

import java.time.LocalDate;

/**
 * 映画のタイトルとリリース日を管理するクラス.
 * @author Sempu-Mizuha
 * @version 1.0
 * @since 1.0 Sempu-Mizuha 2018/01/01 18:21:39 <br>
 */
public class Movie {
  /**
   * 映画タイトル.
   * @since 1.0 Sempu-Mizuha 2018/01/01 19:08:17 <br>
   */
  private String title;
  /**
   * 映画リリース日.
   * @since 1.0 Sempu-Mizuha 2018/01/01 19:08:29 <br>
   */
  private LocalDate release;


  /**
   * 映画クラスのコンストラクタ.
   * @param title 映画タイトル
   * @throws IllegalArgumentException
   *         title に null が入った場合。
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:25:36 <br>
   */
  public Movie(final String title) {
    if (title == null) {
      throw new IllegalArgumentException("タイトルにnullはセットできません。");
    }
    this.title = title;
  }


  /**
   * 映画クラスのコンストラクタ.
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:21:39 <br>
   */
  public Movie() {
  }


  /**
   * titleを取得するメソッド.
   * @return titleを取得する
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:26:39 <br>
   */
  public String getTitle() {
    return title;
  }


  /**
   * titleを登録するメソッド.
   * @param title titleを登録する
   * @throws IllegalArgumentException
   *         title に null が入った場合。
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:26:39 <br>
   */
  public void setTitle(final String title) {
    if (title == null) {
      throw new IllegalArgumentException("タイトルにnullはセットできません。");
    }
    this.title = title;
  }


  /**
   * releaseを取得するメソッド.
   * @return releaseを取得する
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:26:39 <br>
   */
  public LocalDate getRelease() {
    return release;
  }


  /**
   * releaseを登録するメソッド.
   * @param release releaseを登録する
   * @throws IllegalArgumentException
   *         release に null が入った場合。release に 現在より未来の日付が指定された場合。
   * @since 1.0 Sempu-Mizuha 2018/01/01 18:26:39 <br>
   */
  public void setRelease(final LocalDate release) {
    if (release == null) {
      throw new IllegalArgumentException("リリース日にnullはセットできません。");
    }
    if (release.isAfter(LocalDate.now())) {
      throw new IllegalArgumentException("公開日は現在より未来の日付を指定できません。");
    }
    this.release = release;
  }




}
