package Main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Pra2 {

	public static void main(String[] args) {
		// Date型を使う
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));

		// timeパッケージを使う
		LocalDate localDate = LocalDate.now();
		LocalDate futureLocalDate = localDate.plusDays(100);
		DateTimeFormatter dateTimeFormatter
				= DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(futureLocalDate.format(dateTimeFormatter));

	}

}
