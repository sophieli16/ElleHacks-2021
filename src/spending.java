public class spending {
  private double shopping;
  private double groceries;
  private double dining;
  private double home;
  private double entertainment;
  private double travel;
  private double cash;
  private double fees;
  private int points;
  private double budgetshopping;
  private double budgetgroceries;
  private double budgetdining;
  private double budgethome;
  private double budgetentertainment;
  private double budgettravel;
  private double budgetcash;
  private double budgetfees;
  private double totalbudget;
  private double totalspending;
  private boolean overunder;
  private double compare;

  public spending() {
  }

  public spending(double shopping, double groceries, double dining, double home, double entertainment, double travel,
      double cash, double fees, double budgetshopping, double budgetgroceries, double budgetdining, double budgethome,
      double budgetentertainment, double budgettravel, double budgetcash, double budgetfees, int points,
      double totalbudget, double totalspending) {
    this.shopping = shopping;
    this.groceries = groceries;
    this.dining = dining;
    this.home = home;
    this.entertainment = entertainment;
    this.travel = travel;
    this.cash = cash;
    this.fees = fees;
    this.points = points;
    this.budgetshopping = budgetshopping;
    this.budgetgroceries = budgetgroceries;
    this.budgetdining = budgetdining;
    this.budgethome = budgethome;
    this.budgetentertainment = budgetentertainment;
    this.budgettravel = budgettravel;
    this.budgetcash = budgetcash;
    this.budgetfees = budgetfees;
    this.totalbudget = totalbudget;
    this.totalspending = totalspending;
  }

  public double getShopping() {
    return this.shopping;
  }

  public double getGroceries() {
    return this.groceries;
  }

  public double getDining() {
    return this.dining;
  }

  public double getHome() {
    return this.home;
  }

  public double getEntertainment() {
    return this.entertainment;
  }

  public double getTravel() {
    return this.travel;
  }

  public double getCash() {
    return this.cash;
  }

  public double getFees() {
    return this.fees;
  }

  public double getPoints() {
    return this.points;
  }

  public double getBudgetShopping() {
    return this.budgetshopping;
  }

  public double getBudgetGroceries() {
    return this.budgetgroceries;
  }

  public double getBudgetDining() {
    return this.budgetdining;
  }

  public double getBudgetHome() {
    return this.budgethome;
  }

  public double getBudgetEntertainment() {
    return this.budgetentertainment;
  }

  public double getBudgetTravel() {
    return this.budgettravel;
  }

  public double getBudgetCash() {
    return this.budgetcash;
  }

  public double getBudgetFees() {
    return this.budgetfees;
  }

  public double getTotalBudget() {
    return this.totalbudget;
  }

  public double getTotalSpending() {
    return this.totalspending;
  }

  public boolean getoverunder() {
    return this.overunder;
  }

  public double getcompare() {
    return this.compare;
  }

  public void setShopping(double i) {
    this.shopping = i;
  }

  public void setGroceries(double i) {
    this.groceries = i;
  }

  public void setDining(double i) {
    this.dining = i;
  }

  public void setHome(double i) {
    this.home = i;
  }

  public void setEntertainment(double i) {
    this.entertainment = i;
  }

  public void setTravel(double i) {
    this.travel = i;
  }

  public void setCash(double i) {
    this.cash = i;
  }

  public void setFees(double i) {
    this.fees = i;
  }

  public void setPoints(int i) {
    this.points = i;
  }

  public void setBudgetShopping(double i) {
    this.budgetshopping = i;
  }

  public void setBudgetGroceries(double i) {
    this.budgetgroceries = i;
  }

  public void setBudgetDining(double i) {
    this.budgetdining = i;
  }

  public void setBudgetHome(double i) {
    this.budgethome = i;
  }

  public void setBudgetEntertainment(double i) {
    this.budgetentertainment = i;
  }

  public void setBudgetTravel(double i) {
    this.budgettravel = i;
  }

  public void setBudgetCash(double i) {
    this.budgetcash = i;
  }

  public void setBudgetFees(double i) {
    this.budgetfees = i;
  }

  public void setTotalBudget(double i) {
    this.totalbudget = i;
  }

  public void setTotalSpending(double i) {
    this.totalspending = i;
  }

  public void checkSpending() {// check every budget category to check and compare spending and assign points
                               // accordingly
    // AssignPoints(this.shopping,this.budgetshopping);
    this.points = 0;

    this.points += getPoints(this.shopping, this.budgetshopping);

    // AssignPoints(this.groceries,this.budgetgroceries);
    this.points += getPoints(this.groceries, this.budgetgroceries);

    // AssignPoints(this.dining,this.budgetdining);
    this.points += getPoints(this.dining, this.budgetdining);

    // AssignPoints(this.home,this.budgethome);
    this.points += getPoints(this.home, this.budgethome);

    // AssignPoints(this.entertainment,this.budgetentertainment);
    this.points += getPoints(this.entertainment, this.budgetentertainment);

    // AssignPoints(this.travel,this.budgettravel);
    this.points += getPoints(this.travel, this.budgettravel);

    // AssignPoints(this.cash,this.budgetcash);
    this.points += getPoints(this.cash, this.budgetcash);

    // AssignPoints(this.fees,this.budgetfees);
    this.points += getPoints(this.fees, this.budgetfees);

    this.calcBudget();
    this.calcSpending();

    this.overunder = AssignPoints(this.totalspending, this.totalbudget);
    if (this.overunder == false) { // under
      // System.out.println(totalbudget);
      this.compare = this.totalbudget - this.totalspending;
    } else if (this.overunder == true) { // over

      this.compare = this.totalspending - this.totalbudget;
    }

  }

  public static boolean AssignPoints(double spending, double budget) { // check if the spending is within the budget for
                                                                       // week X
    if (spending > budget) {
      return false;
    } else if (spending == budget) {
      return true;
    } else {
      return true;
    }
  }

  public static double getPoints(double spending, double budget) { // assign 100 points for every budget succeeded in
                                                                   // week X
    double totalpoints = 0;
    if (AssignPoints(spending, budget) == true) {
      totalpoints += 100; // add 100 points to user if they spent within their budget
    }
    if (AssignPoints(spending, budget) == false) {
      totalpoints += 0;
    }
    return totalpoints;
  }

  public void calcBudget() {
    this.totalbudget = 0;
    double newbudget = 0;
    newbudget += this.budgetshopping;
    newbudget += this.budgetgroceries;
    newbudget += this.budgetdining;
    newbudget += this.budgethome;
    newbudget += this.budgetentertainment;
    newbudget += this.budgettravel;
    newbudget += this.budgetcash;
    newbudget += this.budgetfees;
    this.totalbudget = newbudget;
  }

  public void calcSpending() {
    this.totalspending = 0;
    double newspending = 0;
    newspending += this.shopping;
    newspending += this.groceries;
    newspending += this.dining;
    newspending += this.home;
    newspending += this.entertainment;
    newspending += this.travel;
    newspending += this.cash;
    newspending += this.fees;
    this.totalspending = newspending;
  }

}