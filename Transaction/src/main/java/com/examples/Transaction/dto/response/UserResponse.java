package com.examples.Transaction.dto.response;


import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    @Size(min = 8, max = 12, message = "duc")
    private String username;
    @Size(min = 8, max = 12)
    private String firstName;
    private String lastName;
    private LocalDate dob;
    Set<String> roles;
}
