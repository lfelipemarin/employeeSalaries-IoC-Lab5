/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.salaries;

import com.udea.entities.Employee;

/**
 *
 * @author toughbook
 */
public interface SalaryCalculator {

    public Double calculateSalary(Employee employee);
}
