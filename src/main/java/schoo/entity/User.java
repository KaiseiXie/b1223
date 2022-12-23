package schoo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user_list")
public class User {
@Id
@Column(name = "id")
private Integer id;

@Column(name="name")
private String name;

@Column(name = "age")
private Integer age;
}
