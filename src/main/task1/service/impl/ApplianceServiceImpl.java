package task1.service.impl;

import java.util.List;

import task1.dao.ApplianceDAO;
import task1.dao.DAOException;
import task1.dao.DAOFactory;
import task1.dao.impl.FileApplianceDAOImpl;
import task1.entity.Appliance;
import task1.entity.criteria.Criteria;
import task1.service.ApplianceService;
import task1.service.ServiceException;
import task1.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    /**
     * @param criteria
     * @return list of found appliances by given criteria
     * @throws ServiceException
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliances;

        try {
            appliances = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return appliances;
    }

}
