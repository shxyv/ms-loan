package com.learning.msloan.service;

import com.learning.msloan.dao.entity.Loan;
import com.learning.msloan.dao.repository.LoanRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepository;

    public List<Loan> getLoansById(Long id) {
        return loanRepository.getLoansById(id);
    }

    public List<Loan> getLoansByAccountId(Long accountId) {
        return loanRepository.getLoanByAccountIdOrderByStartDate(accountId);
    }

}
