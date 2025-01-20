package com.in28minutes.microservices.currency_conversion_service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CurrencyConversion {
	Long id;
	String from;
	String to;
	BigDecimal conversionMultiple;
	BigDecimal quantity;
	BigDecimal totalCalculatedAmount;
	String environment;
}
