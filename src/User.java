public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phoneNumber){
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(this.name).append(" | ");
        stringBuilder.append("Password: ").append(this.password).append(" | ");

        if(this.email != null){
            stringBuilder.append("Email: ").append(this.email).append(" | ");
        }

        if(this.phoneNumber != 0){
            stringBuilder.append("Phone number: ").append(this.phoneNumber).append(" | ");
        }

        if (stringBuilder.length() >= 2) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        return stringBuilder.toString();
    }
}
