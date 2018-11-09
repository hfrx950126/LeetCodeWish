public class MergeSort {
    public void mergesort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,r,mid);
    }
    public void merge(int arr[],int l,int r,int mid){
        int aux[] = new int[r-l+1];

        for(int i =0;i<=r;i++){
            aux[i-l] = arr[i];
        }
        int i = l;
        int j = mid+1;
        for(int k=l;k<=r;k++){
            if(i>mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j>r){
                arr[k] = aux[i-l];
                i++;
            }
            if(aux[i-l]<aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
}
