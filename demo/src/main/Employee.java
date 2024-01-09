import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakata.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table ( name = "employees")
@getter
@Setter
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @column(name = "id")
    private int id;
    @column(name = "first_name")
    private string firstName;
    @column(name = "last_name")
    private string lastName;
    @column(name = "email")
    private string email;
}