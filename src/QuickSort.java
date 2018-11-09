public class QuickSort {
    public void quickSort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int p = par(arr,l,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);

    }
    private int par(int arr[],int l,int r){
        int v = arr[l];
        int j = l;
        for(int i=0;i<=r;i++){
            if(arr[i]<v){
                int temp= arr[i];
                arr[i] = arr[j+1];
                arr[j+1] =  arr[i];
                j++;
            }
        }
        int temp= v;
        arr[l] = arr[j];
        arr[j] =  v;
        return j;

    }
}
