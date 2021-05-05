package com.zekeriyafince.javamernisdemo.abstracts;

import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.CustomerService;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:11
 */
public abstract class CustomerManager implements CustomerService {

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + " başarılı bir şekilde kaydedildi.");
    }

}
