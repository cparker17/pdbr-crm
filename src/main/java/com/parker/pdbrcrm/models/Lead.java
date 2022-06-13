package com.parker.pdbrcrm.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate dateCreated;

    private LocalDate dateClosed;

    private Long customerId;

    private LeadSource leadSource;

    private String workDescription;

    private LeadType leadType;

    private BigDecimal targetBudget;

    private String jobName;

    private LeadStatus leadStatus;

    @OneToMany
    private List<LogItem> logItems;

    private BigDecimal soldPrice;
}
