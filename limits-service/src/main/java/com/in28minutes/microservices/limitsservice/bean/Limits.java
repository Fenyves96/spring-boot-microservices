package com.in28minutes.microservices.limitsservice.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Limits {

	private int minimum;
	private int maximum;
}
