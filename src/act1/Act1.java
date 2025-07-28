

package act1;

import java.util.Scanner;

public class Act1 {

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         String name;
         int subjects;
         float ave = 0;
         
        System.out.println("Enter student name: ");
         name = sc.nextLine();
         
        System.out.println("Enter number of subjects: ");
        subjects = sc.nextInt();
        
        for (int i = 0; i < subjects; i++){
                    
            System.out.println("Enter grade for sub:" + (i + 1) + ":" );
            float grade = sc.nextFloat();
            ave += grade / subjects;
            
    }
        System.out.printf("Average: "+ave);
        
        if(ave <= 100 && ave >= 75){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
}
}
