object Main {
  def main(args: Array[String]): Unit = {

    val Final_Profit = profit(25)
    println("Highest Profit = "+Final_Profit);
    println("Best Ticket Price = " + 25);

  }
  def NoOfAttendees(x:Int) : Int = { //calculate the number of attendees by giving the ticket price
    return 120 + (15-x)/5*20
  }
  def revenue(x:Int):Int = {  //calculate the revenue by giving the ticket price
    return NoOfAttendees(x) * x
  }

  def Cost(x:Int):Int = {
    return 500 + 3 * NoOfAttendees(x)
  }

  def profit(x:Int):Int = {
    return revenue(x) - Cost(x)
  }
  //answer =>
  // Highest Profit = 1260
  //Best Ticket Price = 25
  
}
