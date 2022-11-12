package task1.dao;

import java.util.List;

import task1.entity.Appliance;
import task1.entity.criteria.Criteria;

public interface ApplianceDAO {

	/**
	 * @param criteria
	 * @return
	 * @throws DAOException
	 */
	List<Appliance> find(Criteria criteria) throws DAOException;
	
}
