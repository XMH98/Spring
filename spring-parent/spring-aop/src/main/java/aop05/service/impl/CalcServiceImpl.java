package aop05.service.impl;

import aop05.service.CalcService;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 18:09
 * Description: <描述>
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        System.out.println("CalcServiceImpl.add");
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        System.out.println("CalcServiceImpl.minus");
        return a-b;
    }
}
