/** Selection Sort algorithm takes 1st element and then swaps it with the lowest value element in the remaining array.
 * Then it goes to the 2nd element and compares it with the rest or the array elements. Swap values with the lowest.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Selection Sort class that implements Selection Sort sorting algorithm.
 */
class SelectionSort {

    /**
     * Array List that we are going to use to store our array.
     */
    private List<Integer> SelectionSortList = new ArrayList<>();

    public void setSelectionSortList(List<Integer> selectionSortList) {
        SelectionSortList = selectionSortList;
    }

    /**
     * Selection Sort algorithm.
     * We create 2 loops, because of this the algorithm complexity is O(n^2).
     * 1. We select the first element in the array, then we compare its value with the rest of the elements
     * 1.1  If there is a smaller value, we select the lowest, and we swap the 2 elements in the array.
     * 2. We repeat this, until we loop through every element in the array list.
     */
    public void sort(){
        int minIndex, tmp;
        for(int i =0; i<SelectionSortList.size()-2;i++){
            minIndex = i;
            for(int j = i+1; j<SelectionSortList.size()-1; j++) {
                if(SelectionSortList.get(j)<SelectionSortList.get(minIndex)){
                    minIndex = j;
                }
            }
            /*
                We assign the minIndex value to a temporary variable, then swap the values with the value at the i-th index.
             */
            tmp = SelectionSortList.get(minIndex);
            SelectionSortList.set(minIndex, SelectionSortList.get(i));
            SelectionSortList.set(i, tmp);
        }
    }

    /**
     *  Display SelectionSortList elements.
     */
    public void printArray(){
        for(int i =0; i<SelectionSortList.size()-1;i++) {
            System.out.printf("%d ", SelectionSortList.get(i));
        }
    }

    public static void main(String[] args)  //static method
    {
        SelectionSort test = new SelectionSort();
        List<Integer> testList = new ArrayList<>(Arrays.asList(5,2,3,4,1,6,9,8,7));
        test.setSelectionSortList(testList);
        System.out.print("Testing Selection sort algorithm with the following array: ");
        test.printArray();
        test.sort();
        System.out.print("\nThe result is: ");
        test.printArray();
    }
}
