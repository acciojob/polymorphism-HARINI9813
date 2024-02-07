package com.driver;

class product{
    public int product(int x, int y)
    {
        return 0;
    }
    public int product(int x, int y, int z) {
        return 0;
    }
    public double product(double x, double y)
    {
        return 0;
    }
}
public class Main {
  public static void main(String[] args) {
      product obj = new product();
      obj.product(0, 0);
      obj.product(0, 0, 0);
      obj.product(1.0, 1.0);
  }

}