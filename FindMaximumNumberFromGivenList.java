/*
 * Question#3
 * to find Maximum number from given array
 */
public class FindMaximumNumberFromGivenList {
    volatile int[] numberArray;
    volatile int maxNum;

    public FindMaximumNumberFromGivenList(int[] arrayNumber){
        this.numberArray = arrayNumber;
    }
    public void getMaximumNumber(){
        maxNum = numberArray[0];
        for(int i=1; i< numberArray.length; i++){
            if(numberArray[i] > maxNum)
            maxNum = numberArray[i];
        }
        System.out.println("Maximum Number is " + maxNum);
    }  
    public static void main(String[] args){
        int inputArray[] = {6, 8, 3, 5, 1, 9 };
        FindMaximumNumberFromGivenList obj = new FindMaximumNumberFromGivenList(inputArray);
        obj.getMaximumNumber();
    }
}
