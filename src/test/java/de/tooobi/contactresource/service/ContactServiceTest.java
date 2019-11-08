package de.tooobi.contactresource.service;

import de.tooobi.contactresource.model.Contact;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

class ContactServiceTest {

    @Test
    public void testFindContactById(){

        Contact resultContact = new ContactService().findContactById(1);

        assertThat(resultContact, notNullValue());
        assertThat(resultContact.getName(), is("TestName"));
        assertThat(resultContact.getSurname(), is("TestSurName"));
        assertThat(resultContact.getDateOfBirth(), is("DayOfBirth"));
    }
}
