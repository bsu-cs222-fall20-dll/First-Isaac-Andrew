package edu.bsu.cs222.WikipdiaProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserInput
{
    public static class InputGui extends JFrame
    {
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        JTextField jt = new JTextField(30);
        JButton jb = new JButton("Enter");

        public InputGui()
        {
            setTitle("WikipediaRevisionHistory");
            setVisible(true);
            setSize(400, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            jp.add(jt);


            jt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String input = jt.getText();
                    jl.setText(input);
                }
            });

            jp.add(jb);
            jb.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String STRInput = jt.getText();
                    jl.setText(STRInput);
                    //Intellij forced the Try catch statement and would not allow it without one
                    try {
                        ApiFetch FetchUserInput = new ApiFetch(STRInput.replace(" ", "%20"));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                }
            });

            jp.add(jl);
            add(jp);

        }

    }

    public static void main(String[] args) throws IOException {
        InputGui test1 = new InputGui();

    }
}
