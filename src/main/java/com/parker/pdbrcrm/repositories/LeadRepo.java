package com.parker.pdbrcrm.repositories;

import com.parker.pdbrcrm.models.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepo extends JpaRepository<Lead, Long> {
}
