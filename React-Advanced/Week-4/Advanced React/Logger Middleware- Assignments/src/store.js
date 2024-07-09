import { configureStore } from "@reduxjs/toolkit";
import { timerReducer } from "./redux/reducers/timerReducer";
import { counterReducer } from "./redux/reducers/counterReducer";
import { alertReducer } from "./redux/reducers/alertReducer"; // Corrected import
import { loggerMiddleware } from "./redux/middlewares/loggerMiddleware";

export const store = configureStore({
  reducer: {
    timerReducer,
    counterReducer,
    alertReducer,
  },
  middleware: (getDefaultMiddleware) =>
    getDefaultMiddleware().concat(loggerMiddleware),
});
