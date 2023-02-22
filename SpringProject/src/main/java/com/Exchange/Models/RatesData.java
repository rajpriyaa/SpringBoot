package com.Exchange.Models;

import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;
@Data
public class RatesData {
	String success;
	Timestamp timestamp;
	Boolean historical;
	String base;
	Date date;
	Rates rates;

	
}
