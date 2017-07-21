import java.util.Scanner;
import java.util.Stack;

public class Database
{
	static final int MAX = 100;
	static Person[]  pArray = new Person[MAX];
    static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		menu();
	}
	public static void menu()
	{
		int choice;
		do
		{
			System.out.println("\n\n1: See List\n2:Add new person\n3:quit");
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
				default:
				System.out.println("ERROR");
			}
		}while (choice != 3);
	}
	public static void addPerson()
	{
			console.nextLine();
			System.out.println("\n\n");
			Person p = new Person();
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
					break;
				}
				else if(pArray[i] != null && i == pArray.length)
				{
					System.out.println("The array size is full");
				}
			}
	}
}