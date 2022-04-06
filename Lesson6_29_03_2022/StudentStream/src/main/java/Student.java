public class Student {
    private String name;
    private String secondName;
    private int[] marks;


    public Student( String name, String secondName, int[] marks) {
        this.name = name;
        this.secondName = secondName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}