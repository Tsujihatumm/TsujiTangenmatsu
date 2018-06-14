package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.Admin;


public interface AdminDao {

	public List<Admin> findByIdAndPassword(String id, String password);;

}
