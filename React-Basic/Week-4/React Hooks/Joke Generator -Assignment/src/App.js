import "./styles.css";
import useFetch from "./useFetch";

export default function App() {
  const url = "https://v2.jokeapi.dev/joke/Programming?type=single";
  const { data, loading, error, fetchJoke } = useFetch(url);

  if (loading) {
    return <div className="App">Loading...</div>;
  }

  if (error) {
    return <div className="App">Something went wrong...</div>;
  }

  return (
    <div className="App">
      <h1>Joke Generator</h1>
      <h2>{data?.joke}</h2>
      <button className="btn" onClick={fetchJoke}>
        New Joke
      </button>
    </div>
  );
}
