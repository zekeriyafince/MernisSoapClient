/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.interfaces;

import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.models.Result;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:16
 */
public interface CustomerCheckService {

    Result CheckIfRealPerson(Customer customer);

    Result CheckIfYoungerAgeThan(Customer customer, int age);
}
