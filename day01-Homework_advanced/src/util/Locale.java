package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Locale {
	private static Properties prop;

	static {
		prop = new Properties();
		try {
			String locale = "";
			InputStream configIS = new FileInputStream(new File("config"));
			// InputStream configIS=Locale.class.getResourceAsStream("./config");
			Properties configProp = new Properties();
			configProp.load(configIS);
			locale = configProp.get("locale").toString().trim();
			InputStream inputStream = new FileInputStream(new File(locale));
			// InputStream inputStream = Locale.class.getResourceAsStream(locale);
			prop.load(inputStream);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String getValue(String key) {
		return prop.get(key).toString();
	}
}
