package com.vb.mini1.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vb.mini1.data.service.ContactService;
import com.vb.mini1.rest.dto.ContactDTO;

@Controller
public class ViewAllContactsController {
	@Autowired

	private ContactService contactService;

	@GetMapping(value = "/editContact")
	public String editContact(@RequestParam("contactId") Integer contactId, Model model) {
		ContactDTO contactDTO = contactService.getContactById(contactId);
		model.addAttribute("contactDTO", contactDTO);
		return "contactInfo";
	}
	
	@GetMapping(value = "/deleteContact")
	public  String deleteContact(@RequestParam("contactId")Integer id) {
		boolean isDeleted = contactService.deleteContactById(id);
		if(isDeleted) {
			return "redirect:/viewAllContacts";
		}
		return null;
	}

}
