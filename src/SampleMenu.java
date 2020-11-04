import java.util.ArrayList;
import java.util.Scanner;

public class SampleMenu {



        static Scanner sc = new Scanner(System.in);
        static int methodInput = -1;

        public static void main(String[] args) {
            // Make a program to print a menu for a student
//		Please press:
//			1) Enter grade
//			2) Delete grade
//			3) calculate avg
//			4) exit
//
//			First choose between primitive arrays and arraylist to solve the problem.
//			Second implement the code needed for the menu options. (when the user deletes the grade he enters an index)
//			This exercise along with the one from the previews session are to be done for the next time that we will meet,
//			when we will discuss them along with arraylist examples and sorting.

            // needed variables;
            // variable for the menu selections
            int input;
            // to hold the grades entered by the user
            ArrayList<Integer> al = new ArrayList<>();

            while (true) {
                methodInput = -1;
                System.out.println("\nPlease press: \n1) Enter grade\n2) Delete grade\n3) Calculate average\n4) Exit");
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                if (input < 0 && input > 5) {
                    System.out.println("Invalid input, selections are between 1-4");
                    continue;
                } else {

                    switch (input) {
                        case (1): {
                            al.add(enterGrade());
                            break;
                        }
                        case (2): {
                            if (deleteGrade(al)) {
                                al.remove(methodInput);
                            }
                            ;
                            break;
                        }
                        case (3): {
                            calculateAverage(al);
                            break;
                        }
                        case (4): {
                            exit();
                            break;
                        }
                        default: {
                            System.out.println("Invalid seleciton");
                        }

                    }
                }

            } // bracket for the while statement.

        }

        // methods


        public static int enterGrade() {
            int number = 0;
            System.out.println("Enter grade:");
            number = sc.nextInt();

            System.out.printf("You entered a grade of %d.\n", number);
            return number;
        }

        public static boolean deleteGrade(ArrayList array) {
            methodInput = -1;
            int i = 0;
            System.out.println("Indicate the index of the grade to be deleted:"+"\n");
            methodInput = sc.nextInt();
            if (methodInput <= array.size() - 1) {
                System.out.printf("%d was found and deleted", methodInput);
                return true;
            } else {
                System.out.printf("%d was not found", methodInput);
                return false;
            }
        }

        public static void calculateAverage(ArrayList<Integer> numbers) {
            double sum = 0;
            int counter = 0;
            while (numbers.size() - 1 >= counter) {
                sum += numbers.get(counter);
                counter++;
            }
            System.out.printf("The average is %.2f\n", sum / numbers.size());
        }

        public static void exit() {
            System.out.println("You pressed 4 to exit.\nGood bye.");
        }

    }
