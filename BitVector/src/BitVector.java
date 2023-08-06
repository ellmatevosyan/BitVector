public class BitVector {
    private int[] bits;

    //size = 35
    //(size + 31) = 35 + 31 = 66
    //(size + 31)/32 = 66/32=2
    BitVector(int size){
        if(size<=0){
            throw new IllegalArgumentException("Size must be greater than 0.");
        }
        int arraySize = (size + 31) /32; //32 bits per int
        bits = new int [arraySize];
    }

    public void set(int index){
        if(index < 0 || index >=bits.length * 32){ //bits.length = 2
            throw new IllegalArgumentException("Index out of range.");
        }
        int arrayIndex = index /32;
        int bitIndex = index % 32;
        bits[arrayIndex] |= (1<<bitIndex);
    }

    public void reset(int index){
        if(index < 0 || index >= bits.length * 32){
            throw new IllegalArgumentException("Index out of range.");
        }
        int arrayIndex = index / 32;
        int bitIndex = index % 32;
        bits[arrayIndex] &= ~(1<< bitIndex);
    }

    public boolean get(int index){
        if(index < 0 || index >= bits.length * 32){
            throw new IllegalArgumentException("Index out of range.");
        }
        int arrayIndex = index / 32;
        int bitIndex = index % 32;
        return (bits[arrayIndex] & (1 << bitIndex)) != 0;
    }

    public int size(){
        return bits.length * 32;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < size();i++){
            sb.append(get(i) ? "1" : "0");
        }
        return sb.toString();
    }
}
