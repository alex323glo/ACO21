package ua.artcode.week1.day2_homework.part1.utils;

import ua.artcode.week1.day2_homework.part1.model.Subject;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class SubjectUtils {

    public static final String[] POSSIBLE_SUBJECT_NAMES = {"Math", "Geography",
            "Physics", "Culture", "History", "Programming", "English"};

    public static final int DEFAULT_MAXIMUM_SEMESTER_HOURS_NUM = 200;

    // Util methods:
    public static Subject generateSubject() {
        Subject subject = new Subject();
        subject.setName(generateName());
        subject.setSemesterHours(generateSemesterHours());
        subject.setWorkHours(generateWorkHours(subject.getSemesterHours()));
        return subject;
    }

    // Private methods:
    private static String generateName() {
        return POSSIBLE_SUBJECT_NAMES[(int) (Math.random() * POSSIBLE_SUBJECT_NAMES.length)];
    }

    private static int generateSemesterHours() {
        return (int) (Math.random() * (DEFAULT_MAXIMUM_SEMESTER_HOURS_NUM - 1) + 1);
    }

    private static int generateWorkHours(int semesterHours) {
        return (int) (Math.random() * semesterHours);
    }
}
