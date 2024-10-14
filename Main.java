package com.example.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello world");
		
		List<User>allUsers = new ArrayList<User>();
		
		Scanner scanner = new Scanner(System.in);
		int key;
		
		while(true) {
			System.out.println("\n");
			System.out.println("1 registering user");
			System.out.println("2 check for validating using");
			System.out.println("3 adding card");
			System.out.println("4 deleting the card");
			System.out.println("5 Printing list of cards");
			System.out.println("6 updating card");
			System.out.println("7 exit from the application");
			
			System.out.println("Enter the required key: ");
		    key=scanner.nextInt();
	
			switch (key) {
			
			case 1: {
				System.out.println("Enter User Details ");
				String name=scanner.next();
				int id = scanner.nextInt();
				scanner.nextLine();
				int flag=0;
				for (User user : allUsers) {
					if(user.getId() ==id) {
						flag=1;
						System.out.println("User already exsisted");
						break;
						
					}
					
				}
				if(flag==0) {
				User user = new User(name,id);
			    allUsers.add(user);
				System.out.print("User registered");
				}
				break;
			}
			
			case 2: {
				System.out.print("Enyter user id to validate");
				int id = scanner.nextInt();
				scanner.nextLine();
				for (User user : allUsers) {
					if(user.getId() ==id) {
						System.out.print("USer is validated succefully");
					}
					
				}
				break;
				
				
			}
			case 3: {
				System.out.println("Enter the card details like: name,userid,cardnumber :");
				String name= scanner.next();
				scanner.nextLine();
				int userid = scanner.nextInt();
				scanner.nextLine();
				int number = scanner.nextInt();
				scanner.nextLine();
				Boolean falgeBoolean =false;
				Card card = new Card(number, name, userid);
				for (User user : allUsers) {
					if(user.getId() == userid) {
						user.getCards().add(card);
						System.out.println("Card added succfeuslly");
						falgeBoolean=true;
						break;
					}
					
				}
				if(falgeBoolean==false) {
					System.out.print("User not foudn");
				}
				break;
				
			}
			case 4: {
				System.out.print("Enyter card number to delete");
				int number = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enyter userid to validate");
				int id = scanner.nextInt();
				scanner.nextLine();
				for (User user : allUsers) {
					if(user.getId() ==id) {
						for (Card c: user.getCards()) {
							if(c.getNumber()==number) {
								user.getCards().remove(c.getNumber());
								System.out.println("Card delte succfeully");
								break;
							}
							
						}
					}
					
				}
				System.out.println("Invalid card number or userid");
				break;
				
				
			}
			case 5: {
				System.out.print("Enter userid to print the list of cards");
				int id = scanner.nextInt();
				scanner.nextLine();
				for (User user : allUsers) {
					if(user.getId() ==id) {
						System.out.println("The list of cards are:");
						
						System.out.println(user.getCards());
					}
					
				}
				break;
				
				
			}
			
			case 6:{
				System.out.println("Enter the carnumber to update:");
				int number = scanner.nextInt();
				System.out.println("Enter the userid to validate");
				int id=scanner.nextInt();
				System.out.println("Enter the number  ");
				int updatednumber=scanner.nextInt();
				System.out.println("Enter the name:");
				String nameString = scanner.next();
				for (User user : allUsers) {
					if(user.getId()== id) {
						for (Card c : user.getCards()) {
							if(c.getNumber()==number) {
								c.setName(nameString);
								c.setNumber(number);
								System.out.println("Card updated");
								break;
							}
							
							
						}
					}
					
				}
				break;
				
				
			}
			case 7: {
				System.exit(0);
				
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
			
		}
		
	}

}
