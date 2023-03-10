package clients;

import entity.common.Contact;
import entity.response.ContactListResponsePayload;

import java.util.List;
import java.util.Map;

public interface ContactClient {
  public ContactListResponsePayload getAllContacts();
  public Contact getContactById(String id);
  public Contact createContact(Contact contact);
  public void deleteContactId(String id);
  public Contact updateContact(Contact contact);
  public Contact updateLeadScoreById(Contact contact);
  public Contact deleteTagByTags(Contact contact);
  public Contact searchContactByEmailId(String emailId);
  public void addTagsToContact(Map<String,Object> formParams);
  public void deleteTagsByEmail(Map<String,Object> formParams);
  public void addScoreToContactUsingEmail(Map<String,Object> formParams);

}
