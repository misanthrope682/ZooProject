import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String address;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){

        return this.name;
    }

//    private ArrayList<Aviary> Aviaries;
    private ArrayList<String > Employees;


    public void AddEmployees(String employeeName){
        Employees.add(employeeName);
    }

    public Zoo(String address,String name){
        this.address = address;
        this.name = name;

    }


}
