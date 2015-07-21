/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.salaries;

import com.udea.entities.Employee;
import com.udea.qualifiers.Comission;

/**
 *
 * @author toughbook
 */
@Comission
public class ComissionSalary implements SalaryCalculator {

    @Override
    public Double calculateSalary(Employee employee) {
        if (employee.getComision() == null || employee.getComision() == 0) {
            return employee.getSalary();
        } else {
            return employee.getSalary() + employee.getComision();
        }
    }

}
