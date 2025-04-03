package com.xworkx.calendarapp.calendar;

import com.xworkx.calendarapp.constants.Days;
import com.xworkx.calendarapp.meetings.Meetings;


public class Calendar {


        public  Days day;

        public Meetings meetings[];

        public void getCalenderInfo() {

            System.out.println("The meeting day is:" + day);

            for (Meetings meeting : meetings)
                meeting.getMeetingInfo();
        }

}