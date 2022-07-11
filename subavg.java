import java.util.Scanner;
    public class subavg
    {
        public static void main(String[] args) {
            System.out.println("How many Courses do you have...?");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();

            double[] nbcourses = new double[x];
            double sum = 0;

            for (int i = 0; i < nbcourses.length; i++) {
                System.out.println("your marks for Course " + (i + 1) + " is :");
                nbcourses[i] = scan.nextDouble();
            }
            for (int i = 0; i < nbcourses.length; i++) {
                sum = sum + nbcourses[i];
            }
            {
                double average = sum/nbcourses.length;
                System.out.println("Average is : " + average);
            }
        }
    }
