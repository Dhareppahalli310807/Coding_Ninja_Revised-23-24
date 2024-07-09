import { configureStore } from "@reduxjs/toolkit";
import { commentsReducer } from "./redux/reducers/commentsReducer";

export const store = configureStore({
  reducer: { commentsReducer }
});
