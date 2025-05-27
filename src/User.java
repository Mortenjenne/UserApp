public class User implements Comparable<User> {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password) {
        setName(name);
        this.password = password;
    }

    public User(String name, String password, String email) {
        setName(name);
        this.password = password;
        setEmail(email);
    }

    public User(String name, String password, String email, int phoneNumber) {
        setName(name);
        this.password = password;
        setEmail(email);
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (isNameValid(name)) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name will be set default to: Unknown" + "\n" + "Requirements: Name must start with a capital letter - min 2 characters and max 12 characters long");
            this.name = "Unknown";
        }

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email!" + "\n" + "Please enter a valid email");
        }

    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private boolean isNameValid(String name) {
        if (name == null) {
            return false;
        }

        String trimmedName = name.trim();

        if (trimmedName.length() < 2 || trimmedName.length() > 12) {
            return false;
        }

        if (!trimmedName.matches("^[A-Z][a-zA-Z]{1,11}$")) {
            return false;
        }
        return true;
    }

    private boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String trimmedEmail = email.trim();

        if (!trimmedEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.name != null) {
            stringBuilder.append("Name: ").append(this.name).append(" | ");
        }

        if (this.password != null) {
            stringBuilder.append("Password: ").append(this.password).append(" | ");
        }

        if (this.email != null) {
            stringBuilder.append("Email: ").append(this.email).append(" | ");
        }

        if (this.phoneNumber != 0) {
            stringBuilder.append("Phone number: ").append(this.phoneNumber).append(" | ");
        }

        if (stringBuilder.length() >= 2) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(User another) {
        return this.name.compareTo(another.name);
    }
}
