package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.Admin;

public interface LoginService {

	public List<Admin>  findByIdAndPassword(String id, String password);

}
