package Controller;
import java.awt.event.ItemEvent;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

import itemMenu.ItemMenu;
import model.Chef;
import model.Customer;

public class OwnerController {
	private Scanner input;
	private ArrayList<Customer> listCustomer;
	private ArrayList<Chef> listChef;
	private ArrayList<ItemMenu> listMenu;
	
	public OwnerController() {
		input = new Scanner(System.in);
		listCustomer = new ArrayList<>();
		listChef = new ArrayList<>();
		listMenu = new ArrayList<>();
	}
	
	// GET LIST DATA
	public ArrayList<Customer> getListCustomer(){
		return listCustomer;
	}
	public ArrayList<Chef> getListChef(){
		return listChef;
	}
	public ArrayList<ItemMenu> getListMenu(){
		return listMenu;
	}
	
	// CRUD Menu
	

}