
import java.util.Scanner;

public class AirFare {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

System.out.print("Distance (km): ");
double distance = scanner.nextDouble();


System.out.println("Class (1 for Economy, 2 for Business): ");
int classType = scanner.nextInt();


double ratePerKm;

if (classType == 1) {
ratePerKm = 250.0;
} else if (classType == 2) {
ratePerKm = 500.0;
} else {
System.out.println("Invalid class selection!");
scanner.close();
return;
}

double totalFare = distance * ratePerKm;

if (distance > 1000) {
totalFare -= totalFare * 0.10;
}

System.out.printf("Total fare: %.2f%n", totalFare);

scanner.close();
}
}