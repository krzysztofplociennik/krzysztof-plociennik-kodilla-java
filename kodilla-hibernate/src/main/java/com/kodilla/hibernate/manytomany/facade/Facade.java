package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public final class Facade {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Employee> searchEmployees(final String keyword) throws SearchProcessingException {
        String sqlString = "FROM Employee WHERE FIRSTNAME LIKE '%" + keyword + "%' OR LASTNAME LIKE '%" + keyword + "%'";
        Query query = entityManager.createQuery(sqlString, Employee.class);
        List<Employee> employeeResultList = query.getResultList();

        if(keyword.equals("")) {
            LOGGER.error(SearchProcessingException.ERR_NO_PHRASE_GIVEN);
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_PHRASE_GIVEN);
        }

        if(employeeDao.findAll().size() == 0) {
            LOGGER.error(SearchProcessingException.ERR_NO_RECORDS);
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_RECORDS);
        }

        LOGGER.info("Searching for employees with a keyword: '" + keyword + "' in their name...");

        if(employeeResultList.size() == 0) {
            LOGGER.info(SearchProcessingException.INFO_NO_EMPLOYEE_FOUND);
        } else {
            LOGGER.info("Here are the employees whose names contain your keyword: ");
            for (Employee instance : employeeResultList) {
                System.out.println(instance.getFirstname() + " " + instance.getLastname());
            }
        }
        return employeeResultList;
    }

    public List<Company> searchCompanies(final String keyword) throws SearchProcessingException {
        String sqlString = "FROM Company WHERE COMPANY_NAME LIKE '%" + keyword + "%'";
        Query query = entityManager.createQuery(sqlString, Company.class);
        List<Company> companyResultList = query.getResultList();

        if(keyword.equals("")) {
            LOGGER.error(SearchProcessingException.ERR_NO_PHRASE_GIVEN);
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_PHRASE_GIVEN);
        }

        if(companyDao.findAll().size() == 0) {
            LOGGER.error(SearchProcessingException.ERR_NO_RECORDS);
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_RECORDS);
        }

        LOGGER.info("Searching for companies with a keyword: '" + keyword + "' in their name...");

        if(companyResultList.size() == 0) {
            LOGGER.info(SearchProcessingException.INFO_NO_COMPANY_FOUND);
        } else {
            LOGGER.info("Here are the companies which names contain your keyword: ");
            for (Company instance : companyResultList) {
                System.out.println(instance.getName());
            }
        }
        return companyResultList;
    }
}
