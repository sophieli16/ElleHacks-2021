import java.io.*;
import java.util.Scanner;

class Main {
  public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
  private static double shopping;
  private static double groceries;
  private static double dining;
  private static double home;
  private static double entertainment;
  private static double travel;
  private static double cash;
  private static double fees;
  private static int points;
  private static double budgetshopping;
  private static double budgetgroceries;
  private static double budgetdining;
  private static double budgethome;
  private static double budgetentertainment;
  private static double budgettravel;
  private static double budgetcash;
  private static double budgetfees;
  // private boolean overunder;

  public static void readFile(File fileName) throws IOException {
    BufferedReader inFile = new BufferedReader(new FileReader(fileName));
    shopping = Double.parseDouble(inFile.readLine());
    user.setShopping(shopping);
    groceries = Double.parseDouble(inFile.readLine());
    user.setGroceries(groceries);
    dining = Double.parseDouble(inFile.readLine());
    user.setDining(dining);
    home = Double.parseDouble(inFile.readLine());
    user.setHome(home);
    entertainment = Double.parseDouble(inFile.readLine());
    user.setEntertainment(entertainment);
    travel = Double.parseDouble(inFile.readLine());
    user.setTravel(travel);
    cash = Double.parseDouble(inFile.readLine());
    user.setCash(cash);
    fees = Double.parseDouble(inFile.readLine());
    user.setFees(fees);
    points = Integer.parseInt(inFile.readLine());
    user.setPoints(points);
    budgetshopping = Double.parseDouble(inFile.readLine());
    user.setBudgetShopping(budgetshopping);
    budgetgroceries = Double.parseDouble(inFile.readLine());
    user.setBudgetGroceries(budgetgroceries);
    budgetdining = Double.parseDouble(inFile.readLine());
    user.setBudgetDining(budgetdining);
    budgethome = Double.parseDouble(inFile.readLine());
    user.setBudgetHome(budgethome);
    budgetentertainment = Double.parseDouble(inFile.readLine());
    user.setBudgetEntertainment(budgetentertainment);
    budgettravel = Double.parseDouble(inFile.readLine());
    user.setBudgetTravel(budgettravel);
    budgetcash = Double.parseDouble(inFile.readLine());
    user.setBudgetCash(budgetcash);
    budgetfees = Double.parseDouble(inFile.readLine());
    user.setBudgetFees(budgetfees);
  }

  public static String input = "";
  public static double editbudget = 0;
  public static int userpoints = 0;
  public static spending user = new spending();
  public static double moneyspent = 0;

  public static void main(String[] args) throws IOException {
    File filename = new File("input.txt");
    readFile(filename);

    System.out.print("Budget Buddy");
    Points();
    Edit();
    Points();
    Edit();
    Points();
  }

  public static void Points() {
    user.checkSpending();
    userpoints += user.getPoints();
    boolean tf = false;

    if (user.getTotalBudget() > user.getTotalSpending()) {
      tf = true; // under
    }

    // moneyspent = user.getcompare();
    if (tf == false) {
      System.out.println("\n" + "You are " + (user.getTotalSpending() - user.getTotalBudget()) + " over budget.");
      System.out.println("Points Assigned: 0");
    } else if (tf == true) {
      System.out.println("\n" + "You are " + (user.getTotalBudget() - user.getTotalSpending()) + " under budget.");
      System.out.println("Points Assigned: " + userpoints);
    }

  }

  public static void Edit() throws IOException {
    do {
      Scanner myObj = new Scanner(System.in); // Create scanner
      System.out.println("\n" + "Edit budget? (Y/N): ");
      String input = myObj.nextLine(); // Read user input
      // input = myObj.nextLine().toUpperCase(); // to get user input

      if (input.equals("y")) {
        System.out.println("\n" + "Categories:");
        System.out.println("\n" + "Shopping:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setShopping(editbudget);
        System.out.println("Groceries:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setGroceries(editbudget);
        System.out.println("Dining:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setDining(editbudget);
        System.out.println("Home:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setHome(editbudget);
        System.out.println("Entertainment:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setEntertainment(editbudget);
        System.out.println("Travel:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setTravel(editbudget);
        System.out.println("Cash:");
        editbudget = Double.parseDouble(cin.readLine());
        user.setCash(editbudget);
        System.out.println("Fees:");
        editbudget = Double.parseDouble(cin.readLine());

        user.setFees(editbudget);
      } else {
        break;
      }

    } while (input.equals("n") == false);

  }

}