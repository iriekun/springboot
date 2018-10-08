package com.iriekun.Entity;

public class Dish
{
	private int id;
	private String name;

	public Dish(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public Dish(){}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
