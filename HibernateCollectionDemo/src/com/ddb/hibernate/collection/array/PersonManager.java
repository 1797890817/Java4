package com.ddb.hibernate.collection.array;

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
	// 创建并保存Person对象
	private void createAndStorePerson()
	{
		// 打开线程安全的session对象
		Session session = HibernateUtil.currentSession();
		// 打开事务
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		//为Person对象设置属性
		person.setAge(20);
		person.setName("crazyit.org");
		// 创建String[]数组
		String[] schools = new String[]{"小学", "中学"};
		person.setSchools(schools);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}