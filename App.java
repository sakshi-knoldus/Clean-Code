public class App{
    static class PairofInt {
        private int smallest;
        private int largest;
        public int getSmallest(){
            return smallest;
        }
        public void setSmallest(int value){
            this.smallest = value;
        }
        public int getLargest(){
            return largest;
        }
        public void setLargest(int value){
            this.largest = value;
        }
    }

    static PairofInt SmallestAndLargestNo(int arr[], int length) {
        PairofInt object = new PairofInt();
        int i;

        if (length == 1) {
            object.setLargest(arr[0]);
            object.setSmallest(arr[0]);
            return object;
        }

        if (arr[0] > arr[1]) {
            object.setLargest(arr[0]);
            object.setSmallest(arr[1]);
        } else {
            object.setLargest(arr[1]);
            object.setSmallest(arr[0]);
        }

        for (i = 2; i < length; i++) {
            if (arr[i] > object.getLargest()) {
            object.setLargest(arr[i]);
            } else if (arr[i] < object.getSmallest()) {
            object.setSmallest(arr[i]);
            }
        }

    return object;
    }

    public static void main(String args[]) {
        int distance[] = {1000, 11, 445, 1, 330, 3000};
        int length = 6;
        PairofInt Object = SmallestAndLargestNo(distance, length);
        System.out.printf("\n Smallest Value is %d", Object.getSmallest());
        System.out.printf("\n Largest Value is %d", Object.getLargest());
    }
}