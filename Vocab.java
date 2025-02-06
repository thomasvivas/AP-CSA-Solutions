public class Vocab {
  // Contents not shown
  private String[] theVocab;

  public boolean findWord(String str) {
    for (String currentWord : this.theVocab) {
      if (currentWord.equals(str)) {
        return true;
      }
    }
    return false;
  }

  public int countNotInVocab(String[] wordArray) {
    int totalNotFound = 0;
    for (String currentWord : wordArray) {
      if (this.findWord(currentWord) == false) {
        totalNotFound++;
      }
    }
    return totalNotFound;
  }  

  public String[] notInVocab(String[] wordArray) {
    String[] res = new String[this.countNotInVocab(wordArray)];
    int lastIndex = 0;
    for (String currentWord : wordArray) {
      if (this.findWord(currentWord) == false) {
        res[lastIndex++] = currentWord;
      }
    }
    return res;
  }
}
