package main;

import exception.NoElementFoundException;

public class ArrayMain {
    public static void main(String[] args) {

    }
    public boolean search(int[] arr, int searchElement) throws NoElementFoundException {
        boolean response = false;
        for (int element : arr) {
            if(element == searchElement){
                response = true;
                break;
            }

        }
        if(!response){
            throw new NoElementFoundException("Element No found");
        }

        return response;

    }
}
