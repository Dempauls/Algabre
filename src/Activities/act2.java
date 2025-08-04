
package Activities;

import java.util.Scanner;

public class act2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        String emname = sc.nextLine ();
        System.out.println("Enter hourly rate: ");
        float hrate = sc.nextFloat ();
        System.out.println("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("--------Wage Summary-------");
        System.out.println("Employee: "+emname);
        System.out.println("Hourly Rate: "+hrate);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Gross weekly Wage: "+(hours*hrate));
        System.out.printf("SSS Contributions(10%%): %.2f\n", ((hours*hrate)*0.1));
        System.out.println("-------------------------");
        System.out.println("Net Weekly Wage: "+((hours*hrate)-(hours*hrate)*0.1));
        
        
    }
    
}
