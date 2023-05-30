import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private int id;
    private String name;
    private double weight;
    private String color;

    public int getId()
    {
        return id;
    }
    
}
