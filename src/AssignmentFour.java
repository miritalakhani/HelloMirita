
/*int minNum=0, maxNum=100, chosenNum=55; char firstLetter=‘A’, lastLetter =‘Z’, chosenLetter=‘Z’;
        1. Print an expression if chosenNum is bigger than minNum and smaller or equal to maxNum;
        2. Print an expression if chosenLetter is equal to firstLetter or lastLetter;*/

public class AssignmentFour {
    public static void main(String[] argus){
        int minNum=0, maxNum=100, chosenNum=55;
        if((chosenNum > minNum) && (chosenNum <= maxNum))
//            Both operands should be true
            System.out.println("AND condition is TRUE! (chosenNum > minNum) && (chosenNum <= maxNum)");

        char firstLetter = 'A', lastLetter = 'Z', chosenLetter = 'Z';
        if ((chosenLetter == firstLetter) || (chosenLetter == lastLetter))
//            one operand should be true
            System.out.println("OR condition is TRUE! (chosenLetter == firstLetter) || (chosenLetter == lastLetter)");
    }
}
