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
public class student {
    private String student_id;
    private String name;
    private String address;
    private String nic;
    private String contact_number;
    private String gender;
    private String email;
    private String faculty_id;
    private String intake_month;
    
    public student() {  
    }
    
    public student(String id,String name,String address,String nic,String contact_number,String gender,String email,String faculty_id,String intake_month){
        this.student_id = id;
        this.name = name;
        this.address = address;
        this.nic = nic;
        this.contact_number = contact_number;
        this.gender = gender;
        this.email = email;
        this.faculty_id = faculty_id;
        this.intake_month = intake_month;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
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

    public String getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getIntake_month() {
        return intake_month;
    }

    public void setIntake_month(String intake_month) {
        this.intake_month = intake_month;
    }
     
}

