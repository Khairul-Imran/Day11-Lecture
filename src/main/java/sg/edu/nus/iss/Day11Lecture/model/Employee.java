package sg.edu.nus.iss.Day11Lecture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  // All attributes should be private
  private String firstName;
  private String lastName;
  private String email;

  // Since we have Lombok, we don't need to write the constructor, getters and setters.


  // public String getFirstName() {
  //   return firstName;
  // }
  // public void setFirstName(String firstName) {
  //   this.firstName = firstName;
  // }
  // public String getLastName() {
  //   return lastName;
  // }
  // public void setLastName(String lastName) {
  //   this.lastName = lastName;
  // }
  // public String getEmail() {
  //   return email;
  // }
  // public void setEmail(String email) {
  //   this.email = email;
  // }

  
  
}
