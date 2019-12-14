package carrace;

import javax.swing.*;

class GetPlayersName {

    JTextField Player1_Field;
    JTextField Player2_Field;
    String Player1_Name;
    String Player2_Name;
    JPanel myPanel;
    boolean close;
    int result;

    public GetPlayersName() {

        Player1_Field = new JTextField(20);
        Player2_Field = new JTextField(20);

        myPanel = new JPanel();

        myPanel.add(new JLabel("1st Player:"));
        myPanel.add(Player1_Field);

        myPanel.add(Box.createHorizontalStrut(15)); // a Horizontal spacer
        myPanel.add(Box.createVerticalStrut(20)); // a Vertical spacer

        myPanel.add(new JLabel("2nd Player:"));
        myPanel.add(Player2_Field);

        while (true)
        {
            result = JOptionPane.showConfirmDialog(null, myPanel,
                    "Please Enter 1st and 2nd Player name", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
            {
                Player1_Name = Player1_Field.getText().toString();
                Player2_Name = Player2_Field.getText().toString();
                if (Player1_Name.isEmpty() || Player2_Name.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter The Names");
                }
                else if (!Player1_Name.isEmpty() && !Player2_Name.isEmpty())
                {
                    VS_Page vs_page = new VS_Page();
                    vs_page.Player1_TextPane.setText(Player1_Name);
                    vs_page.Player2_TextPane.setText(Player2_Name);
                    vs_page.setVisible(true);
                    close = true;
                    //System.out.println("Get Names Done..");
                    break;
                }
            }
            else if (result == JOptionPane.CANCEL_OPTION)
            {
                close = false;
                break;
            }
        }
    }
}