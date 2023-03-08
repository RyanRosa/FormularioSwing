package entities;

public class User {
    private String name;
    private String lastName;
    private String department;
    private String function;
    private String login;
    private String password;

    public User(String name, String lastName, String department, String function, String login, String password){
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.function = function;
        this.login = login;
        this.password = password;
    }
    public String getAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+this.name);
        sb.append("\nLast Name: " + this.lastName);
        sb.append("\nDepartment: " + this.department);
        sb.append("\nFunction: " + this.function);
        return sb.toString();
    }
}
