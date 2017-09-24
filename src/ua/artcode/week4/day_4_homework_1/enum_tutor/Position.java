package ua.artcode.week4.day_4_homework_1.enum_tutor;

public enum Position {

    JUNIOR (1000, 1.5),
    MIDDLE (2000, 2.5),
    SENIOR (3500, 4.2);

    private final int salary;
    private final double experience;

    Position(int salary, double experience) {
        this.salary = salary;
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public double getExperience() {
        return experience;
    }

    public Position promote() {
        switch (this) {
            case JUNIOR:
                System.out.printf("Congratulations, %s! From this moment you are %s.\n", this.name(), MIDDLE.name());
                return MIDDLE;
            case MIDDLE:
                System.out.printf("Congratulations, %s! From this moment you are %s.\n", this.name(), SENIOR.name());
                return SENIOR;
            default:
                System.out.printf("I apologise, %s, but you have the highest post at the moment!\n", this.name());
                return this;
        }
    }

    public Position demote() {
        switch (this) {
            case SENIOR:
                System.out.printf("Sorry, %s, but now you are %s.\n", this.name(), MIDDLE.name());;
                return MIDDLE;
            case MIDDLE:
                System.out.printf("Sorry, %s, but now you are %s.\n", this.name(), JUNIOR.name());
                return JUNIOR;
            default:
                System.out.printf("%s, you are fired!\n", this.name());
                return null;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "name=" + this.name() +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
