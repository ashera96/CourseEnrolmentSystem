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
public class instructor {
    private String instructor_id;
    private String name;
    private String address;
    private String gender;
    private String email;
    private String nic;
    private String contact_number;
    
    public instructor() {
    }
    
    public instructor(String instructor_id, String name, String address, String gender, String email, String nic, String contact_number) {
        this.instructor_id = instructor_id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.nic = nic;
        this.contact_number = contact_number;
    }

    public String getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(String instructor_id) {
        this.instructor_id = instructor_id;
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
    
}
