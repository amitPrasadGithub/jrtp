package com.vb.mini1.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vb.mini1.core.ReadProperties;
import com.vb.mini1.data.service.ContactService;
import com.vb.mini1.rest.dto.ContactDTO;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping(value = {"/", "/addContact"})
	public String handleLoadForm(Model model) {
		
		ContactDTO cdto = new ContactDTO();
		model.addAttribute("contactDTO", cdto);
		
		return "contactInfo";
	}

	
	@PostMapping(value = "/saveContact")
	public String handleSubmitAction(@ModelAttribute("contactDTO") ContactDTO contactDTO, RedirectAttributes attributes) {
		boolean isSaved = contactService.saveContact(contactDTO);
		if(isSaved) { 
			attributes.addFlashAttribute("success", ReadProperties.message.getProperty("insertSuccess"));
			return "redirect:/success";
		}
		else {
			attributes.addFlashAttribute("error", ReadProperties.message.getProperty("insertFailed"));
			return "error";
		}
	}
	
	@GetMapping(value="/viewAllContacts")
	public String handleViewAllContactsAction(Model model) {
		List<ContactDTO> list = contactService.getAllContacts();
		model.addAttribute("cdto", list);
		return "viewContacts";
	}
	
	@GetMapping(value = "/success")
	public String success(Model model) {
		return "success";
	}
	
	@GetMapping(value = "/error")
	public String error(Model model) {
		return "error";
	}
	

}
