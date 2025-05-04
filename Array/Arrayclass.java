
import java.util.Arrays;

import java.util.List;

class Arrayclass {
    public static void main(String[] args) {
        int[] a={10,2,3,4,5,60};
        System.out.println("toString() for 1D array: "+Arrays.toString(a));

        int[][] b={{10,20},{20,30}};
        System.out.println("toString() for 2d array: "+Arrays.toString(b));
        System.out.println("deepToString() for 2D array: "+Arrays.deepToString(b));
       
        System.out.println("copyof(arrayname,length) for 1D array: "+Arrays.toString(Arrays.copyOf(a,2)));

        String arr[]={"abc","pqr","xyz","mnq","def"};
        System.out.println("copyofRange(arrayname,length) for 1D array: "+Arrays.toString(Arrays.copyOfRange(arr,2,4)));
        System.out.println("copyofRange(arrayname,length) for 1D array: "+Arrays.toString(Arrays.copyOfRange(a,2,8)));
        System.out.println("copyofRange(arrayname,length) for 1D array: "+Arrays.toString(Arrays.copyOfRange(arr,2,8)));
        
        int c[]=new int[8];
        System.out.println("Array without initilization"+Arrays.toString(c));
        Arrays.fill(c,10);
        System.out.println("Fill(array,value): "+Arrays.toString(c));
        Arrays.fill(c,3,6,1);
        System.out.println("Fill(array,value): "+Arrays.toString(c));
        System.out.println("List(arrayName): "+Arrays.asList(c));

        List<String> i=Arrays.asList(arr);
        System.out.println("List of array :" +i);

        int[] x={1,2,3,4,5,6,7};
        int[] y={1,2,3,4,5,6,7};
        System.out.println("equals(arr1,arr2) :" +Arrays.equals(x,y));
        System.out.println("compare(arra1,arr2) : "+ Arrays.compare(x,y));
        Arrays.sort(x);
        System.out.println("Array after sorting "+Arrays.toString(x));
        Arrays.sort(arr);
        System.out.println("String Array after sorting "+Arrays.toString(arr));
        Arrays.sort(x,2,4);
        System.out.println("Array after sorting "+Arrays.toString(x));
        System.out.println("Binarysearch(array,key) : "+ Arrays.binarySearch(x,3));
        System.out.println("Binarysearch(array,key) : "+ Arrays.binarySearch(x,8));
        System.out.println("Binarysearch(array,key) : "+ Arrays.binarySearch(x,3,6,5));







    }
}