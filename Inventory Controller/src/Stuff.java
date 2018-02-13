
public class Stuff
	{
	private int SKU;
	private String name;
	private int amount;
	private int cost;
	private int sold;
	private int storeCost;
public Stuff (int s, String n, int a, int c, int so, int sc)
	{
	SKU = s;
	name = n;
	amount = a;
	cost = c;
	sold = so;
	storeCost = sc;
	}
public int getSKU()
	{
	return SKU;
	}
public void setSKU(int sKU)
	{
	SKU = sKU;
	}
public String getName()
	{
	return name;
	}
public void setName(String name)
	{
	this.name = name;
	}
public int getAmount()
	{
	return amount;
	}
public void setAmount(int amount)
	{
	this.amount = amount;
	}
public int getCost()
	{
	return cost;
	}
public void setCost(int cost)
	{
	this.cost = cost;
	}
public int getSold()
	{
	return sold;
	}
public void setSold(int sold)
	{
	this.sold = sold;
	}
public int getStoreCost()
	{
	return storeCost;
	}
public void setStoreCost(int storeCost)
	{
	this.storeCost = storeCost;
	}
}
