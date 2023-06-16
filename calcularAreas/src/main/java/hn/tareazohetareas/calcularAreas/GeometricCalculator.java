package hn.tareazohetareas.calcularAreas;

import java.util.Scanner;

public class GeometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCirculo(scanner);
                    break;
                case 2:
                    calcularAreaCuadrado(scanner);
                    break;
                case 3:
                    calcularAreaRectangulo(scanner);
                    break;
                case 4:
                    calcularAreaTriangulo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);
    }
    public static double calcularAreaCirculo(double lado) {
		// TODO Auto-generated method stub
		return lado;
	}

	public static double calcularAreaCuadrado(double lado) {
		// TODO Auto-generated method stub
		return lado;
	}

	public static double calcularAreaRectangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public static double calcularAreaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

    public static double calcularAreaCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
		return area;
    }

    public static void calcularAreaCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void calcularAreaRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

   

	public static void calcularAreaTriangulo(Scanner scanner) {
		System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
	}

	
	
		
}