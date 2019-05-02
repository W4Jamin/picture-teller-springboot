package cs8524.project.pictureteller.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"user"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private UserClass userClass;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Image> images = new HashSet<>();
}
