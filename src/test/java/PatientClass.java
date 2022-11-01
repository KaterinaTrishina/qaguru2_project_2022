public class PatientClass {
    //----------ATTRIBUTES----------//
    private String name;
    private int age;
    private double weight;
    private double height;
    private boolean positiveCovidTest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isPositiveCovidTest() {
        return positiveCovidTest;
    }

    public void setPositiveCovidTest(boolean positiveCovidTest) {
        this.positiveCovidTest = positiveCovidTest;
    }
}
