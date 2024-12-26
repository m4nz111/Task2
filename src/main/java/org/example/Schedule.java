package org.example;

import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private Map<String, Map<String, Course>> schedule;

    public Schedule() {
        this.schedule = new HashMap<>();
    }

    public Map<String, Map<String, Course>> getSchedule() {
        return schedule;
    }



    public void addCourseToSchedule(Course course, String day, String time) {
        if (isTimeSlotAvailable(day, time)) {
            schedule.computeIfAbsent(day, k -> new HashMap<>()).put(time, course);
            System.out.println("Курс " + course.getName() + " добавлен в расписание на " + day + " в " + time);
        } else {
            System.out.println("Время " + time + " в день " + day + " уже занято.");
        }
    }

    public boolean isTimeSlotAvailable(String day, String time) {
        return !schedule.containsKey(day) || !schedule.get(day).containsKey(time);
    }

    public Course findCourseByName(String name) {
        for (Map<String, Course> daySchedule : schedule.values()) {
            for (Course course : daySchedule.values()) {
                if (course.getName().equals(name)) {
                    return course;
                }
            }
        }
        return null;
    }

    public void printSchedule() {
        System.out.println("Расписание:");
        for (String day : schedule.keySet()) {
            System.out.println("День: " + day);
            Map<String, Course> daySchedule = schedule.get(day);
            for (String time : daySchedule.keySet()) {
                System.out.println("Время: " + time + ", Курс: " + daySchedule.get(time).getName());
            }
        }
    }
}