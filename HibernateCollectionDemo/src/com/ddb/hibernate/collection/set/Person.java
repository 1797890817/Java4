package com.ddb.hibernate.collection.set;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_inf")
public class Person {
	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 标识属性
	private Integer id;
	private String name;
	private int age;
	// 集合属性，保留该对象关联的学校
	@ElementCollection(targetClass = String.class)
	// 映射保存集合属性的表
	@CollectionTable(name = "school_inf", // 指定表名为school_inf
			joinColumns = @JoinColumn(name = "person_id", nullable = false))
	// 指定保存集合元素的列为 school_name，nullable=false增加非空约束
	@Column(name = "school_name", nullable = false)
	private Set<String> schools = new HashSet<>();
}