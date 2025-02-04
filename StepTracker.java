public class StepTracker {
  private final int requiredSteps;
  private int totalDaysActive;
  private int totalSteps;
  private int totalDays;

  public StepTracker(int requiredSteps) {
    this.requiredSteps = requiredSteps;
  }

  public void addDailySteps(int steps) {
    this.totalSteps += steps;
    this.totalDays++;
    if (steps >= this.requiredSteps) {
      this.totalDaysActive++;
    }
  }

  public double averageSteps() {
    if (this.totalDays == 0) {
      return 0.0;
    }
    return (double)this.totalSteps / this.totalDays;
  }

  public int activeDays() {
    return this.totalDaysActive;
  }
}
