package test.save.com;

import java.nio.ByteBuffer;
import java.util.UUID;

public class MainClass {
    public static final int BYTE_ARRAY_SIZE = 16;
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
       // System.out.println(uuid);
       
      System.out.println(getBytesFromUuid(uuid)); 
      
     // a7bdd352-53e7-4f22-abdc-62a1a15af0a4
     // [B@29453f44
        
        
    }
    public static byte[] getBytesFromUuid(final UUID uuid) {
        final ByteBuffer bb = ByteBuffer.wrap(new byte[BYTE_ARRAY_SIZE]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return bb.array();
    }
}
