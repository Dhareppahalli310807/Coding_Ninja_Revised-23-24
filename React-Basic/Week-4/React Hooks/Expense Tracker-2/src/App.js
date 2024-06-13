import React, { useState } from "react";
import ExpenseForm from "./components/ExpenseForm/ExpenseForm";
import ExpenseInfo from "./components/ExpenseInfo/ExpenseInfo";
import ExpenseList from "./components/ExpenseList/ExpenseList";
import "./App.css";

function App() {
  const [expenses, setExpenses] = useState([]);

  const addTransaction = (transaction) => {
    setExpenses([...expenses, transaction]);
  };

  const deleteTransaction = (id) => {
    setExpenses(expenses.filter(expense => expense.id !== id));
  };

  return (
    <>
      <h2 className="mainHeading">Expense Tracker</h2>
      <div className="App">
        <ExpenseForm onAddTransaction={addTransaction} />
        <div className="expenseContainer">
          <ExpenseInfo expenses={expenses} />
          <ExpenseList expenses={expenses} onDeleteTransaction={deleteTransaction} />
        </div>
      </div>
    </>
  );
}

export default App;
