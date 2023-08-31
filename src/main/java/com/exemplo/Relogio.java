package main.java.com.exemplo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(dateFormat.format(date));

	}

}
