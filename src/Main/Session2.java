package Main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Session2 {

	public static void main(String[] args) {
		// 詳細は入門で…
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1316622225935L);
		System.out.println(past);

		System.out.println("------------------------------------");

		// 以降はjava8のみの機能
		// java7以前では使えないので、使う場合は以下を利用(完全一致ではない&世界標準的なものはない)
		// http://shinsuke789.hatenablog.jp/entry/2013/08/05/120042
		// https://qiita.com/rubytomato@github/items/a9abb4f766e905c0c227
		// Instant
		Instant i1 = Instant.now(); //以前のDate 現在の世界標準時間 (経過時間等を示せる)
		System.out.println(i1);

		// Instantとlongの相互変換
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		System.out.println(i2);
		long l = i2.toEpochMilli();
		System.out.println(l);

		// ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now(); //以前のDate&Calender 現在の時間(地域指定入り)
		System.out.println(z1);
		ZonedDateTime z2
				= ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println(z2);

		System.out.println("------------------------------------");

		// InstantとZoneddateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		// ZonedDateTimeの利用
		System.out.println("東京：" + z2.getYear() + z2.getMonth()
								+ z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear()+ z3.getMonth()
								+ z3.getDayOfMonth());
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ時間を示しています");
		}

		System.out.println("------------------------------------");

		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now(); // 以前のDate&Calender 現在の時間
		System.out.println(l1);
		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);
		System.out.println(l2);

		// LocalDateTimeとZonedDateTimeの相互変換
		z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);

		MonthDay md1 = MonthDay.now();
		System.out.println(md1);

		System.out.println("------------------------------------");

		// 文字列からLocalDateを生成
		DateTimeFormatter f
			= DateTimeFormatter.ofPattern("yyyy/MM/dd"); //以前のSimpleDateFormat
		LocalDate d = LocalDate.parse("2011/08/21", f);
		System.out.println(d);

		// 1000日後を計算する
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);

		// 現在日付との比較
		LocalDate nowLocalDate = LocalDate.now();
		if(nowLocalDate.isAfter(d)) {
			System.out.println
				("nowLocalDate:" + nowLocalDate + "はd:" + d + "より新しい");
		}

		System.out.println("------------------------------------");

		// 期間指定(Java7以前まではLong型しかなかった…)
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);

		System.out.println(d1.compareTo(d2));

		// 3日を表すPeriodを2通りの方法で生成
		@SuppressWarnings("unused")
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		System.out.println(p2.getDays());

		// d2のさらに3日後を計算する。
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);


	}

}
