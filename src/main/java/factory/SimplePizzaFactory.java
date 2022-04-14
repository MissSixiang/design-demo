package factory;

import factory.pizza.Pizza;
import factory.pizza.v1.CheesePizza;
import factory.pizza.v1.ClamPizza;
import factory.pizza.v1.PepperoniPizza;
import factory.pizza.v1.VeggiePizza;

/**
 * @description
 * @author: yianmou
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
