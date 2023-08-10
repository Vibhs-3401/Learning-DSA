/**
 * @author vibhuti patel on 10/08/23
 * @project SortingAlgorithms
 */

/**
 * <b>Linear Search:</b><br>
 *      &emsp;It is most simple and straightforward searching algo.<br>
 *      &emsp;In this we traverse through the whole given array and compare each element with the searching element.<br>
 *      &emsp;If it matches then we can break the traversal and return the index or true as a boolean value.<br>
 *      &emsp;Otherwise, we are returning '-1' as an index value which is not real or 'false' for boolean value as the worst case scenario.<br>
 * <p>
 * <b>Time Complexity:</b><br>
 *  &emsp;Best Case: O(1) (BigO of 1): when the searching element is at the starting index.<br>
 *  &emsp;Average Case: O(N) (BigO of N): When the searching element is anywhere in the given array.<br>
 *  &emsp;Worst Case: O(N) (BigO on N): When the searching element is at the last index or not present at all in the given array.<br>
 * <p>
 * <b>Space Complexity:</b> O(1) (BigO of 1), as we do not need any auxiliary space for this algo.<br>
 * */
public class LinearSearch {

    public <T> boolean doesElementExist(T[] arr, T element) {
        if(arr.length == 0) {
            return false;
        } else {
            for (T t : arr) {
                if (t == element) {
                    return true;
                }
            }
        }
        return false;
    }

    public <T> int getIndexOfElement(T[] arr, T element) {
        if(arr.length == 0) {
            return -1;
        } else {
            for (int i=0; i< arr.length; i++) {
                if (arr[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }
}
