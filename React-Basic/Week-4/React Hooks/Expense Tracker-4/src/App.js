import { useState, useReducer } from "react";
import ExpenseForm from "./components/ExpenseForm/ExpenseForm";
import ExpenseInfo from "./components/ExpenseInfo/ExpenseInfo";
import ExpenseList from "./components/ExpenseList/ExpenseList";
import "./App.css";

const reducer = (state, action) => {
  const { payload } = action;
  switch (action.type) {
    case "ADD_EXPENSE": {
      return {
        ...state,
        expenses: [payload.expense, ...state.expenses]
      };
    }
    case "REMOVE_EXPENSE": {
      return {
        ...state,
        expenses: state.expenses.filter((expense) => expense.id !== payload.id)
      };
    }
    case "EDIT_EXPENSE": {
      return {
        ...state,
        expenses: state.expenses.map((expense) =>
          expense.id === payload.expense.id ? payload.expense : expense
        )
      };
    }
    case "SET_CURRENT_EXPENSE": {
      return {
        ...state,
        currentExpense: payload.expense
      };
    }
    default:
      return state;
  }
};

function App() {
  const [state, dispatch] = useReducer(reducer, { expenses: [], currentExpense: null });

  const addExpense = (expense) => {
    if (state.currentExpense) {
      dispatch({ type: "EDIT_EXPENSE", payload: { expense } });
    } else {
      dispatch({ type: "ADD_EXPENSE", payload: { expense } });
    }
    dispatch({ type: "SET_CURRENT_EXPENSE", payload: { expense: null } });
  };

  const deleteExpense = (id) => {
    dispatch({ type: "REMOVE_EXPENSE", payload: { id } });
  };

  const setCurrentExpense = (expense) => {
    dispatch({ type: "SET_CURRENT_EXPENSE", payload: { expense } });
  };

  return (
    <>
      <h2 className="mainHeading">Expense Tracker</h2>
      <div className="App">
        <ExpenseForm addExpense={addExpense} currentExpense={state.currentExpense} />
        <div className="expenseContainer">
          <ExpenseInfo expenses={state.expenses} />
          <ExpenseList
            expenses={state.expenses}
            deleteExpense={deleteExpense}
            setCurrentExpense={setCurrentExpense}
          />
        </div>
      </div>
    </>
  );
}

export default App;
