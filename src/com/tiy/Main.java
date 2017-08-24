package com.tiy;

public class Main {

    public static void main(String[] args) {

    	MyArrayList myArrayList = new MyArrayList();

    	int[] newArray = {1, 2, 3, 4, 5, 6};
		myArrayList.countMults(newArray, 2);
		System.out.println(myArrayList.validNums);

		int[] newArray2 = {1, 3, 3, 1, 3, 3, 1, 3, 3};

		myArrayList.hasThreeNonAdjacentThrees(newArray2);
		System.out.println(myArrayList.AdjThrees);
		String word = "cat";
		System.out.println(myArrayList.containsString(word.toCharArray(), "cat"));
	}
}
