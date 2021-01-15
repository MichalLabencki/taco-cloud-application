
package tacos;
import java.util.Date;
import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min=5, message = "Nazwa musi skladac sie z przynajmniej pieciu znakow.")
    private String name;
    @Size(min = 1, message = "Musisz wybrac przynajmniej jeden skladnik.")
    private List<String> ingredients;

}
