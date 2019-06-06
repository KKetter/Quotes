package Quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GSONQuoteGrabber {

    public static String quoteGetter(String filePath) {
        Quote randomQuote;
        try {
            Gson gson = new Gson();
            File file = new File(filePath);
            FileReader reader = new FileReader(file);

            Quote[] quotes = gson. fromJson(reader, Quote[].class);


            int randomIndex = (int)Math.floor(quotes.length * (Math.random()));
            randomQuote = quotes[randomIndex];
            return String.valueOf(randomQuote);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return "File Not Found";
    }

}
