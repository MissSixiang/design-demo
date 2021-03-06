package factory.pizza.v1;

import factory.pizza.Pizza;

/**
 * @description
 * @author: yianmou
 */
public class ClamPizza implements Pizza {
    public void prepare() {
        System.out.println("ClamPizza prepare()");
    }

    public void bake() {
        System.out.println("ClamPizza bake()");
    }

    public void cut() {
        System.out.println("ClamPizza cut()");
    }

    public void box() {
        System.out.println("ClamPizza box()");
    }
}
