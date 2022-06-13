package com.parker.pdbrcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogItem extends JpaRepository<LogItem, Long> {
}
