package com.iriekun.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iriekun.Dao.DishDao;
import com.iriekun.Entity.Dish;

@Service
public class DishServiceImpl implements DishService
{
	@Autowired
	@Qualifier ("mysql")
	private DishDao dishDao;

	@Override
	public Collection<Dish> getAllDishes()
	{
		return dishDao.getAllDishes();
	}

	@Override
	public Dish getDishById(int id)
	{
		return dishDao.getDishById(id);
	}

	@Override
	public Collection<Dish> removeDishById(int id)
	{
		return dishDao.removeDishById(id);
	}

	@Override
	public Collection<Dish> updateDish(Dish dish)
	{
		return dishDao.updateDish(dish);
	}

	@Override
	public Collection<Dish> insertDish(Dish dish)
	{
		return dishDao.insertDish(dish);
	}
}
