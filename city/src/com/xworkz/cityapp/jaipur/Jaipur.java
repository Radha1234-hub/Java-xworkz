package com.xworkz.cityapp.jaipur;

import com.xworkz.cityapp.city.City;

public class Jaipur extends City {


        @Override
        public void name() {
            System.out.println("Jaipur is known as the 'Pink City' of India due to its pink-colored buildings.");
        }

        @Override
        public void population() {
            System.out.println("Jaipur has a population of over 3 million, making it one of the largest cities in Rajasthan.");
        }

        @Override
        public void landmarks() {
            System.out.println("Jaipur's famous landmarks include the Hawa Mahal, Amber Fort, City Palace, and Jantar Mantar.");
        }

        @Override
        public void culture() {
            System.out.println("Jaipur is rich in Rajasthani culture, known for its traditional music, dance, and handicrafts.");
        }

        @Override
        public void economy() {
            System.out.println("Jaipur's economy is driven by tourism, gemstone industry, and handloom manufacturing.");
        }

        public void festivals() {
            System.out.println("Jaipur hosts vibrant festivals like the Jaipur Literature Festival, Gangaur, and Teej.");
        }

        public void cuisine() {
            System.out.println("Jaipur is famous for its cuisine, including dishes like Dal Baati Churma, Ghewar, and Pyaaz Kachori.");
        }
}
