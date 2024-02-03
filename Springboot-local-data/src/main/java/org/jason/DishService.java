package org.jason;

import org.jason.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DishService {

    private List<Dish> dishes = new ArrayList<>(Arrays.asList(
            new Dish(1, "Beef Chow Fun", 15.99),
            new Dish(2, "Beef Chow Mein", 15.99),
            new Dish(3, "Pork Dumplings", 8.99)
    ));

    public List<Dish> getDishes() {
        return dishes;
    }

    public Dish getDish(String id) {
        return dishes.stream().filter(t -> t.getId() == Integer.parseInt(id)).findFirst().get();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void updateDish(Dish dish, String id) {
        for (int i = 0; i < dishes.size(); i++) {
            Dish d = dishes.get(i);
            if (d.getId() == Integer.parseInt(id)) {
                dishes.set(i, dish);
                return;
            }
        }
    }

    public void deleteDish(String id) {
        dishes.removeIf(d -> d.getId() == Integer.parseInt(id));
    }
}
