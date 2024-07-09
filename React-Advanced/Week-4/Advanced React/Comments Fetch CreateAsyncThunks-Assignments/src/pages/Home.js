import { useEffect } from "react";
import { useDispatch } from "react-redux";
import { List } from "../components/List";
import { fetchComments } from "../redux/reducers/commentsReducer";

export const Home = () => {
  const dispatch = useDispatch();

  useEffect(() => {
    dispatch(fetchComments());
  }, [dispatch]);

  return (
    <div className="home">
      <h3>Internet Comments</h3>
      <List />
    </div>
  );
};
