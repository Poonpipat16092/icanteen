package logic;
import java.util.Scanner;

import java.util.*;
import java.util.*;

public class Store {
	private String name ;
	private int totalSales;
	private List<Record> records;
	private List<Menu> menus;
	Scanner s = new Scanner(System.in);
	public Store(String name) {
		this.name = name;
		menus = new ArrayList<Menu>();
		records = new ArrayList<Record>();
		//List<Menu> menus = new ArrayList<Menu>();
	}
	public void  showAllMenu() {
		for(Menu m : menus) {
			toString();
		}
	}
	public boolean addMenu(Menu menu) {
		if(menus.contains(menu)) {
			return false;
		}
		else {
			menus.add(menu);
			return true;
		}	
	}
	public void addRecord(Record record) {
		records.add(record);
	}
	public void sell(Menu menu, boolean isSpecial) {
		//FILL CODE
		int price;
		if(!menus.contains(menu)) {
			System.out.println("Please select valid menu.");
		}
		else {
			if(isSpecial) {
				price  = menu.getSpecialPrice();
				totalSales += price;
				System.out.println("Thank you for buying " + menu.getName() + " " + price + " Bath");
			}
			else {
				price = menu.getPrice();
				totalSales += price;
			}
			records.add(new Record(menu.getName(), price));
		}
	}
	public void showRecord() {
		for(Record r : records) {
			toString();
		}
	}
	
	public void sellProcessHandle() {
		//FILL CODE
		System.out.println("---------------------------");
		System.out.println("Welcome to "+this.name);
		System.out.println("---------------------------");
		if(menus.size() == 0 ) {
			System.out.println("Please add menu first");
		}
		else {
			System.out.print("Please select menu : ");
			int num_m = s.nextInt();
			Menu menu = menus.get(num_m-1);
			System.out.print("Upgrade to special ? (Y/N) :");
			String up = s.next();
			if(up == "N") {
				this.sell(menu,false);
			}
			else {
				this.sell(menu,true);
			}
		}
	}
	public void manageProcessHandle() {
		System.out.println("---------------------------");
		System.out.println("Welcome to "+this.name);
		System.out.println("---------------------------");
		System.out.println("1. Add menu");
		System.out.println("2. Show summary");
		System.out.println("Select a program to do : ");
		int c = s.nextInt();
		if(c==1) {
			addMenuHandle();
		}
		else if(c==2) {
			showSummary();
		}
	}
	
	private void addMenuHandle() {
		//FILL HERE
		System.out.println("Please enter menu name :");
		String m = s.nextLine();
		System.out.println("Please enter price :");
		int p = s.nextInt();
		Menu new_menu = new Menu(m,p);
		System.out.println("New menu " + name + " added!");
	}

	private void showSummary() {
		//FILL CODE
		System.out.println("Total Sales : " + this.totalSales);
		for(Record r : records) {
			toString();
		}
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public List<Record> getRecords() {
		return records;
	}
	public void setRecords(List<Record> records) {
		this.records = records;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	public Scanner getS() {
		return s;
	}
	public void setS(Scanner s) {
		this.s = s;
	}
	
}
