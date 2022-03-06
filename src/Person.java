public class Person {
    String firstName;
    String lastName;
    String address;
    int age;

    public String getFullName(String firstName,String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        String fullName= firstName + lastName;
        return fullName;
    }
    public Person() {
        firstName="Navdeep";
        lastName="Kaur";
        address="Brampton";
        address="Edmonton";
        age=28;
    }
    public void changeAddress(String address) {
        this.address=address;
    }
    public String getAddress(){
        return address;
    }


    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.getFullName("Nav", "deep"));
        System.out.println("Old Address is "+p.getAddress());
        p.changeAddress("Toronto");
        System.out.println("New Address is "+p.getAddress());
    }
}
