/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.utils;

import com.zekeriyafince.javamernisdemo.models.Result;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:47
 */
public class CheckServiceUtils {

    public static Result runCheckServices(Result[] customerCheckServices) {
        for (Result customerCheckService : customerCheckServices) {
            if (!customerCheckService.isSuccess()) {
                return customerCheckService;
            }
        }
        return new Result(true);
    }
}
