package com.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ssh.dao.impl.UserBaseInfoDaoImpl;
import com.ssh.entity.UserBaseInfo;

@Repository("UserBaseInfoDao")
public class UserBaseInfoDao implements UserBaseInfoDaoImpl {

	@Autowired
	protected SessionFactory sessionFactory;

	protected JdbcTemplate jdbcTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<UserBaseInfo> findUserBaseInfo() {
		String hql = "from UserBaseInfo ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<UserBaseInfo> a = query.list();
		return a;
		// RowMapper<UserBaseInfo> rowMapper = new
		// BeanPropertyRowMapper<UserBaseInfo>(UserBaseInfo.class);
		// String hql = "select id,name from user_base_info ";
		// return (List<UserBaseInfo>) this.jdbcTemplate.queryForObject(hql,
		// rowMapper);
	}

}