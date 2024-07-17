package com.example.seasonalactivities;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SeasonalActivityOrganizer {
    private Map<Season, EnumSet<Activity>> activitiesMap;

    public SeasonalActivityOrganizer() {
        activitiesMap = new HashMap<>();
        for (Season season : Season.values()) {
            activitiesMap.put(season, EnumSet.noneOf(Activity.class));
        }
    }

    public Set<Activity> getActivitiesForSeason(Season season) {
        EnumSet<Activity> activities = activitiesMap.get(season);
        if (activities != null) {
            return activities;
        } else {
            throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public Set<Activity> addActivityForSeason(Activity activity, Season season) {
        EnumSet<Activity> activities = activitiesMap.get(season);
        if (activities != null) {
            activities.add(activity);
            return activities;
        } else {
            throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public Set<Activity> removeActivityFromAllSeasons(Activity activity) {
        for (EnumSet<Activity> activities : activitiesMap.values()) {
            activities.remove(activity);
        }
        return getAllActivities();
    }

    public Set<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        for (EnumSet<Activity> activities : activitiesMap.values()) {
            allActivities.addAll(activities);
        }
        return allActivities;
    }
}
