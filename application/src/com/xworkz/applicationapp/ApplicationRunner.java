package com.xworkz.applicationapp;

import com.xworkz.applicationapp.application.Application;
import com.xworkz.applicationapp.whatsapp.WhatsApp;
public class ApplicationRunner {

    public static void main(String[] args) {

        Application app = new Application();
        app.platform();
        app.purpose();
        app.installation();
        app.updates();
        app.developerInfo();

        Application app1 = new WhatsApp();
        app1.platform();
        app1.purpose();
        app1.installation();
        app1.updates();
        app1.developerInfo();

        WhatsApp app2 = new WhatsApp();
        app2.platform();
        app2.purpose();
        app2.installation();
        app2.updates();
        app2.developerInfo();
        app2.encryption();
        app2.groupChats();
    }
}
