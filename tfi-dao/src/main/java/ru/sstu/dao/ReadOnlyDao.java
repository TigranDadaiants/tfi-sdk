package ru.sstu.dao;

import java.io.Serializable;
import java.util.List;

/**
 * <code>ReadOnlyDao</code> interface is most common read only DAO interface.
 *
 * @author Denis_Murashev
 * @param <T> concrete entity class
 * @since DAO 1.0
 */
public interface ReadOnlyDao<T extends Serializable> {

	/**
	 * Provides all entities in the system.
	 *
	 * @return list of entities
	 */
	List<T> find();

	/**
	 * Provides entity with given id.
	 *
	 * @param id entity id
	 * @return entity
	 */
	T findById(Serializable id);
}
