package app.web.pavelk.rest3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("client.users")
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private Instant created;
    private boolean enabled;
}
