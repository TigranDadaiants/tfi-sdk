package ru.sstu.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ru.sstu.dao.AbstractDao;
import ru.sstu.dao.domain.Person;

/**
 * <code>PersonDaoImpl</code> class.
 *
 * @author Denis_Murashev
 * @since DAO 1.0
 */
@Repository("personDao")
class PersonDaoImpl extends AbstractDao<Person> {

	@Resource
	private HibernateTemplate testTemplate;

	@Override
	protected HibernateTemplate getTemplate() {
		return testTemplate;
	}
}
