package com.kodilla.hibernate.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyRetriever;
import com.kodilla.hibernate.manytomany.facade.EmployeeRetriever;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyRetriever companyRetriever;

    @Autowired
    private EmployeeRetriever employeeRetriever;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private SearchFacade searchFacade;

    @Test
    void testShouldRetrieveCompanyWithArg() {
        //Given
        List<Company> companies = companyRetriever.retrieve();

        companyDao.saveAll(companies);

        //When
        List<Company> companiesWithArg = searchFacade.searchCompanyWithArg("%ata%");

        //Then
        assertEquals(companiesWithArg.size(), 2);
        System.out.println(companiesWithArg);

        //CleanUp
        try{
        companyDao.deleteById(companies.get(0).getId());
        companyDao.deleteById(companies.get(1).getId());
        companyDao.deleteById(companies.get(2).getId());

        } catch(Exception e){
            //do nothing
        }
    }

    @Test
    void testShouldRetrieveEmployeeWithArg() {
        //Given
        List<Employee> employees = employeeRetriever.retrieve();

        employeeDao.saveAll(employees);

        //When
        List<Employee> employeesWithArg = searchFacade.searchEmployeeWithArg("%son%");

        //Then
        assertEquals(employeesWithArg.size(), 1);
        System.out.println(employeesWithArg);

        //CleanUp
        try{
            employeeDao.deleteById(employees.get(0).getId());
            employeeDao.deleteById(employees.get(1).getId());
            employeeDao.deleteById(employees.get(2).getId());

        } catch(Exception e){
            //do nothing
        }

    }
}
