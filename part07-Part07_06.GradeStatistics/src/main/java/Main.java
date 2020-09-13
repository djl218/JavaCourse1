import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> points = new ArrayList<Integer>();
        ArrayList<Integer> passingPoints = new ArrayList<Integer>();
        ArrayList<Integer> allPoints = new ArrayList<Integer>();
        System.out.println("Enter point totals, -1 stops:");
        int point = 0;
        int passingParticipants = 0;
        int failingParticipants = 0;
        
        while (true) {
            point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            } else if (point >= 50 && point <= 100) {
                passingPoints.add(point);
                points.add(point);
                passingParticipants++;
            } else if (point >= 0 && point <= 100) {
                points.add(point);
                failingParticipants++;
            }
        }
        
        average(points);
        passingAverage(passingPoints);
        passPercentage(passingParticipants, failingParticipants);
        gradeDistribution(points);
    }
    
    public static void average(ArrayList<Integer> points) {
        int sum = 0;
        int counter = 0;
        
        for (Integer point : points) {
            sum = sum + point;
            counter++;
        }
        
        double average = 1.0 * sum / counter;
        
        System.out.println("Point average (all): " + average);  
    }
    
    public static void passingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int counter = 0;
        double average = 0;
        
        if (points.size() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            for (Integer point : points) {
                sum = sum + point;
                counter++;
            }
            
            average = 1.0 * sum / counter;
        
            System.out.println("Point average (passing): " + average);
        }
    }    
    
    public static void passPercentage(int passing, int failing) {

        double passPercentage = 100.0 * (passing * 1.0 / (1.0 * passing + failing));
        
        System.out.println("Pass percentage: " + passPercentage);
    }
    
    public static void gradeDistribution(ArrayList<Integer> pts) {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        
        for (Integer point : pts) {
            if (point >=0 && point <50) {
                grade0++;
            } else if (point < 60) {
                grade1++;
            } else if (point < 70) {
                grade2++;
            } else if (point < 80) {
                grade3++;
            } else if (point < 90) {
                grade4++;
            } else if (point >= 90 && point <= 100) {
                grade5++;
            }
        }
        
        System.out.print("5: ");
        printStars(grade5);
        System.out.println("");
        System.out.print("4: ");
        printStars(grade4);
        System.out.println("");
        System.out.print("3: ");
        printStars(grade3);
        System.out.println("");
        System.out.print("2: ");
        printStars(grade2);
        System.out.println("");
        System.out.print("1: ");
        printStars(grade1);
        System.out.println("");
        System.out.print("0: ");
        printStars(grade0);
    }
    
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}    

