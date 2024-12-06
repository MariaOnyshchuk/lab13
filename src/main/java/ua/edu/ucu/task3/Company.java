package ua.edu.ucu.task3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.json.JSONPropertyIgnore;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
    private String name;
    private String description;

}
