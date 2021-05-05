/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.abstracts;

import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.CustomerCheckService;
import com.zekeriyafince.javamernisdemo.models.Result;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:11
 */
public abstract class CustomerCheckManager implements CustomerCheckService {

    @Override
    public Result CheckIfRealPerson(Customer customer) {

        return new Result(true);
    }

    @Override
    public final Result CheckIfYoungerAgeThan(Customer customer, int age) {
        LocalDate todayDateTime = LocalDate.now();
        LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearDifference = Period.between(birthDate, todayDateTime).getYears();
        if (yearDifference < age) {
            return new Result(false, age + " yaşından küçük olamaz.");
        }
        return new Result(true);
    }

}
