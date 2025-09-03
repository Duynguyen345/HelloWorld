package task;

import java.util.Scanner;

public class Testtask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int count;
		System.out.println("nhap so luong task:");
		count = sc.nextInt();
		Task[] tasks = new Task[count];
		
		for (int i = 0; i < count; i++) {
			System.out.println("nhap id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("nhap title:");
			String title = sc.nextLine();
			System.out.println("nhap description:");
			String description = sc.nextLine();
			
			tasks[i] = new Task(id,title,description);
		}
		for (int i = 0; i < count; i++) {
			System.out.println(tasks[i]);
		}
		sc.close();
	}

}
