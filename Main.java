class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts!");

    int numTotal;
    double numBlue;
    double numBrown;
    double numGreen;
    double numOrange;
    double numRed;
    double numYellow;

    numTotal=55*10;
    numBlue=numTotal*.24;
    numBrown=numTotal*.13;
    numGreen=numTotal*.16;
    numOrange=numTotal*.20;
    numRed=numTotal*.13;
    numYellow=numTotal*.14;

    System.out.println("Blue: "+numBlue);
    System.out.println("Brown: "+numBrown);
    System.out.println("Green: "+numGreen);
    System.out.println("Orange: "+numOrange);
    System.out.println("Red: "+numRed);
    System.out.println("Yellow: "+numYellow);

    double sum;
    sum=numBlue+numBrown+numGreen+numOrange+numRed+numYellow;

    System.out.println("Sum: "+sum);

    if(numBlue > numBrown && numGreen > numOrange)
      System.out.println("Blue over Brown and Green over Orange");
    if(numBrown <= numRed)
      System.out.println("Brown is less than or equal to Red");
    if(sum == numTotal)
      System.out.println("Numbers match");

  }
}