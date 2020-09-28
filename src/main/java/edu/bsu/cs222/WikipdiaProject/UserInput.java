package edu.bsu.cs222.WikipdiaProject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

public class UserInput
{
    public static void main(String[] args) throws IOException {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Please enter wikipedia page title: ");

        String PageTitle = (UserInput.nextLine()).replace(" ", "%20");
        System.out.println("Searching for: " + PageTitle);
        ApiFetch userRequest = new ApiFetch(PageTitle);
    }
}
