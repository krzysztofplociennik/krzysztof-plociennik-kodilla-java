package com.kodilla.hibernate.manytomany.dao;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith" );
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson" );
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky" );

        Company softwareMachine = new Company("Software Machine" );
        Company dataMaesters = new Company("Data Maesters" );
        Company greyMatter = new Company("Grey Matter" );

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        List<Employee> employeesWithCertainSurname = employeeDao.retrieveEmployeesWithCertainSurname("Smith");
        List<Company> companiesWithFirstThreeLetters = companyDao.retrieveCompaniesWithFirstThreeLetters();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
        Assert.assertEquals(1, employeesWithCertainSurname.size());
        Assert.assertEquals(1, companiesWithFirstThreeLetters.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueriesWithCompaniesAndEmployees() {
        //Given
        Employee johnSmith = new Employee("John", "Smith" );
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson" );
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky" );

        Company softwareMachine = new Company("Software Machine" );
        Company dataMaesters = new Company("Data Maesters" );
        Company greyMatter = new Company("Grey Matter" );

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        List<Employee> employeesWithCertainSurname = employeeDao.retrieveEmployeesWithCertainSurname("Smith" );
        List<Company> companiesWithFirstThreeLetters = companyDao.retrieveCompaniesWithFirstThreeLetters();

        //Then
        Assert.assertEquals(1, employeesWithCertainSurname.size());
        Assert.assertEquals(1, companiesWithFirstThreeLetters.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
