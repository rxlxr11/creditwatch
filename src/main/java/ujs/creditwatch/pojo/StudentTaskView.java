package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentTaskView {

  private Integer studentId;
  private Integer taskId;
  private String taskName;
  private Double taskWeight;
  private Integer parentTaskId;
  private Integer taskState;
  private Double taskGrade;
}
