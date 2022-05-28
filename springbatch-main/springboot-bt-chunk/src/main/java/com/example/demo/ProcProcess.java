package com.example.demo;

import org.springframework.batch.item.ItemProcessor;

public class ProcProcess implements ItemProcessor<Students, Students> {

	@Override
	public Students process(Students syain) throws Exception {
	    final String id = syain.getId();
	    final String romaji = syain.getRomaji().toUpperCase();
	    final Students s1 = new Students(id,romaji);
		return s1;
	}
}
