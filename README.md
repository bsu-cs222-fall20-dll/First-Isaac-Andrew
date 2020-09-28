# First-Isaac-Andrew

First Project
- Andrew Maupin
- Isaac Carcare


Build Instructions:
- Use Gradle kotlin 6.3
- jdk 14
- Junit 4.12
- Gson 2.8.6


Update History:
- Added user input
- Imported Scanner
- Created API Fetcher class
- Imported 
    -import com.google.gson.JsonElement;
    -import com.google.gson.JsonObject;
    -import com.google.gson.JsonParser;
    -import java.io.InputStream;
    -import java.io.InputStreamReader;
    -import java.io.Reader;
    -import java.net.;
    -import java.io.;
- We got the idea to take the URL for wikipedias API request https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&list=&titles=fish&rvprop=ids%7Ctimestamp%7Cflags%7Ccomment%7Cuser&rvlimit=10 to insert the input into the link and pass it to the API fetcher
- We use the URLConnection class from java.net to connect to the wikipedias api to make the request
- We added replace character to make the console output more readable(replacing "{","}", and ",")
- We added testing for a variety of different things
- Fixed the userinput to allow multiple words in the title without error(program use to fail if the user added any spaces to the input, it now handles them)
