package com.learning.msloan.dao.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "loans")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Loan {

    @Id
    @GeneratedValue
    private Long id;
    private Long accountId;
    @CreationTimestamp
    private LocalDate startDate;
    private String loanType;
    private BigDecimal totalLoan;
    private BigDecimal paidAmount;
    private BigDecimal outstandingAmount;
    @CreationTimestamp
    private LocalDate createdAt;




}
