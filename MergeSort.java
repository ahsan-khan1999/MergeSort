public class MergeSort {
    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(array, left, right, mid, n - mid);
//        return a;
    }
    public static void merge(
            int[] a, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] < rightArray[j]) {
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            a[k++] = leftArray[i++];
        }
        while (j < right) {
            a[k++] = rightArray[j++];
        }
    }
//    public static void m(int[] array , int l){
//        if (l<2){
//        return;
//        }
//        else {
//            int mid=l / 2;
//            int[] le=new int[mid];
//            int[] ri=new int[l - mid];
//
//            for (int i=0; i < mid; i++) {
//                le[i]=array[i];
//            }
//            for (int i=mid; i < l; i++) {
//                ri[i - mid]=array[i];
//            }
//            m(le, mid);
//            m(ri, l - mid);
//
//            me(array, le, ri, mid, l - mid);
//        }
//    }
//    public static void me(int[] array , int[] l ,int[] r ,int left ,int right ){
//
//        int i=0,j=0,k=0;
//        while (i<left && j<right){
//            if (l[i] < r[j]){
//                array[k++] =l[i++];
//            }
//            else {
//                array[k++] = r[j++];
//            }
//        }
//        while (i<left){
//            array[k++] = l[i++];
//        }
//        while (j < right){
//            array[k++] = r[j++];
//        }
//    }

    public static void main(String[] args) {
        int[] arra = new int[10];
        arra[0] = 221;
        arra[1] = 21;
        arra[2] = 2;
        arra[3] = 12;
        arra[4] = 78;
        arra[5] = 65;
        arra[6] = 324;
        arra[7] = 10;
        arra[8] = 1;
        arra[9] = 81;
        mergeSort(arra,10);
//        merge();

        for (int i=0; i <arra.length ; i++) {
            System.out.println(arra[i]);
        }

    }
}
