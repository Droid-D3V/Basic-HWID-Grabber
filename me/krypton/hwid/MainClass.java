package me.krypton.hwid;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/*
Copyright Krypton
https://github.com/kkrypt0nn
*/

public class MainClass {
    public static void main(String[] args) {
        String theHWID = HWID.getHWID();
        StringSelection stringSelection = new StringSelection(theHWID);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        UIManager.put("OptionPane.minimumSize",new Dimension(500,80));
        JOptionPane.showMessageDialog(null, "Your HWID has been copied to the Clipboard." + System.lineSeparator() + "Your HWID: " + theHWID,"DroidW4RE-HWID-Grabber", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
