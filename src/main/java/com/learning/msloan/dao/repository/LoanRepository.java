package com.learning.msloan.dao.repository;

import com.learning.msloan.dao.entity.Loan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> getLoansById(Long id);

    List<Loan> getLoanByAccountIdOrderByStartDate(Long id);

}
