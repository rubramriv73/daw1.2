package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejericio 24: 	Escribe un programa que genere la nómina (bien desglosada) 
 * 								de un empleado según las siguientes condiciones:
 * 								• Se pregunta el cargo del empleado 
 * 									(1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), 
 * 									los días que ha estado de viaje visitando clientes durante 
 * 									el mes y su estado civil (1 - Soltero, 2 - Casado).
 * 								• El sueldo base según el cargo es de 950, 1200 y 1600 euros 
 * 									según si se trata de un prog. junior, un prog. senior o un jefe 
 * 									de proyecto respectivamente.
 * 								• Por cada día de viaje visitando clientes se pagan 30 euros 
 * 									extra en concepto de dietas. Al sueldo neto hay que restarle el 
 * 									IRPF, que será de un 25% en caso de estar soltero y un 20% en caso 
 * 									de estar casado.
 *
 */
public class Ej24Nomina {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Variable to save the user's data
		int position;
		int days;
		int status;
		
		// Variable to save the data from the payslip
		int salary;
		int tripSalary;
		double discount;
		double totalSalary;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** PAYSLIP ***\t\n");
		
		// We ask the user to give us his position as employee, the days spent on a trip and the marital status
		System.out.print("Position as employee:"
				+ "\n1 - Junior"
				+ "\n2 - Senior"
				+ "\n3 - Proyect Leader"
				+ "\n What's your position? ");
		position = sc.nextInt();
		System.out.println("Days spent on a work trip?");
		days = sc.nextInt();
		System.out.print("Marital Status:"
				+ "\n1 - Single"
				+ "\n2 - Married"
				+ "\n What's your marital status? ");
		status = sc.nextInt();
		
		switch (position) {
		case 1:
			salary = 950;
			tripSalary = days * 30;
			if (status == 1) {
				discount = (double)(salary + tripSalary) * 0.25;
				
			} else {
				discount = (double)(salary + tripSalary) * 0.2;
				
			}
			totalSalary = salary + tripSalary - discount;
			
			System.out.println("\n -- USER'S PAYSLIP -- "
					+ "\n	Salary -> " + salary + "€"
							+ "\n	Salary per trip -> " + tripSalary + "€"
									+ "\n	Discount -> -" + discount + "€"
											+ "\n	Total salary -> " + totalSalary + "€");
			break;
			
		case 2:
			salary = 1200;
			tripSalary = days * 30;
			if (status == 1) {
				discount = (double)(salary + tripSalary) * 0.25;
				
			} else {
				discount = (double)(salary + tripSalary) * 0.2;
				
			}
			
			totalSalary = salary + tripSalary - discount;
			
			System.out.println("\n -- USER'S PAYSLIP -- "
					+ "\n	Salary -> " + salary + "€"
							+ "\n	Salary per trip -> " + tripSalary + "€"
									+ "\n	Discount -> -" + discount + "€"
											+ "\n	Total salary -> " + totalSalary + "€");
			break;
			
		case 3:
			salary = 1600;
			tripSalary = days * 30;
			if (status == 1) {
				discount = (double)(salary + tripSalary) * 0.25;
				
			} else {
				discount = (double)(salary + tripSalary) * 0.2;
				
			}
			
			totalSalary = salary + tripSalary - discount;
			
			System.out.println("\n -- USER'S PAYSLIP -- "
					+ "\n	Salary -> " + salary + "€"
							+ "\n	Salary per trip -> " + tripSalary + "€"
									+ "\n	Discount -> -" + discount + "€"
											+ "\n	Total salary -> " + totalSalary + "€");
			break;

		default:
			System.out.println("Wrong position given. Try later with the correct information");
			break;
		}
		

		
	}

}
