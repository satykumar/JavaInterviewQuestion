package test.save.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestList {
    public static void main(String[] args) throws IOException {
        String urlString = "http://localhost:8080/JAXRSJsonCRUDExample/rest/countries";
        
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
       
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
       
    }

   /* public List add(List<Integer> a, List<Integer> b){
        
       
 List<Integer> l=       Stream.of(a, b)    // return Stream<List<Integer>>
        .flatMap(list -> list.stream())      // return Stream<Integer>
        .map(n -> n /2)                     // return Stream<Integer>
        .forEach(System.out::println);
        
        return l;

    }*/
}
