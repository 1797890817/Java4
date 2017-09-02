package com.ddb.javacore.ood4;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class LombokDemo {
	@Getter@Setter
	private String name;
	@Getter@Setter
	private Integer age;
	@Getter@Setter
	private Character sex;
	private Boolean good;	//好人

}
