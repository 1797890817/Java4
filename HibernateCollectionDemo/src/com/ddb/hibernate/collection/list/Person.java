package com.ddb.hibernate.collection.list;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="person_inf")
@Getter@Setter
public class Person
{
	@Id @Column(name="perosn_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	// 标识属性
	private Integer id;
	private String name;
	private int age;
	// 集合属性，保留该对象关联的学校
	@ElementCollection(targetClass=String.class)
	// 映射保存集合属性的表
	@CollectionTable(name="school_inf", // 指定表名为school_inf
		joinColumns=@JoinColumn(name="person_id" , nullable=false))
	// 指定保存集合元素的列为 school_name
	@Column(name="school_name")
	// 映射集合元素索引的列
	@OrderColumn(name="list_order")
	private List<String> schools
		= new ArrayList<>();
	
}