package Model.Clients;

public class Human {
    String client_name;
    int client_age;
    String client_gender;

public Human()
{
    System.out.println("Creating a Human:");
}

public Human(String client_name, int client_age, String client_gender)
{
    this.setclient_name(client_name);
    this.setclient_age(client_age);
    this.setclient_gender(client_gender);
}

public void setclient_name(String client_name) {
    this.client_name = client_name; 
}

public void setclient_age(int client_age) {
    this.client_age= client_age;
} 

public void setclient_gender(String client_gender) {
    this.client_gender = client_gender;
}

public String getclient_name() {
    return client_name;
}

public int getclient_age() {
    return client_age;
}

public String getclient_gender() {
    return client_gender;
}

public void display()
    {
        System.out.println("Client name: "+getclient_name());
        System.out.println("Client age: "+getclient_age());
        System.out.println("Client gender: "+getclient_gender());
    }

}