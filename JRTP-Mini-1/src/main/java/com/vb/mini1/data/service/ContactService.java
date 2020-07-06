package com.vb.mini1.data.service;

import java.util.List;

import com.vb.mini1.data.entity.Contact;
import com.vb.mini1.rest.dto.ContactDTO;

public interface ContactService {
	
	public boolean saveContact(ContactDTO contactDTO);
	public List<ContactDTO> getAllContacts();
	public ContactDTO getContactById(Integer id);
	public boolean deleteContactById(Integer id);
	public boolean updateContact(Contact contact);

}
