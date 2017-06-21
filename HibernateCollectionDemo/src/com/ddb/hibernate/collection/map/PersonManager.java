package com.ddb.hibernate.collection.map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ddb.hibernate.collection.common.HibernateUtil;

public class PersonManager {
	private void createAndStorePerson() {
		// 打开线程安全的Session对象
		Session session = HibernateUtil.currentSession();
		// 打开事务
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		person.setAge(20);
		person.setName("crazyit.org");
		// 向person的Map集合属性中添加key-value对
		person.getScores().put("语文", 67f);
		person.getScores().put("英文", 45f);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}

	public static void main(String[] args) {
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}

}