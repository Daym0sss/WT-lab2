package task1.main;

import static task1.entity.criteria.SearchCriteria.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import task1.entity.Appliance;
import task1.entity.Laptop;
import task1.entity.criteria.Criteria;
import task1.entity.criteria.SearchCriteria;
import task1.service.ApplianceService;
import task1.service.ServiceException;
import task1.service.ServiceFactory;

/**
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws ServiceException
	 */
	public static void main(String[] args) throws ServiceException {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Refrigerator.class.getSimpleName());
		criteriaOven.add(Refrigerator.WEIGHT.toString(), 3);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		Criteria kettleCriteria = new Criteria(Kettle.class.getSimpleName());

		appliances = service.find(kettleCriteria);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		
		appliances = service.find(criteriaTabletPC);

		
		PrintApplianceInfo.print(appliances);

	}

}