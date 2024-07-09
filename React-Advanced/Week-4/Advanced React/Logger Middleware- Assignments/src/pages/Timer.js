import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { TimerActions } from "../components/TimerActions";
import { Time } from "../components/Time";
import { alertSelector, clearAlert } from "../redux/reducers/alertReducer"; // Corrected import

export const Timer = () => {
  const dispatch = useDispatch();
  const { message } = useSelector(alertSelector);

  useEffect(() => {
    if (message) {
      const timer = setTimeout(() => {
        dispatch(clearAlert());
      }, 2000);
      return () => clearTimeout(timer);
    }
  }, [message, dispatch]);

  return (
    <div className="page">
      {message && <div className="alert">{message}</div>}
      <h1>Simple Timer</h1>
      <Time />
      <TimerActions />
    </div>
  );
};
