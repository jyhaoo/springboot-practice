package org.jason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private DishService dishService;

    @RequestMapping("/dishes")
    public List<Dish> getAllDishes() {
        return dishService.getDishes();
    }

    @RequestMapping("/dishes/{id}")
    public Dish getDish(@PathVariable String id) {
        return dishService.getDish(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/dishes")
    public void addDish(@RequestBody Dish dish) {
        dishService.addDish(dish);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/dishes/{id}")
    public void updateDish(@RequestBody Dish dish, @PathVariable String id) {
        dishService.updateDish(dish, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/dishes/{id}")
    public void deleteDish(@PathVariable String id) {
        dishService.deleteDish(id);
    }
}
