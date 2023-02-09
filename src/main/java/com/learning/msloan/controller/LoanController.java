package com.learning.msloan.controller;

import com.learning.msloan.dao.entity.Loan;
import com.learning.msloan.service.LoanService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @GetMapping("/id/{id}")
    public List<Loan> getLoansById(@PathVariable Long id) {
        return loanService.getLoansById(id);
    }

    @GetMapping("/accountId/{accountId}")
    public List<Loan> getLoansByAccountId(@PathVariable Long accountId) {
        return loanService.getLoansByAccountId(accountId);
    }

}
