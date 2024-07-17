package com.example.seasonalactivities;

public class Main {
    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();

        // Adding activities to seasons
        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

        // Getting all activities
        System.out.println(organizer.getAllActivities()); 

        // Getting activities for specific seasons
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); 
        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER)); 
        System.out.println(organizer.getActivitiesForSeason(Season.WINTER)); 

        // Removing an activity from all seasons
        organizer.removeActivityFromAllSeasons(Activity.HIKING);
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
    }
}
