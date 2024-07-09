import { createSlice } from '@reduxjs/toolkit';

const initialState = { isRunning: false, elapsedTime: 0 };

const timerSlice = createSlice({
  name: 'timer',
  initialState,
  reducers: {
    start: (state) => { state.isRunning = true; },
    pause: (state) => { state.isRunning = false; },
    reset: (state) => { state.isRunning = false; state.elapsedTime = 0; },
    increment: (state) => { state.elapsedTime += 1; },
  }
});

export const { start, pause, reset, increment } = timerSlice.actions;
export const selectTimer = (state) => state.timer;
export default timerSlice.reducer;
