package com.example.demo.dao;

import com.example.demo.entity.Expense;
import java.util.List;

public interface ExpenseDAO {

    void addExpense(Expense theExpensse);

    void removeExpense(int theId);

    List<Expense> getAllExpense();

    int totaExpense();
}
