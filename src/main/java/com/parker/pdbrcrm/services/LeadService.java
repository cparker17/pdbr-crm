package com.parker.pdbrcrm.services;

import com.parker.pdbrcrm.exceptions.NoLeadException;
import com.parker.pdbrcrm.models.Lead;
import com.parker.pdbrcrm.models.User;
import com.parker.pdbrcrm.repositories.LeadRepo;
import com.parker.pdbrcrm.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LeadService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    LeadRepo leadRepo;

    public void createLead(Long userId, Lead lead) {
        Optional<User> userOptional = userRepo.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.addLead(lead);
            userRepo.save(user);
            leadRepo.save(lead);
        }
    }

    public Lead getLead(Long leadId) throws NoLeadException {
        Optional<Lead> leadOptional = leadRepo.findById(leadId);
        if (leadOptional.isPresent()) {
            return leadOptional.get();
        } else {
            throw new NoLeadException("Lead not found.");
        }
    }

    public void updateLead(Lead lead) {
    }

    public void deleteLead(Long leadId) {
    }
}
