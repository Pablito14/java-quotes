//import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            System.out.println(content);
            in.close();
        }catch(IOException e){

        }
//        // use FileReadAndWrite class to get a file reader in JSON format
//        BufferedReader successfulRead = FileReadAndWrite.fileToReaderObject();
//        // use Gson to read the data and turn it into a book class
//        Gson gson = new Gson();
//        Quote[] books = gson.fromJson(successfulRead, Quote[].class);
//        // find a book randomly within our array and return quote and author
//        String newQuoteAndAuthor = Randomizer.generateQuoteAndAuthor(books);
//        // print
//        System.out.println(newQuoteAndAuthor);
    }
}














