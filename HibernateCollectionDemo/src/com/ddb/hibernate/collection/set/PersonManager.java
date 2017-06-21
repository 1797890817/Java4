package com.ddb.hibernate.collection.set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.collection.common.HibernateUtil;


public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}

	private void createAndStorePerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		person.setAge(20);
		person.setName("crazyit.org");
		// 向person的schools集合属性中添加两个字符串元素
		person.getSchools().add("小学");
		person.getSchools().add("中学");
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}