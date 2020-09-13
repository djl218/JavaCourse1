
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class MainProgram {

    public static void main(String[] args) {
    
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int i = 0;
        int indexOfSmallest = 0;
        
        while (i < array.length) {
            
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
            
            i++;
        }
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = table[startIndex];
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
     
        /*int first = array[index1];
        int firstIndex = 0;
        int second = array[index2];
        int secondIndex = 0;
        
        for (int i = index1; i < array.length; i++) {
            if (array[i] == first) {
                firstIndex = i;
            } else if (array[i] == second) {
                secondIndex = i;
            }
        }
        
        array[firstIndex] = second;
        array[secondIndex] = first;*/
        
        int c = array[index1];
        array[index1] = array[index2];
        array[index2] = c;
    }
    
    public static void sort(int[] array) {
        
        System.out.println(Arrays.toString(array));
        
        int i = 0;
        int smallest = 0;
        while (i < array.length - 1) {
            smallest = indexOfSmallestFrom(array, i);
            if (array[smallest] < array[i]) {
                swap(array, i, smallest);
            }
            
            System.out.println(Arrays.toString(array));
            i++;
        }
        
    }
}
