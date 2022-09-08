package com.mkk.ugd.event_delegation.program;

import com.mkk.ugd.utility.Util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Util.showInfoMessage("Constant Operation");
    }
}
