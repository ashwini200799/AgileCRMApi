package entity.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ContactListResponsePayloadDeserializer;
import entity.common.Contact;
import lombok.ToString;

import java.util.List;


@JsonDeserialize(using = ContactListResponsePayloadDeserializer.class)
public class ContactListResponsePayload {


 public List<Contact> getContacts() {
  return contacts;
 }

 public void setContacts(List<Contact> contacts) {
  this.contacts = contacts;
 }

 private List<Contact> contacts;

}
