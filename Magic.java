public class Magic {
  //program that performs mathmatical magic!
	public static void main(String[] args) {
    int myNumber = 55;
    //myNumber is original number
    

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    //System.out.println(stepSix);
    //no matter what num is myNumber the output is always 3!

    //now use only 2 variables myNumber and magicNumber
    int magicNumber = myNumber * myNumber;
    //increase vaue by myNumber
    magicNumber += myNumber;
    //divide 
    magicNumber /= myNumber;
    //increase by 17
    magicNumber += 17;
    //decrease 
    magicNumber -= myNumber;
    //divide 
    magicNumber /= 6;
    System.out.println(magicNumber);


	}
}
