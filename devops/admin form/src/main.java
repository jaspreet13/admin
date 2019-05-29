public class main {

    public static void main(String[] args) {

        user us = new user();

        System.out.println("Enter your firstName :");
        System.out.println("name is:="+us.getname());
        System.out.println("Enter your LastName  :");
        System.out.println("lastname is:="+us.getLname());
        System.out.println("Enter your phone number:");
        System.out.println("phone number is:="+us.getPhoneNumber());
        System.out.println("Enter your email:");
        System.out.println("email is:="+us.getEmail());
        System.out.println("Enter your Password:");
        System.out.println("password is:="+us.getPass());
        System.out.println("Confirm your Password:");
        System.out.println("confirm password is:"+us.getConf_password());
       // us.getConf_password();
        System.out.println("Enter your date of birth:");
        System.out.println("date of birth:="+us.getdob());
    }
//       System.out.println("Enter your firstName :"+us.getname());
//       System.out.println("Enter your LastName  :"+us.getLname());
//        System.out.println("Enter your Birth date:"+us.getdob());
//        System.out.println("Enter your phone number:"+us.getPhoneNumber());
//        System.out.println("Enter your Password:"+us.getPass());
//        System.out.println("Confirm your Password:"+us.getConf_password());
//        System.out.println("Enter your email:"+us.getEmail());

}

