/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.salaries;

import com.udea.entities.Employee;
import com.udea.qualifiers.ExtraHours;

/**
 *
 * @author toughbook
 */
@ExtraHours
public class ExtraHoursSalary implements SalaryCalculator {

    @Override
    public Double calculateSalary(Employee employee) {
        if (employee.getExtraHours() == null || employee.getExtraHours() == 0) {
            return employee.getSalary();
        } else {
            Double valorHora = employee.getSalary() / 8;
            Double valorHoraExtra = valorHora * 0.25;
            return employee.getSalary() + valorHoraExtra;
        }
    }

}
