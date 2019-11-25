package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void testFacade() throws SearchProcessingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith" );
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson" );
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky" );

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        Company softwareMachine = new Company("Software Machine" );
        Company dataMaesters = new Company("Data Maesters" );
        Company greyMatter = new Company("Grey Matter" );

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        int softwareMachineId = softwareMachine.getId();
        int dataMaestersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();
        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaKovalskyId = lindaKovalsky.getId();

        List<Company> companyResultList = facade.searchCompanies("re");
        List<Employee> employeeResultList = facade.searchEmployees("kov");

        //Then
        Assert.assertEquals(2, companyResultList.size());
        Assert.assertEquals(1, employeeResultList.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(stephanieClarcksonId);
            employeeDao.deleteById(lindaKovalskyId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
