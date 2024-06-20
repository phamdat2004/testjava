package dao;

import java.util.List;

public interface daoInterface<T> {
	public List<T> getAll();
	
	public T selectById(T t);
	
	public boolean insert(T t);
	
	public boolean update(T t);
	public boolean delete(T t);
}
