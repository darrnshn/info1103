public class OrderedPair {
  private double first;
  private double second;

  public OrderedPair(double f, double s) {
    setPair(f, s);
  }

  public double getFirst() {
    return this.first;
  }

  public double getSecond() {
    return this.second;
  }

  public void setPair(double f, double s) {
    if (f <= s) {
      this.first = f;
      this.second = s;
    } else {
      this.first = s;
      this.second = f;
    }
  }

  public void setFirst(double f) {
    if (f <= this.second) {
      this.first = f;
    } else {
      throw new IllegalArgumentException("First must be <= second");
    }
  }

  public void setSecond(double s) {
    if (this.first <= s) {
      this.second = s;
    } else {
      throw new IllegalArgumentException("First must be <= second");
    }
  }
}
