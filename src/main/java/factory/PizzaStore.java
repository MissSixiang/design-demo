package factory;

import factory.store.v1.PizzaStoreV1;

/**
 * @description
 * @author: yianmou
 */
public class PizzaStore {
    public static void main(String[] args) {
        pizzaStoreV1Test();
    }

    /**
     * 简单工厂
     */
    private static void pizzaStoreV1Test() {
        PizzaStoreV1 pizzaStore = new PizzaStoreV1(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
    }




}
