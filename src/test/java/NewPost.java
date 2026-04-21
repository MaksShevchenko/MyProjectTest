import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Post {
    String personName;
    String password;
    int age;


    public Post(String personName, String password, int age) {
        this.personName = personName;
        this.password = password;
        this.age = age;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
