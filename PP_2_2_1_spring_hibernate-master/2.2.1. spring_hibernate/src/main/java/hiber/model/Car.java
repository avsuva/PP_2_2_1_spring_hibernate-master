package hiber.model;
import javax.persistence.*;
@Entity
@Table (name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "Model")
    private String model;
    @Column(name = "Series")
    private int series;

    public Car() {}
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car:" +
                "1. model ='" + model + '\'' +
                "2. series =" + series;
    }

}
