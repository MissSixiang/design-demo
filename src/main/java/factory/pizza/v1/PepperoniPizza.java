package factory.pizza.v1;

import factory.pizza.Pizza;

/**
 * @description
 * @author: yianmou
 */
public class PepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("PepperoniPizza prepare()");
    }

    public void bake() {
        System.out.println("PepperoniPizza bake()");
    }

    public void cut() {
        System.out.println("PepperoniPizza cut()");
    }

    public void box() {
        System.out.println("PepperoniPizza box()");
    }
}
