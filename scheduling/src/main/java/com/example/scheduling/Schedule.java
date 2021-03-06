package com.example.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class Schedule {

	//dsadasdasdadas

	private static final Logger log = LoggerFactory.getLogger(Schedule.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
	}

	@Scheduled(fixedRate = 15000)
	public void reportCurrentTimes() {
		log.info("The time is now {}", dateFormat.format(new Date()));
	}
}
