package Student;

import java.util.Date;

/**
 * @author yw
 * @date 2019/5/9 17:04
 */
public class Student {
    private String naem;
    private int age;
    private Date Brithday;

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBrithday() {
        return Brithday;
    }

    public void setBrithday(Date brithday) {
        Brithday = brithday;
    }
}
