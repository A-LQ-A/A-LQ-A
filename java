public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    // your code
    int y = 0;
    while(principal < desired)
      {principal += principal * interest * (1-tax);
      y++;}
    return y;
    
  }
}
