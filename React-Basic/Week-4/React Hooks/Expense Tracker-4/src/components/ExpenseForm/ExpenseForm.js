import React, { useEffect, useRef } from "react";
import styles from "./ExpenseForm.module.css";

const ExpenseForm = ({ addExpense, currentExpense }) => {
  const expenseTextInput = useRef();
  const expenseAmountInput = useRef();

  useEffect(() => {
    if (currentExpense) {
      expenseTextInput.current.value = currentExpense.text;
      expenseAmountInput.current.value = currentExpense.amount;
    } else {
      clearInput();
    }
  }, [currentExpense]);

  const onSubmitHandler = (e) => {
    e.preventDefault();
    const expenseText = expenseTextInput.current.value;
    const expenseAmount = expenseAmountInput.current.value;
    if (parseInt(expenseAmount) === 0) {
      return;
    }

    const expense = {
      text: expenseText,
      amount: expenseAmount,
      id: currentExpense ? currentExpense.id : new Date().getTime()
    };
    addExpense(expense);
    clearInput();
  };

  const clearInput = () => {
    expenseAmountInput.current.value = "";
    expenseTextInput.current.value = "";
  };

  return (
    <form className={styles.form} onSubmit={onSubmitHandler}>
      <h3>{currentExpense ? "Edit Transaction" : "Add new transaction"}</h3>
      <label htmlFor="expenseText">Text</label>
      <input
        id="expenseText"
        className={styles.input}
        type="text"
        placeholder="Enter text..."
        ref={expenseTextInput}
        required
      />
      <div>
        <label htmlFor="expenseAmount">Amount</label>
        <div>(negative - expense, positive - income)</div>
      </div>
      <input
        className={styles.input}
        id="expenseAmount"
        type="number"
        placeholder="Enter amount..."
        ref={expenseAmountInput}
        required
      />
      <button className={styles.submitBtn}>
        {currentExpense ? "Edit Transaction" : "Add Transaction"}
      </button>
    </form>
  );
};

export default ExpenseForm;
