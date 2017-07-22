//Ultan Kearns	22/07/17
import java.util.Scanner;
import java.util.InputMismatchException;	//import for error handling
public class Database
{
	static final int MAX = 100;
	static Person[]  pArray = new Person[MAX];	//declare object array for person
    static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		menu();
	}
	public static void menu()
	{
		int choice;
		try
		{
			do
			{
				System.out.println("\n\n1:See List\n2:Add new person\n3:Remove person");
				System.out.print("\n\n\n\nPlease enter choice: ");
				choice = console.nextInt();
				switch(choice)
				{
					case 1:
					System.out.println("\n\n");
					for(int i = 0; i < pArray.length; i++)
					{
						if(pArray[i] != null)
						{
							System.out.println(pArray[i]);
						}
					}
					break;
					case 2:
					addPerson();
					break;
					case 3:
					removePerson();
					break;
					default:
					System.out.println("ERROR");
				}
			}while (choice != 4);
		}
		catch(InputMismatchException invalidInput)
		{
			System.out.println("ERROR INVALID INPUT\n\n" + invalidInput.toString());
			console.next();
			menu();
		}
	}
	public static void addPerson() throws InputMismatchException	//throw InputMismatchException which is declared in menu
	{
		Person p = new Person();
		console.nextLine();
		System.out.println("\n\n");
		System.out.print("Please enter name: ");
		p.name = console.nextLine();
		System.out.print("Please enter ID: ");
		p.id = console.nextInt();
		System.out.print("Please enter age: ");
		p.age = console.nextInt();
		for(int i = 0; i < pArray.length; i++)
		{
			if(pArray[i] == null)
			{
				pArray[i] = p;
				System.out.println("Added Person at array index: " + (i + 1));
				break;
			}
			else if(pArray[i] != null && i == pArray.length - 1)
			{
				System.out.println("The array size is full");
			}
		}
	}
	public static void removePerson()
	{
		console.next();
		String removePerson;
		System.out.println("Please enter the name of the person you wish to remove: ");
		removePerson = console.nextLine();
		try
		{
			for(int i = 0; i < pArray.length - 1; i++)
			{
				if(removePerson.equalsIgnoreCase(pArray[i].name))
				{
					pArray[i] = null;
					break;
				}
				else if(i == pArray.length && removePerson.equalsIgnoreCase(pArray[i].name) == false)
				{
					System.out.println("NAME NOT FOUND!!\n\n");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Could not remove person\nError: " + e.toString() + "\n\n");	//left this in as it is not an error of invalid type
		}

	}
}