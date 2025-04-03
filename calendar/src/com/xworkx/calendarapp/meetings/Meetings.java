package com.xworkx.calendarapp.meetings;

import com.xworkx.calendarapp.invitee.Invitee;

public class Meetings {

    public String title;

    public String startTime;

    public String endTime;

    public Invitee invitees[];

    public void getMeetingInfo(){
        System.out.println("The title of the meeting is "+title);
        System.out.println("The start time of the meeting is :"+startTime);
        System.out.println("The end time of the meeting is:"+endTime);
        System.out.println("Invitees : ");
        for(Invitee invitee : invitees)
        {
            System.out.println("Invitee Id :"+invitee.getInviteeId());
            System.out.println("Invitee Name : "+invitee.getName());
            System.out.println("Invitee email : "+invitee.getEmail());
            System.out.println("Invitee Phone Number : "+invitee.getPhoneNumber());


        }


    }
}
