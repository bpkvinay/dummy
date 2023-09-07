package fgjika;

import java.io.File;


import java.io.File;
import java.io.IOException;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class naj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Object Service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vinay.gaonkar\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1")
			.usingPort(4723).build();
			((Object) Service).start();
	}
	}

}
