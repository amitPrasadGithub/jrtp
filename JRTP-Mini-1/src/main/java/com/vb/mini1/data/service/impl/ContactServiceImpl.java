package com.vb.mini1.data.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vb.mini1.data.entity.Contact;
import com.vb.mini1.data.repository.ContactRepository;
import com.vb.mini1.data.service.ContactService;
import com.vb.mini1.rest.dto.ContactDTO;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(ContactDTO contactDTO) {
		Contact contact = new Contact();
		BeanUtils.copyProperties(contactDTO, contact);
		Contact savedContact = contactRepository.save(contact);
		
		return savedContact.getContactId() != null;
	}

	@Override
	public List<ContactDTO> getAllContacts() {
		List<Contact> contactList = contactRepository.findAll();
		return contactList.stream().map(
					(contact) -> {
						ContactDTO cdto = new ContactDTO();
						BeanUtils.copyProperties(contact, cdto);
						return cdto;
					}
				).collect(Collectors.toList());
	}

	@Override
	public ContactDTO getContactById(Integer id) {
		Optional<Contact> contact = contactRepository.findById(id);
		if(contact.isPresent()) {
			Contact contactEntity = contact.get();
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(contactEntity, contactDTO);
			return contactDTO;
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer id) {
		contactRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

}
