package jp.co.axiz.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.entity.Admin;

@Repository
public class PgAdminDao implements AdminDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Admin> findByIdAndPassword(String id, String password) {

		return jdbcTemplate.query("SELECT admin_id, admin_name, password FROM admin WHERE admin_id = ? AND password = ?",new BeanPropertyRowMapper(Admin.class ));

	}

}
