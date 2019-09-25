package main;

import exception.NoElementFoundException;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int searchElement = 150;

        ArrayMain obj = new ArrayMain();
        try {
            if(obj.search(arr, searchElement)){
                System.out.println("element found");
            }
        } catch (NoElementFoundException e) {
            System.out.println(e.getMessage());
        }

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
            throw new NoElementFoundException("Element Not found");
        }

        return response;

    }
}
