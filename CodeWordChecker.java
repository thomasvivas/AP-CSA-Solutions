public class CodeWordChecker implements StringChecker {
  private int minLength;
  private int maxLength;
  private String disallowedText;

  public CodeWordChecker(int minLength, int maxLength, String disallowedText) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.disallowedText = disallowedText;
  }

  public CodeWordChecker(String disallowedText) {
    this.minLength = 6;
    this.maxLength = 20;
    this.disallowedText = disallowedText;
  }

  public boolean isValid(String str) {
    boolean fitsSize = str.length() >= this.minLength && str.length() <= this.maxLength;
    boolean containsDisallowed = str.indexOf(this.disallowedText) != -1;
    return fitsSize && !containsDisallowed;
  }
}
