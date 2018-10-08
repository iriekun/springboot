package com.iriekun.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iriekun.Entity.Dish;


@Repository("mysql")
public class MySqlDishDaoImpl implements DishDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate; //inject jdbcTemplate and add datasource configured in project.properties

	private static class DishRowMapper implements RowMapper<Dish>
	{

		@Override public Dish mapRow(ResultSet resultSet, int i) throws SQLException
		{
			Dish dish = new Dish();
			dish.setId(resultSet.getInt("id"));
			dish.setName(resultSet.getString("name"));
			return dish;
		}
	}

	@Override
	public Collection<Dish> getAllDishes()
	{
		final String query = "SELECT id, name FROM dish";
		List<Dish> dishes = jdbcTemplate.query(query, new DishRowMapper());
		return dishes;
	}

	@Override
	public Dish getDishById(int id)
	{
		final String query = "SELECT id, name FROM dish WHERE id = ?";
		Dish dish = jdbcTemplate.queryForObject(query, new DishRowMapper(), id);
		return dish;
	}

	@Override
	public Collection<Dish> removeDishById(int id)
	{
		final String sql = "DELETE FROM dish WHERE id = ?";
		jdbcTemplate.update(sql, id);
		return getAllDishes();
	}

	@Override
	public Collection<Dish> updateDish(Dish dish)
	{
		final String sql = "UPDATE dish SET name = ? WHERE id = ?";
		final int id = dish.getId();
		final String name = dish.getName();
		jdbcTemplate.update(sql, new Object[] {name, id});
		return getAllDishes();
	}

	@Override
	public Collection<Dish> insertDish(Dish dish)
	{
		final String sql = "INSERT INTO dish (id, name) VALUES (?, ?)";
		final int id = dish.getId();
		final String name = dish.getName();
		jdbcTemplate.update(sql, new Object[] {id, name});
		return getAllDishes();
	}
}
