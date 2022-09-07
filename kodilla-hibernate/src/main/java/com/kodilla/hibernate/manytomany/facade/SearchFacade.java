package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanyWithArg(String arg) {
        LOGGER.info("Searching for companies...");
        List<Company> companies = companyDao.retrieveCompanyWithArg(arg);

        if (companies.size()==0) {
            LOGGER.info("There are no companies found.");
        }
        return companies;
    }

    public List<Employee> searchEmployeeWithArg(String arg) {
        LOGGER.info("Searching for employees...");
        List<Employee> employees = employeeDao.retrieveEmployeeWithArg(arg);

        if (employees.size() == 0) {
            LOGGER.info("There are no employees found");
        }
        return employees;
    }

}
