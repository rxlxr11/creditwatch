package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserDetail {

  private Integer userId;
  private String name;
  private Integer age;
  private Integer gender;
  private String email;
}
