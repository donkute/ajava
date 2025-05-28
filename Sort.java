interface Sortable { 
    void sort(int[] arr); 
} 
 
class BubbleSort implements Sortable { 
    public void sort(int[] arr) { 
        int n = arr.length; 
         
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
        } 
    } 
} 
 
class SelectionSort implements Sortable { 
    public void sort(int[] arr) { 
        int n = arr.length; 
         
        for (int i = 0; i < n - 1; i++) { 
            int minIndex = i; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j; 
                } 
            } 
            int temp = arr[i]; 
            arr[i] = arr[minIndex]; 
            arr[minIndex] = temp; 
        } 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        int[] arr = { 
            8, 
            3, 
            6, 
            7, 
            0, 
            1, 
            9 
        }; 
 
        Sortable bubbleSort = new BubbleSort(); 
        bubbleSort.sort(arr); 
        System.out.print("Bubble Sort: "); 
        printArray(arr); 
 
        Sortable selectionSort = new SelectionSort(); 
        selectionSort.sort(arr); 
        System.out.print("Selection Sort: "); 
        printArray(arr); 
    } 
 
    private static void printArray(int[] arr) { 
        for (int num : arr) { 
            System.out.print(num + " "); 
        } 
        System.out.println(); 
    } 
}
