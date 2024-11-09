import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    \nCommands!
                    ~~~~~~~~~~~~~~~~~~~~~~~~
                    1 -> Parallelepiped area
                    2 -> Parallelepiped volume
                    
                    ~~~~~~~~~~~~~~~~~~~~~~~~
                    Choose commend:""");
            try {
                int choise = scanner.nextInt();
                switch (choise) {
                    case 1:
                        System.out.println("Параллелепипеддин параметрлерин киргиз: ");

                        System.out.print("Height (бийиктик) : ");
                        double height = getPositiveDouble(scanner);
                        System.out.print("Length (узундук): ");
                        double length = getPositiveDouble(scanner);
                        System.out.print("Width (туурасы): ");
                        double width = getPositiveDouble(scanner);

                        Parallelepiped parallelepiped = new Parallelepiped(height, length, width);
                        parallelepiped.areaParallelepiped(height, length, width);
                        parallelepiped.volumeParallelepiped(height, length, width);
                        break;

                    case 2:
                        System.out.println("Цилиндирдин параметрлерин киргиз: ");

                        System.out.print("Radius (радиус): ");
                        double radius = getPositiveDouble(scanner);
                        System.out.print("Height (бийиктик): ");
                        height = getPositiveDouble(scanner);
                        double PI = 3.14;
                        System.out.println("PI (ПИ саны): "+PI);


                        Cylinder cylinder = new Cylinder(radius,height,PI);
                        System.out.print("Цилиндирдин аянты:");
                        System.out.println("\t"+cylinder.cylindersArea(radius, height, PI));
                        System.out.print("Цилиндирдин колому:");
                        System.out.println("\t"+cylinder.cylinderVolume(radius, height, PI));
                        break;

                    default:
                        System.out.println("Тандалган фигура туура эмес: ");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Ката кетти: " + e.getMessage());
            }

        }
    }

    public static double getPositiveDouble(Scanner scanner) {
        while (true) {
            try {
                double value = scanner.nextDouble();
                if (value <= 0) {
                    throw new IllegalArgumentException("Маалымат терс же 0 болушу мүмкүн эмес.");
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Ката: Сиз сан киргизишиңиз керек.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ката: " + e.getMessage());
            }
        }
    }
}


