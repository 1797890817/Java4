package com.ddb.hibernate.embeddable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.collection.common.HibernateUtil;

public class PersonManager {
	public static void main(String[] args) {
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}

	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		// 为Person对象设置属性
		person.setAge(29);
		person.setName(new Name("crazyit.org", "疯狂Java联盟"));
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}