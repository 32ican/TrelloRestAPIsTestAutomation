package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CredentialManager {

	private static final String CREDS_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\creds.Properties";
	private static Properties creds = new Properties();
	private static final String TOKEN_KEY = "token";
	private static final String SECRET_KEY = "secret";
	private static final String API_KEY = "api.key";

	static {
		loadCreds();
	}

	public static String getToken() {
		return getCreds(TOKEN_KEY);
	}

	public static String getSecret() {
		return getCreds(SECRET_KEY);
	}

	public static String getAPIKey() {
		return getCreds(API_KEY);
	}

	private static String getCreds(String key) {
		return creds.getProperty(key);
	}

	private static Properties loadCreds() {
		try {
			FileInputStream fis = new FileInputStream(CREDS_PATH);
			creds.load(fis);

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot load credentials from creds.properties file.......!");
		}

		return creds;
	}

}
