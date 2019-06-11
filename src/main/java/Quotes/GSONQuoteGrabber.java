package Quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class GSONQuoteGrabber {

    public static String quoteGetter(String filePath) {
        Quote randomQuote;
        //GET to https://ron-swanson-quotes.herokuapp.com/v2/quotes
        try {
            //Read from GSON file
//            Gson gson = new Gson();
//            File file = new File(filePath);
//            FileReader reader = new FileReader(file);
//
//            Quote[] quotes = gson. fromJson(reader, Quote[].class);
//
//
//            int randomIndex = (int)Math.floor(quotes.length * (Math.random()));
//            randomQuote = quotes[randomIndex];
//            return String.valueOf(randomQuote);
            //starting API attempt
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            //what is this?
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            //goes to the internet
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
            //get an array with one quote back ["Ron Swanson Gem"]
            //turn it back into GSON
            Gson gson = new Gson();
            Quote[] quotes = gson.fromJson(reader, Quote[].class);


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return "File Not Found";
    }

}
