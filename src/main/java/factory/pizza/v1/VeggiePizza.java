package factory.pizza.v1;

import factory.pizza.Pizza;

/**
 * @description
 * @author: yianmou
 */
public class VeggiePizza implements Pizza {
    public void prepare() {
        System.out.println("VeggiePizza prepare()");
    }

    public void bake() {
        System.out.println("VeggiePizza bake()");
    }

    public void cut() {
        System.out.println("VeggiePizza cut()");
    }

    public void box() {
        System.out.println("VeggiePizza box()");
    }
}
