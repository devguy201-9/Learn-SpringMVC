package com.projectspringMVC.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.projectspringMVC.dao.INewDAO;
import com.projectspringMVC.mapper.NewMapper;
import com.projectspringMVC.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}
}
