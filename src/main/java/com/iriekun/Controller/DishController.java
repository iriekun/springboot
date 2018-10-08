package com.iriekun.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iriekun.Entity.Dish;
import com.iriekun.Service.DishService;


@RestController
@RequestMapping(value = "/dishes")
public class DishController
{
	@Autowired private DishService dishService;

	@RequestMapping(method = RequestMethod.GET) public Collection<Dish> getAllDishes()
	{
		return dishService.getAllDishes();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Dish getDishById(@PathVariable("id") int id)
	{
		return dishService.getDishById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Collection<Dish> removeDishById(@PathVariable("id") int id)
	{
		return dishService.removeDishById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Dish> updateDish(@RequestBody Dish dish)
	{
		return dishService.updateDish(dish);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Dish> insertDish(@RequestBody Dish dish)
	{
		return dishService.insertDish(dish);
	}
}
