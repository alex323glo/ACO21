package ua.artcode.week1.day2_homework1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Subject {

    // Fields, properties:
    public static final int ATTENDANCE_MARK_PART = 60;
    public static final int EXAM_MARK_PART = 40;

    private String name = "none";
    private int semesterHours = 1;
    private int workHours;

    private int examMark;
    private int attendanceMark;

    // Constructors:
    public Subject() {

    }

    public Subject(String name, int semesterHours, int workHours) {
        setName(name);
        setSemesterHours(semesterHours);
        setWorkHours(workHours);
    }

    // Setters, getters:
    public boolean setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean setSemesterHours(int semesterHours) {
        if (semesterHours > 0 && workHours <= semesterHours) {
            this.semesterHours = semesterHours;
            attendanceMark = makeAttendanceMark();
            return true;
        }
        return false;
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public boolean setWorkHours(int workHours) {
        if (workHours > -1 && workHours <= semesterHours) {
            this.workHours = workHours;
            attendanceMark = makeAttendanceMark();
            return true;
        }
        return false;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getExamMark() {
        return examMark;
    }

    public int getAttendanceMark() {
        return attendanceMark;
    }

    // Another methods:
    public int exam() {
        examMark = makeExamMark();
        return examMark;
    }

    public int getMark() {
        return examMark + attendanceMark;
    }

    private int makeExamMark() {
        return (int) (Math.random() * EXAM_MARK_PART);
    }

    private int makeAttendanceMark() {
        return (int) (((double) ATTENDANCE_MARK_PART) * (((double) workHours) / ((double) semesterHours)));
    }
}
