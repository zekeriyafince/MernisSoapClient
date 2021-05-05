/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.services;

import com.zekeriyafince.javamernisdemo.abstracts.CustomerCheckManager;
import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.RealPersonService;
import com.zekeriyafince.javamernisdemo.models.Result;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:44
 */
public class StarbucksCustomerCheckManager extends CustomerCheckManager {

    private RealPersonService realPersonService;

    public StarbucksCustomerCheckManager(RealPersonService realPersonService) {
        this.realPersonService = realPersonService;
    }

    @Override
    public Result CheckIfRealPerson(Customer customer) {

        return realPersonService.CheckIfRealPerson(customer);
    }
}
