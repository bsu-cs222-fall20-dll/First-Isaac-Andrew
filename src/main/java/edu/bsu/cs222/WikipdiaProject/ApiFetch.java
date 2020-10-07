package edu.bsu.cs222.WikipdiaProject;

import com.google.gson.JsonStreamParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiFetch
{

    public ApiFetch(String pageTitle) throws IOException {
        //combines the input with the Wikipedia API URL to make the request
        String UrlToSearch =("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&list=&titles="+pageTitle+"&redirects=1&rvprop=ids%7Ctimestamp%7Cflags%7Ccomment%7Cuser&rvlimit=20");
        URL UrlToFetch = new URL(UrlToSearch);
        URLConnection WikiAPIFetchRequest = UrlToFetch.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(WikiAPIFetchRequest.getInputStream()));


        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            //Replacing char's with \n to break up output and maje more readable
            String CleanedUpDisplay = ((inputLine.replace('{','\n')).replace('}','\n')).replace(',','\n');

            //the return from wikipedia's API states -1 missing on pages that don't exist, allows to ID nonexitant pages
            if (CleanedUpDisplay.contains("-1") && CleanedUpDisplay.contains("missing"))
            {
                System.out.println("The page you searched for does not exist or could not be found");
            }
            else
            {
                System.out.println(CleanedUpDisplay);
            }
        }


        in.close();

        JsonStreamParser OutputParser = new JsonStreamParser(in);

    }
}
