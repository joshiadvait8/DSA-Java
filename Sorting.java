public class Sorting {
    

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,6,2};
        int size = arr.length;
        System.out.println("Original Array:");
        for(int n : arr){
            System.out.print(n + " ");
        }
        // bubbleSort(arr,size);
        //selectionSort(arr, size);
        insertionSort(arr, size);

        
    }

    public static void bubbleSort(int[] arr, int size) {
        int temp;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size-i-1; j++){
                //check side by side elements at swap to right if bigger
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            //pass wise output to check if in each pass bigger element is going to end
            System.out.println();
            for(int n : arr){
                System.out.print(n + " ");
            }
        }
    }

    public static void selectionSort(int[] arr, int size){
        //idea is to select the min index rather than swapping everytime swap only once after pass is completed
        int temp;
        int minIndex = -1;
        for(int i=0; i<size-1; i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            //once minIndex element is found just swap it from beginning like first time 0 -> 1 -> 2...
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            //pass wise output to check if in each pass smaller element is going to start
            System.out.println();
            for(int n : arr){
                System.out.print(n + " ");
            }

        }
    }

    public static void insertionSort(int[] arr, int size){
        //idea is to pick a element from 2nd element onwards and just compare with its left element if greater take out this key element and copy left val to right 
        // and compare with more left side element one by one until it find its correct place
        int key;
        int j=1;
        int temp;
        for(int i=1;i<size;i++){
            key=arr[i];
            j=i-1;
            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j]; 
                j = j-1;
            }
            arr[j+1] = key;
            System.out.println();
            for(int n : arr){
                System.out.print(n+ " ");
            }
        }
    }

}

