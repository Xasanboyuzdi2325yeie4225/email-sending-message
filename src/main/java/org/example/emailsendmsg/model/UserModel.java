package org.example.emailsendmsg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String to;
//    private String from;
    private String subject;
    private String text;
}
