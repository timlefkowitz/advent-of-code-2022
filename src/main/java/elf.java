import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class elf<T> {

//    private final T data;
    private final T totalCalories;
    private boolean visited;
    @ToString.Exclude
    private List<elf<T>> food = new ArrayList<>();

}
