public class Person {
    private String name;
    private int sex;
    private String birthDay;

    private String address;

    public Person(String name, int sex, String birthDay, String address) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
