/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entities.Employee;
import com.udea.qualifiers.Comission;
import com.udea.qualifiers.ExtraHours;
import com.udea.qualifiers.Normal;
import com.udea.salaries.SalaryCalculator;
import com.udea.session.EmployeeFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author toughbook
 */
@ManagedBean(name = "employeeController")
@SessionScoped
public class EmployeeController {

    @EJB
    private EmployeeFacadeLocal employeeFacade;

    @Inject
    @Normal
    private SalaryCalculator salario;

    private List<Double> salaries;
    private List<Employee> employees;

    public List<Double> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Double> salaries) {
        this.salaries = salaries;
    }

    public List<Employee> getEmployees() {
        return employeeFacade.findAll();
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Double> processAllSalaries() {

        for (Employee employee : getEmployees()) {
            salaries.add(salario.calculateSalary(employee));
        }
        for (Double salary : salaries) {
            System.out.println("Salario: " + salary.toString());
        }
        return salaries;
    }

    public Double processSalaryById(String id) {
        Employee employee = employeeFacade.find(id);
        return salario.calculateSalary(employee);
    }

}
