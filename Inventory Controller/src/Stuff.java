
public class Stuff
	{
	private int SKU;
	private String name;
	private int amount;
	private int cost;
public Stuff (int s, String n, int a, int c)
	{
	SKU = s;
	name = n;
	amount = a;
	cost = c;
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
}
