package edu.bsu.cs222.WikipdiaProject;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
import java.io.*;

public class ApiFetch
{

    public ApiFetch(String pageTitle) throws IOException {
        //combines the input with the Wikipedia API URL to make the request
        String UrlToSearch =("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&list=&titles="+pageTitle+"&rvprop=ids%7Ctimestamp%7Cflags%7Ccomment%7Cuser&rvlimit=10");
        URL UrlToFetch = new URL(UrlToSearch);
        URLConnection WikiAPIFetchRequest = UrlToFetch.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(WikiAPIFetchRequest.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            //Replacing char's with \n to break up output and maje more readable
            System.out.println( ((inputLine.replace('{','\n')).replace('}','\n')).replace(',','\n') );
        in.close();

    }
}
