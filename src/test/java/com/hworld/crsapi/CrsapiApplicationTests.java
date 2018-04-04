package com.hworld.crsapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrsapiApplicationTests {

	@Test
	public void contextLoads() throws ParseException {
		String ddtt = "2018-04-03 20:42:00";
		Date dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ddtt);
		Date dt2 = new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000);
		Date dt1 = new Date();
		if (dt.getTime() > dt2.getTime() || dt.getTime() <dt1.getTime()) {
			System.err.println("过期了");
		}else {
			System.err.println("正常");
		}
	}

}
