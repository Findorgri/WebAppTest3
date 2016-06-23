package pl.edu.agh.wat.domain.model;

/**
 * Our product implementation, product for a ecommerce website
 */
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /*@Version
    private Integer version;*/

    @Size(min=5, max= 100, message = "{error.product.type.size}" )
    private String username;
    @Size(min=5, max= 100, message = "{error.product.type.size}")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }*/
}
