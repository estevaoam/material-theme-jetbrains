package com.chrisrm.idea.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;


public class MTDarkerTheme extends AnAction {

    String name = "Darker";

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        JOptionPane.showMessageDialog(null, "Keep in mind, the darker theme is a work in progress and there will be some issues.", "Work in progress", JOptionPane.INFORMATION_MESSAGE);
        new MTSwitchTheme().setTheme(this.name);
    }
}
