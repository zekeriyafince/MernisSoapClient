/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.services;

import com.zekeriyafince.javamernisdemo.abstracts.CustomerManager;
import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.CustomerCheckService;
import com.zekeriyafince.javamernisdemo.models.Result;
import com.zekeriyafince.javamernisdemo.utils.CheckServiceUtils;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:45
 */
public class StarbucksCustomerManager extends CustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {

        Result result = CheckServiceUtils.runCheckServices(new Result[]{
            customerCheckService.CheckIfRealPerson(customer),
            customerCheckService.CheckIfYoungerAgeThan(customer, 15)
        });

        if (!result.isSuccess()) {
            System.out.println(result.getMessage());
            return;
        }

        super.add(customer);
    }
}
