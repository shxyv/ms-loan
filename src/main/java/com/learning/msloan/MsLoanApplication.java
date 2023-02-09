package com.learning.msloan;

import com.learning.msloan.dao.entity.Loan;
import com.learning.msloan.dao.repository.LoanRepository;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class MsLoanApplication implements CommandLineRunner {

    private final LoanRepository loanRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsLoanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Loan loan = Loan.builder()
                .loanType("CASH")
                .totalLoan(BigDecimal.valueOf(300))
                .paidAmount(BigDecimal.valueOf(120))
                .outstandingAmount(BigDecimal.valueOf(200))
                .accountId(1L)
                .build();

        Loan loan2 = Loan.builder()
                .loanType("CARD")
                .totalLoan(BigDecimal.valueOf(300))
                .paidAmount(BigDecimal.valueOf(120))
                .outstandingAmount(BigDecimal.valueOf(200))
                .accountId(1L)
                .build();

        Loan loan3 = Loan.builder()
                .loanType("CROSS")
                .totalLoan(BigDecimal.valueOf(300))
                .paidAmount(BigDecimal.valueOf(120))
                .outstandingAmount(BigDecimal.valueOf(200))
                .accountId(3L)
                .build();

        loanRepository.saveAll(List.of(loan3, loan2, loan));

    }
}
