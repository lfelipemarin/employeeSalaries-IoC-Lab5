/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.salaries;

import com.udea.entities.Employee;
import com.udea.qualifiers.Normal;

/**
 *
 * @author toughbook
 */
@Normal
public class NormalSalary implements SalaryCalculator {

    @Override
    public Double calculateSalary(Employee employee) {
        return employee.getSalary();
    }

}
