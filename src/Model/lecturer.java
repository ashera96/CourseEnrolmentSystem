/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ashera
 */
public class lecturer {
    private String lecturer_id;
    private String name;
    private String address;
    private String gender;
    private String email;
    private String nic;
    private String contact_number;
    private int room_number;
    
    public lecturer(){
    }
    
    public lecturer(String lecturer_id, String name, String address, String gender, String email, String nic, String contact_number, int room_number) {
        this.lecturer_id = lecturer_id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.nic = nic;
        this.contact_number = contact_number;
        this.room_number = room_number;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
    
}
