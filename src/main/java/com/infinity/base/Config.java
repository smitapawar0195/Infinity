package com.infinity.base;

import com.infinity.utility.PropUtil;

public class Config {
	public String readProperty(String Key) {
		String baseDir = System.getProperty("user.dir");
		String filePath = baseDir + "/src/main/resources/config.properties";

		PropUtil pUtil = new PropUtil(filePath);
		return pUtil.readPropertyFile(filePath, Key);

	}

	public String openBrowser() {
		return readProperty("browserName");

	}

	public String launchUrl() {
		return readProperty("url");

	}

	public String enterUserName() {
		return readProperty("userName");

	}

	public String enterPass() {
		return readProperty("password");

	}
}
