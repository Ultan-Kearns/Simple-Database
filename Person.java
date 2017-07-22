//Ultan Kearns 22/07/17
public class Person
{
	int age;
	int id;
	String name;

	public Person()	//default constructor
	{
		age = 0;
		id = 0;
		name = "NONE";
	}
	public Person(int a,int id,String n)
	{
		setName(n);
		setAge(a);
		setId(id);
	}
	public String getName()	//getters and setters below
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getId()
	{
	 	return id;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setId(int idNum)
	{
		id = idNum;
	}
	public String toString()	//toString method
	{
		return String.format("Name:%-10s ID:%4d Age:%2d ",name,id,age);
	}
}