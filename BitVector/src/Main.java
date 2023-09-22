import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BitVector bitVector = new BitVector(32);

        bitVector.set(2);
        bitVector.set(5);
        bitVector.set(7);
        //bitVector.reset(5);
        //String result = bitVector.toString();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(bitVector.toString());
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        // testing git

    }
}