package lviv.lpnu.iot.test;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student {
    private String name;
    private String surname;
    public boolean passExam(){
        return false;
    }
}
