package com.Exchange.Models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="AuditInformation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class currencyExchangeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long request_id;
	@Column(name = "STATUS")
	String status;

	@Column(name = "REQUEST")
	String request;

	@Column(name = "RESPONSE")
	String response;

	@Column(name = "CREATE_TS")
	Timestamp create_ts;

	@Column(name = "UPDATE_TS")
	Timestamp update_ts;
}

