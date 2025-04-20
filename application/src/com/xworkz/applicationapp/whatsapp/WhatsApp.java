package com.xworkz.applicationapp.whatsapp;

import com.xworkz.applicationapp.application.Application;

public class WhatsApp extends Application {
    @Override
    public void platform() {
        System.out.println("WhatsApp operates on mobile platforms like Android and iOS, and also has a web version.");
    }

    @Override
    public void purpose() {
        System.out.println("WhatsApp is primarily used for instant messaging, voice and video calls, and sharing multimedia.");
    }

    @Override
    public void installation() {
        System.out.println("WhatsApp can be installed from the Google Play Store or Apple App Store.");
    }

    @Override
    public void updates() {
        System.out.println("WhatsApp frequently rolls out updates for new features, security, and improved performance.");
    }

    @Override
    public void developerInfo() {
        System.out.println("WhatsApp was initially developed by WhatsApp Inc. and is now owned by Meta Platforms.");
    }

    public void encryption() {
        System.out.println("WhatsApp uses end-to-end encryption to ensure secure communication.");
    }

    public void groupChats() {
        System.out.println("WhatsApp allows users to create group chats to communicate with multiple people at once.");
    }
}
