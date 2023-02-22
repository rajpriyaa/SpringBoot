package com.Exchange.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Exchange.Service.DataFetchService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
public class CurrencyExchange {
	@Autowired
	private DataFetchService fetchService;
	
	@GetMapping("/rates")
	public void FetchApiData(@RequestParam Optional<String> date) {
		if(date.isPresent()){
			fetchService.getApiData(date.get());
		}else{
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			fetchService.getApiData(simpleDateFormat.format(new Date()));
		}

	}
}