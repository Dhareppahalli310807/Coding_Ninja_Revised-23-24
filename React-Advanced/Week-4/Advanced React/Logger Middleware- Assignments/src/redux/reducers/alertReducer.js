import { createSlice } from "@reduxjs/toolkit";

const INITIAL_STATE = { message: null };

const alertSlice = createSlice({
  name: "alert",
  initialState: INITIAL_STATE,
  reducers: {
    setAlert: (state, action) => {
      state.message = action.payload;
    },
    clearAlert: (state) => {
      state.message = null;
    },
  },
});

export const alertReducer = alertSlice.reducer;
export const { setAlert, clearAlert } = alertSlice.actions;

export const alertSelector = (state) => state.alertReducer;
