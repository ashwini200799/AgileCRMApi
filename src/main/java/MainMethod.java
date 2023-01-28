import clients.ContactClient;
import clients.ContactClientImpl;
import entity.common.Contact;
import entity.response.ContactListResponsePayload;

import java.util.List;

public class MainMethod {

  public static void main(String[] args) throws InterruptedException {

    /*Map<String,String> headers=new HashMap<>();
    headers.put("Accept","application/json");

    Command command= new Command.CommandBuilder(Contact.class,true)
            .withBasePath(BaseClient.contactProp.getProperty("GetContacts"))
            .withHeaders(headers)
            .withMethod(HttpMethod.GET)
            .build();





    List<Contact> contactResponsePayload= (List<Contact>)command.execute();

    System.out.println(contactResponsePayload);*/


  //  System.out.println(contactResponsePayload);


    ContactClient contactClient=new ContactClientImpl();
    ContactListResponsePayload contacts=contactClient.getAllContacts();
    System.out.println();
    /* System.out.println(contactClient.getContactById("4840865248116736"));*/

   /* List<Property> contactProperty=new ArrayList<>();

    contactProperty.add(new Property("SYSTEM","first_name","Amit"));
    contactProperty.add(new Property("SYSTEM","last_name","Godar"));
    contactProperty.add(new Property("SYSTEM","email","amit@success.com"));

    Contact contact=new Contact();
    contact.setStarValue(10);
    contact.setLeadScore(20);
    contact.setTags(Arrays.asList("Lead","Subject"));
    contact.setProperties(contactProperty);

    Contact responseContact=contactClient.createContact(contact);
    System.out.println(responseContact);

    Thread.sleep(20000);
    responseContact.getId();

    contactClient.deleteContactId(String.valueOf(responseContact.getId()));
*/
  }
}
