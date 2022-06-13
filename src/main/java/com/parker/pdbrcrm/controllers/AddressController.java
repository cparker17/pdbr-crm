package com.parker.pdbrcrm.controllers;

import com.parker.pdbrcrm.exceptions.NoAddressException;
import com.parker.pdbrcrm.models.Address;
import com.parker.pdbrcrm.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @RequestMapping("/create")
    public String createAddress(@ModelAttribute Address address) {
        addressService.createAddress(address);
        return "redirect:/dashboard";
    }

    @RequestMapping("/get/{addressId}")
    public String getAddress(@PathVariable Long addressId, Model model) throws NoAddressException {
        model.addAttribute("address", addressService.getAddress(addressId));
        return "address-view";
    }

    @RequestMapping("/update")
    public String updateAddress(@ModelAttribute Address address) throws NoAddressException {
        addressService.updateAddress(address);
        return "redirect:/dashboard";
    }

    @RequestMapping("/delete/{addressId}")
    public String deleteAddress(@PathVariable Long addressId) throws NoAddressException {
        addressService.deleteAddress(addressId);
        return "redirect:/dashboard";
    }
}
