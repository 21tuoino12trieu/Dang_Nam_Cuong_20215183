import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int month = -1;
        while (month < 1 || month > 12) {
            System.out.print("Enter the month (1-12 or name): ");
            String input = scanner.nextLine();

            try {
                month = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // not a valid integer
                month = -1;
            }

            if (month < 1 || month > 12) {
                for (int i = 0; i < monthNames.length; i++) {
                    if (input.equalsIgnoreCase(monthNames[i]) || input.equalsIgnoreCase(monthNames[i].substring(0, 3))) {
                        month = i + 1;
                        break;
                    }
                }
            }

            if (month < 1 || month > 12) {
                System.out.println("Invalid month, please try again.");
            }
        }

        int year = -1;
        while (year < 0) {
            System.out.print("Enter the year: ");
            String input = scanner.nextLine();

            try {
                year = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // not a valid integer
                year = -1;
            }

            if (year < 0) {
                System.out.println("Invalid year, please enter a non-negative number.");
            }
        }

        int days = daysInMonth[month - 1];
        if (month == 2 && isLeapYear(year)) {
            days = 29;
        }

        System.out.printf("There are %d days in %s %d.\n", days, monthNames[month - 1], year);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
