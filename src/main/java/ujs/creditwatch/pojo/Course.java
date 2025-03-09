package ujs.creditwatch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Course {

  private Integer id;
  private Integer teacherId;
  private String name;
  private Date startDate;
  private Date endDate;

  List<Task> tasks;
}
