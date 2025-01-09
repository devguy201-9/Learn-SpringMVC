package com.projectspringMVC.dao;

import java.util.List;

import com.projectspringMVC.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}
