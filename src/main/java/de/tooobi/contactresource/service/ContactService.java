package de.tooobi.contactresource.service;

import de.tooobi.contactresource.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactService {

    public Contact findContactById(int id){
        return Contact.builder()
                .name("TestName")
                .surname("TestSurName")
                .dateOfBirth("DayOfBirth")
                .build();
    }
}
