package de.tooobi.contactresource.controller;


import de.tooobi.contactresource.model.Contact;
import de.tooobi.contactresource.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contact")
public class ContactResource {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Contact getContact(@PathVariable int id) {
        return contactService.findContactById(id);
    }
}
