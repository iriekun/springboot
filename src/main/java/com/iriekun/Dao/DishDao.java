package com.iriekun.Dao;

import java.util.Collection;

import com.iriekun.Entity.Dish;


public interface DishDao
{
	Collection<Dish> getAllDishes();

	Dish getDishById(int id);

	Collection<Dish> removeDishById(int id);

	Collection<Dish> updateDish(Dish dish);

	Collection<Dish> insertDish(Dish dish);
}
