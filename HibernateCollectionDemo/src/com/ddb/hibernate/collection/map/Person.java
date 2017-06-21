package com.ddb.hibernate.collection.map;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

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
	// 集合属性，保留该对象关联的考试成绩
	@ElementCollection(targetClass = Float.class)
	// 映射保存集合属性的表
	@CollectionTable(name = "score_inf", // 指定表名为score_inf
			joinColumns = @JoinColumn(name = "person_id", nullable = false))
	@MapKeyColumn(name = "subject_name")
	// 指定Map key的类型为String类型
	@MapKeyClass(String.class)
	// 映射保存Map value的数据列
	@Column(name = "mark")
	private Map<String, Float> scores = new HashMap<>();

}