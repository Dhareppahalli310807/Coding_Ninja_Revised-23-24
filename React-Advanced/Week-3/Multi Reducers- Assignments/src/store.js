const { combineReducers, createStore } = require("redux");
const { timerReducer } = require("./redux/reducers/timerReducer");
const { counterReducer } = require("./redux/reducers/counterReducer");

// Combine the reducers
const rootReducer = combineReducers({
  timer: timerReducer,
  counter: counterReducer
});

// Create the Redux store
export const store = createStore(rootReducer);
