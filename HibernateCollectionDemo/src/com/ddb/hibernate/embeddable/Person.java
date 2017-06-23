package com.ddb.hibernate.embeddable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="person_inf")
@Getter@Setter
public class Person
{
	@Id @Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private int age;
	// 组件属性name
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="first", column = @Column(name="person_firstname")),
		@AttributeOverride(name="last", column = @Column(name="person_lastname"))
	})
	private Name name;

}