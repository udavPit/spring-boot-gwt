package com.gwidgets.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class AppEntryPoint implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(new Label("Welcome to Gwt with Spring demo"));
    }
}
