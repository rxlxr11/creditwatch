package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Task {

  private Integer id;
  private String name;
  private Double weight;
  private Integer courseId;
  private Integer parentTask;
  private Integer weightMode;

  private List<Task> childTasks;
}
