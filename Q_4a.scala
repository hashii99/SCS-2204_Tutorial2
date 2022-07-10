object Main {
  def main(args: Array[String]): Unit = {
    println("Take Home Salary = "+takeHomeSalary(40,30))
  }

  def workingSalary(h:Int): Int = { //calculate the salary for working Hours
    return h * 250;
  }
  def OTSalary(h:Int):Int = {  //calculate the salary for OT Hours
    return h * 85
  }
  def Income(h1:Int, h2:Int): Int = { //calculate the income
    return workingSalary(h1) + OTSalary(h2)
  }
  def tax(income:Int): Double = {  //calculate the tax
    return income * (12.0/100.0);
  }
  def takeHomeSalary(x:Int, y:Int): Double = { //final salary
    return Income(x,y) - tax(Income(x,y))
  }
// answer =>
//Take Home Salary = 11044.0
}
