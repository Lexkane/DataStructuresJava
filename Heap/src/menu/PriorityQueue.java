package menu;

public class PriorityQueue {

    int []heap;
    int  size = 0;

    public PriorityQueue(int maxSize){
        heap= new int[maxSize];
    }


    public void push(int value ){
        if (size==heap.length)throw new IllegalStateException();
        int position = size;
        heap[position]=value;
        while (position>0){
            int parent= (position+1)/2-1;
            if (heap[parent]>=heap[position]) break;
            swapIndices(parent,position);
        }
        size++;
    }

    public int pop(){
        if (size==0)throw new IllegalStateException();
        int toReturn=heap[0];
        heap[0]=heap[size-1];
        int position=0;
        while(position <size/2){
            int leftChild=position*2+1;
            int rightChild=leftChild+1;
            if (rightChild<size && heap[leftChild]<heap[rightChild]){
                if(heap[position]>= heap[rightChild]) break;
                swapIndices(position,rightChild);
                position=rightChild;
            } else{
                if (heap[position]>=heap[leftChild])break;
                swapIndices(position,leftChild);
                position=leftChild;
            }
        }
        size--;
        return  toReturn;
    }
    private void swapIndices(int i,int j){
        int temp=heap[i];
        heap[i] =heap[j];
        heap[j]=temp;
    }



    public static void main(String[] args) {



    }
}
