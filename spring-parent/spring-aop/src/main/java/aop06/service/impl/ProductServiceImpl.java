package aop06.service.impl;

import aop06.service.ProductService;

/**
 * Author: 徐明皓
 * Date: 2021-05-11 22:04
 * Description: <描述>
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public void add() {
        System.out.println("ProductServiceImpl.add");
    }

    @Override
    public void deleteById(int id) {
        System.out.println("ProductServiceImpl.deleteById(id)");
    }


    public void deleteByName(String name) {
        System.out.println("ProductServiceImpl.deleteByName(name)");
    }
}
