import java.util.Date;
import java.util.Scanner;

public class user {

    private String firstname;
    private  String  lastname;
    private String phoneNumber;
    private String email;
    private String password;
    private  String confirm_password;
    private int birthDate;

    Scanner sc=new Scanner (System.in);

    public String getname() {
        firstname=sc.nextLine();
        return firstname;
    }

    public void firstname(String name) {

       // *if (name == "20"||name == "40") {
            this.firstname = name;
            //System.out.println("enter name");//
    }
    public String getLname() {
        lastname=sc.nextLine();
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber()
    {
        phoneNumber=sc.next();
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        email=sc.next();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass(){
    password=sc.next();
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConf_password() {
        confirm_password=sc.next();
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public int getdob() {
        birthDate=sc.nextInt();
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
