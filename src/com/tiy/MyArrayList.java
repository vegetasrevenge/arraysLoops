package com.tiy;

public class MyArrayList {

    protected static int validNums;

    protected static int firstNum;
    protected static int nextNum;
    protected static int threes;
    protected static boolean AdjThrees = false;
    protected static boolean validChar = false;


    public static int countMults (int[] nums, int divisibility) {
        for (int num: nums){
            int remainder = num % divisibility;
            if(remainder == 0) {
                validNums++;
            }
        }
        return validNums;
    }

    public static boolean hasThreeNonAdjacentThrees (int[] nums) {
        for (int num: nums) {
            firstNum = num;
            if(firstNum == 3) {
               nextNum = firstNum;
            }
            if(firstNum == nextNum){
                threes++;
            }
            if(threes == 3){
                AdjThrees = true;
            }
        }
        return AdjThrees;
    }

    public static boolean containsString (char[] letters, String word) {
        char[] wordChars = word.toCharArray();
        System.out.println(letters);
        Integer matchingChars = 0;
        for (char wordCharacter : wordChars) {
            for (char letterCharacter : letters) {
                if(letterCharacter == wordCharacter) {
                    matchingChars++;
                    break;
                }
            }
        }
       return matchingChars == word.length();
    }






























//    private Object[] backingArray;
//    private Integer nextPosition;
//
//    public MyArrayList() {
//        this.backingArray = new Object[5];
//        this.nextPosition = 0;
//    }
//
//    public void addItem(Object o) {
//        System.out.println(nextPosition);
//
//        if(nextPosition > backingArray.length - 1) {
//            //need a larger array
//            Object[] tmp = new Object[backingArray.length + 5];
//            //move objects into a new array
//            for (int i = 0; i < this.backingArray.length; i++) {
//                tmp[i] = this.backingArray[i];
//            }
//            //Assign backingArray to the new array.
//            this.backingArray = tmp;
//        } else {
//            this.backingArray[nextPosition] = o;
//            this.nextPosition++;
//        }
//
//    }
//
//    public Object getBackingArray(Integer index) {
//        return this.backingArray[index];
//    }
}
