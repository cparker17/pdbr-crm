package com.parker.pdbrcrm.repositories;

import com.parker.pdbrcrm.models.LeadDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadDatesRepo extends JpaRepository<LeadDates, Long> {
}
