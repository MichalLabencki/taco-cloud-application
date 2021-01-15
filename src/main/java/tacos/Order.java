//tag::all[]
//tag::allButValidation[]
package tacos;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.CreditCardNumber;
//import org.hibernate.validator.constraints.CreditCardNumber.message;

import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Long id;
    private Date createdAt;

    //end::allButValidation[]
    @NotBlank(message="Podanie imienia i nazwiska jest obowiazkowe")
    //tag::allButValidation[]
    private String name;
    //end::allButValidation[]

    @NotBlank(message="Podanie ulicy jest obowiazkowe")
    //tag::allButValidation[]
    private String street;
    //end::allButValidation[]

    @NotBlank(message="Podanie miasta jest obowiazkowe")
    //tag::allButValidation[]
    private String city;
    //end::allButValidation[]

    @NotBlank(message="Podanie wojewodztwa jest obowiazkowe")
    //tag::allButValidation[]
    private String state;
    //end::allButValidation[]

    @NotBlank(message="Podanie kodu pocztowego jest obowiazkowe")
    //tag::allButValidation[]
    private String zip;
    //end::allButValidation[]

    @CreditCardNumber(message="To nie jest prawidlowy numer karty kredytowej")
    //tag::allButValidation[]
    private String ccNumber;
    //end::allButValidation[]

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message="Wartosc musi byc w formacie MM/YY")
    //tag::allButValidation[]
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Nie prawidlowy kod CVV")
    private String ccCVV;


    public void setPlacedAt(Date date) {
    }

    public List<Taco> getTacos() {
    }

    public Object getPlacedAt() {
    }
