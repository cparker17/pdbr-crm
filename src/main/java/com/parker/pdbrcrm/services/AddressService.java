package com.parker.pdbrcrm.services;

import com.parker.pdbrcrm.exceptions.NoAddressException;
import com.parker.pdbrcrm.models.Address;
import com.parker.pdbrcrm.repositories.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.OptionalDataException;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public void createAddress(Address address) {
        addressRepo.save(address);
    }

    public Address getAddress(Long addressId) throws NoAddressException {
        Optional<Address> addressOptional = addressRepo.findById(addressId);
        if (addressOptional.isPresent()) {
            return addressOptional.get();
        } else {
            throw new NoAddressException("Address not found.");
        }
    }

    public void updateAddress(Address address) throws NoAddressException {
        Optional<Address> addressOptional = addressRepo.findById(address.getId());
        if (addressOptional.isPresent()) {
            Address newAddress = addressOptional.get();

            newAddress.setCity(address.getCity());
            newAddress.setCounty(address.getCounty());
            newAddress.setState(address.getState());
            newAddress.setStreet(address.getStreet());
            newAddress.setZip(address.getZip());

            addressRepo.save(newAddress);
        } else {
            throw new NoAddressException("Address not found.");
        }
    }

    public void deleteAddress(Long addressId) throws NoAddressException {
        Optional<Address> addressOptional = addressRepo.findById(addressId);
        if (addressOptional.isPresent()) {
            addressRepo.delete(addressOptional.get());
        } else {
            throw new NoAddressException("Address not found.");
        }
    }
}
