package com.ht.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDAO<PK, T> {
	
	public T queryById(PK id);
	
	public void update(T t);
	
	public void add(T t);
	
	public int count(String column, String ifvalue);
	
	public void delete(T t);
	
	public List<T> pagelist(DetachedCriteria dc, int startpage, int pagesize);

}
