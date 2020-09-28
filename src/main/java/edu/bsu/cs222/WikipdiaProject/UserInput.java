package edu.bsu.cs222.WikipdiaProject;

import java.util.*;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Please enter wikipedia page title: ");

        String PageTitle = UserInput.nextLine();
        System.out.println("Searching for: " + PageTitle);
        ApiFetch userRequest = new ApiFetch(PageTitle);
    }
}
