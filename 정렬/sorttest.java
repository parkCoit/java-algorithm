package 정렬;

import java.util.Random;

class sorttest {
    public static void main(String[] args) {
        new sorttest().solution();    
    }
    void solution(){
        int[] arr = createArray();
        arr = sortArray(arr);
        printArray(arr);
    }
    int[] createArray(){
        int[] arr = new int[10];
        return arr;
    }
    int createRandomNumber(){
        return (int)(Math.random()*100)+1;
    }
    int[] sortArray(int[] arr){
        return arr;
    }
    void printArray(int[] arr){

    }
}