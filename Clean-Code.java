public class Solutions{
    static class PairofInt {
        int smallest;
        int largest;
    }

    static PairofInt SmallestAndLargestNo(int arr[], int length) {
        PairofInt object = new PairofInt();
        int i;

        if (length == 1) {
            object.largest = arr[0];
            object.smallest= arr[0];
            return object;
        }

        if (arr[0] > arr[1]) {
            object.largest = arr[0];
            object.smallest= arr[1];
        } else {
            object.largest = arr[1];
            object.smallest= arr[0];
        }

        for (i = 2; i < length; i++) {
            if (arr[i] > object.largest) {
            object.largest = arr[i];
            } else if (arr[i] < object.smallest) {
            object.smallest= arr[i];
            }
        }

    return object;
    }

    public static void main(String args[]) {
        int distance[] = {1000, 11, 445, 1, 330, 3000};
        int length = 6;
        PairofInt Object = SmallestAndLargestNo(distance, length);
        System.out.printf("\n Smallest Value is %d", Object.smallest);
        System.out.printf("\n Largest Value is %d", Object.largest);
    }
}