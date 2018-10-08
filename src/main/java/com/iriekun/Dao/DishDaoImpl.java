package com.iriekun.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.iriekun.Entity.Dish;

@Repository
@Qualifier ("hashMap")
public class DishDaoImpl implements DishDao
{
	private static Map<Integer, Dish> dishes;

	static
	{
		dishes = new HashMap<Integer, Dish>()
		{
			{
				put(1, new Dish(1, "Fried chicken"));
				put(2, new Dish(2, "Chicken curry"));
				put(3, new Dish(3, "Beef loklak"));
			}
		};
	}

	@Override public Collection<Dish> getAllDishes()
	{
		return this.dishes.values();
	}

	@Override public Dish getDishById(int id)
	{
		return this.dishes.get(id);
	}

	@Override public Collection<Dish> removeDishById(int id)
	{
		this.dishes.remove(id);
		return getAllDishes();
	}

	@Override public Collection<Dish> updateDish(Dish dish)
	{
		Dish d = dishes.get(dish.getId());
		d.setName(dish.getName());
		this.dishes.put(dish.getId(), d);
		return getAllDishes();
	}

	@Override public Collection<Dish> insertDish(Dish dish)
	{
		this.dishes.put(dish.getId(), dish);
		return getAllDishes();
	}

}
