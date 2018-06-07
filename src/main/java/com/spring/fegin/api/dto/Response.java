package com.spring.fegin.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	private int userId;
	private int id;
	private String title;
	private String body;
	

}
