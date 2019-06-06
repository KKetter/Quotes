package Quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GSONQuoteGrabber {

    public static String quoteGetter() {
        Quote randomQuote;
        try {
            Gson gson = new Gson();
            String filepath = "/Users/ttb/codefellows/401/Quotes/assets/recentquotes.json";
            File file = new File(filepath);
            FileReader reader = new FileReader(file);

            Quote[] quotes = gson. fromJson(reader, Quote[].class);


            int randomIndex = (int)Math.floor(quotes.length * (Math.random()));
            randomQuote = quotes[randomIndex];
            return String.valueOf(randomQuote);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return "Grabbed";
    }

    public static void main(String[] args) {
        String hello = quoteGetter();
        System.out.println(hello);
    }

}
