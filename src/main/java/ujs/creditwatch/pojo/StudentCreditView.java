package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentCreditView {

  private Integer studentId;
  private String studentUsername;
  private Integer courseId;
  private String courseName;
  private Integer taskId;
  private String taskName;
  private Double taskWeight;
  private Integer taskState;
  private Double taskGrade;
  private Double courseCredit;
}
