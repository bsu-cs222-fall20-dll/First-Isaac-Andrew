# First-Isaac-Andrew

First Project
- Andrew Maupin
- Isaac Carcare


Build Instructions:
- Use Gradle kotlin 6.3
- jdk 14
- Junit 4.12
- Gson 2.8.6
- JavaFx 13.0.2
- import javax.swing.*;
-import java.io.BufferedReader;
-import java.io.IOException;
-import java.io.InputStreamReader;
-import java.net.URL;
-import java.net.URLConnection;
-import javax.swing.*;
-import java.awt.event.ActionEvent;
-import java.awt.event.ActionListener;
-import java.io.IOException;


Update History:
- Added user input
- Imported Java.Util.Scanner class to use for the input method
- Created "APIFetcher" class
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
- Fixed the api request link to allow for redirects
- added ability to handle missing/nonexistant pages
-Java FX wouldnt work so we used JFrame to create the java
- made a Jframe to enter in the search
- attempted to go back and rework to use JavaFX, quickly ran into a wall
- tried some other solutions to try and get the output to be part of the GUI instead of just coming out of the console
- got JavaFx working and was able then to create a window with the GUI
- Input using JavaFX is not working
- able to make output dispaly generic static text
- got the display able to display the results from the API search
- made the text smaller in an attempt to get it all to fit
- was able to implement JavaFX's scroll pannel method to fix display issues
- streamlined alot of the code, removing unused and/or unessecary sections


Problems and Issues:
- When pressing commit in intellij, we didn't realize it was not actually committing and we had to find a work around by uploading the file through gihtub(RESOLVED)
- Intelij says javaFX is no longer supported, tried various methods to try and inport it and to get it to work but none did for us, had to use Jframe as a workaround so that we still would have a gui.(resolved)
- Jpanel will not create a second window to display the outputs(Resolved,no longer using Jpannel)
- On attempt to run, it will display "JavaFX runtime components are missing, and are required to run this application"(resolved)


Suppressed Warning and error:
- Intelij forces at several points for me to have a try catch statement, and then gives a warning that thses try cathes will never be used
- Gradle wil' warn that I am using "Deprecated Gradle features", making it incompatible with Gradle 7.0, irrelevant since this program uses gradle 6.3
