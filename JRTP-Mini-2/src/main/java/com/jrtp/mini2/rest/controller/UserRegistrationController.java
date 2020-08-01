package com.jrtp.mini2.rest.controller;

import com.jrtp.mini2.data.service.ContactService;
import com.jrtp.mini2.rest.dto.ContactDTO;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserRegistrationController {
    @Autowired
    private ContactService contactService;

    @GetMapping(value = {"/", "/addContact"})
    public String loadForm(Model model) {
        ContactDTO contactDTO = new ContactDTO();
        model.addAttribute("contactDTO", contactDTO);

        Map<Long, String> countryMap = contactService.getAllCountries();
        model.addAttribute("countryList", countryMap);
        return "loadForm";
    }

    @GetMapping(value = {"/validateEmail"})
    @ResponseBody
    public boolean validateEmail(@RequestParam("email") String email) {
        return contactService.findByEmail(email);
    }

    @GetMapping(value = {"/getStateList"})
    @ResponseBody
    public Map<Long, String> getStates(@RequestParam("countryId") Long countryId) {
        Map<Long, String> stateMap = contactService.getStates(countryId);
        return stateMap;
    }

    @GetMapping(value = {"/getCities"})
    @ResponseBody
    public Map<Long, String> getCities(@RequestParam("stateId") Long stateId) {
        Map<Long, String> cityMap = contactService.getCities(stateId);
        return cityMap;
    }
}
