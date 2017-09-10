class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double BASE_FARE = 7.0;
  final double DISCOUNT_FARE = 6.0;
  final double EXCESS_FARE = 0.5;
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  // -> String
  //Displays information about the JeepneyTrip
  public String toString() {
    return this.distance + ", " + this.totalPassengers + ", " + this.discountPassengers; 
  }
   
  // -> double
  //Returns the amount of excess distance travelled if any
  double excessDistance() {
    if (this.distance <= BASE_KM) {
      return 0;
    } else {
      return this.distance - BASE_KM;
    }
  }
  
  // -> double
  //Returns the amount of fare to be paid for regular passengers based on the trip info
  double computeRegularFare() {
    return (this.totalPassengers - this.discountPassengers) * (BASE_FARE + (excessDistance() * EXCESS_FARE));
  }
  
  // -> double
  //Returns the amount of fare to be paid for discount passengers based on the trip info
  double computeDiscountFare() {
    return (this.discountPassengers) * (DISCOUNT_FARE + (excessDistance() * EXCESS_FARE));
  }
 
  // -> double
  //Returns the sum of the regular fare and the discount fare
  double totalFare() {
    return computeRegularFare() + computeDiscountFare();
  }
  //double -> double
  //Returns the change to be given to the passenger
  double fareChange(double payment) {
    return payment - totalFare();
  }
}
