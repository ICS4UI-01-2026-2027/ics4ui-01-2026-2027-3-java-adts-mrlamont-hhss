public class MyStack {
    private int[] numbers;
    private int numItems;
    
    public MyStack(){
        this.numItems = 0;
        this.numbers = new int[5];
    }

    public int size(){
        return this.numItems;
    }

    public boolean isEmpty(){
        return this.numItems == 0;
    }

    public int peek(){
        return this.numbers[this.numItems - 1];
    }

    public int pop(){
        // get the item on the top
        int item = this.peek();
        // set the item to 0 at the end
        this.numbers[this.numItems-1] = 0;
        // pretend it doesn't exist
        this.numItems--;
        // send back item stored from the top
        return item;
    }

    public void push(int item){
        // check if out of room
        if(this.numItems == this.numbers.length){
            // make the array bigger!
            this.doubleArraySize();
        }
        // add item to the end/top
        this.numbers[this.numItems] = item;
        // increase our item count
        this.numItems++;
    }


    private void doubleArraySize(){
        // make a new double sized array
        int[] bigger = new int[this.numbers.length*2];
        // copy items across
        for(int i = 0; i < this.numbers.length; i++){
            bigger[i] = this.numbers[i];
        }
        // set the numbers array to be bigger
        this.numbers = bigger;
    }
}