package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentView {

  private Integer studentId;
  private String studentUsername;
  private String fullName;
  private Integer age;
  private Integer gender;
  private String email;


}
