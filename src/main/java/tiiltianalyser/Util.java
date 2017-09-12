package tiiltianalyser;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

	public static String dateFormat = "dd-MM-yyyy hh:mm";
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

	public static String convertMilistoDate(String timestamp) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(Long.parseLong(timestamp));
		return simpleDateFormat.format(calendar.getTime());
	}

}
