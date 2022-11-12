package task1.service;

import java.util.List;

import task1.entity.Appliance;
import task1.entity.criteria.Criteria;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws ServiceException;
	
}
