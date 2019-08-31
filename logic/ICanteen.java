package logic;
import java.util.*;

public class ICanteen {
	public static List<Store> stores = new ArrayList<Store>();
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			//FILL CODE
			printMain();
			System.out.print("Select a program to do : ");
			int c = kb.nextInt();
			switch (c) {
			case 1:
				System.out.println("---------------------------");
				addStoreHandle();
				System.out.println("---------------------------");
				break;
			case 2:
				System.out.println("---------------------------");
				manageStoreHandle();
				System.out.println("---------------------------");
				break;
			case 3:
				System.out.println("---------------------------");
				buyFoodHandle();
				System.out.println("---------------------------");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid input!!");
			}

		}

	}

	private static boolean addStoreHandle() {		
		System.out.print("Store Name : ");
		//FILL CODE
		String name = kb.next();
		Store store = new Store(name) ;
		if(!stores.contains(store)) {
			stores.add(new Store(name));
			System.out.println("The store named " + name + " was added!");
			return true;
		}
		else {	
			return false;
		}
		
	}

	private static boolean manageStoreHandle() {
		//FILL CODE
		if(showStores()) {
			/*System.out.println("Here are all stores");
			for(Store s : stores) {
				int i = 1;
				System.out.println("["+i+"] "+ s);
				i++;
			}*/
			System.out.print("Please select store :");
			int i = kb.nextInt();
			Store store = stores.get(i-1);
			store.manageProcessHandle();
			return true;
		}
		//System.out.println("Please add store first!!");
		else {
			return false;
		}
	}

	private static boolean buyFoodHandle() {
		//FILL CODE
		if(showStores()) {
			/*System.out.println("Here are all stores");
			for(Store s : stores) {
				int i = 1 ;
				System.out.println("["+i+"] "+ s);
				i++;
			}*/
			System.out.print("Please select store :");
			int i = kb.nextInt();
			Store store = stores.get(i-1);
			store.sellProcessHandle();
			return true;
		}
		else {
			//System.out.println("Please add store first!!");
			return false;
		}
	}

	public static void printMain() {
		System.out.println("=========== Main Menu ==========");
		System.out.println("What to do?");
		System.out.println("1. Add Store");
		System.out.println("2. Manage Store");
		System.out.println("3. Buy food");
		System.out.println("4. Exit program");
	}

	public static boolean showStores() {
		//FILL CODE
		if(stores.size() == 0) {
			System.out.println("Please add store first!!");
			return false;
		}
		else {
			System.out.println("Here are all stores");
			for(Store s : stores) {
				int i = 1;
				System.out.println("["+i+"] "+ s);
				i++;
			}
			return true;
		}
	}
	
}
