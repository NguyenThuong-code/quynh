import java.util.Calendar;
import java.util.Date;

public class Student {
    private String id;
    private String email;
    private String name;
    private String address;
    private String dob;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("+ Student:\n- Name: %s\n- ID: %s\n- DoB: %s\n- Address: %s\n- Email: %s\n", name, id, dob, address, email);
    }

    private String idGenerator(int seed) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int idSuffix = calendar.get(Calendar.YEAR) + seed;
        return "S" + idSuffix;
    }

    public Student(String name, String dob, String address, String email, int seed) {
        this.id = idGenerator(seed);
        this.email = email;
        this.address = address;
        this.name = name;
        this.dob = dob;
    }

}
