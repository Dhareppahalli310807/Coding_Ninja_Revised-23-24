import { useState, useEffect, useCallback } from "react";

const useFetch = (url) => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const fetchJoke = useCallback(async () => {
    setLoading(true);
    setError(null);
    try {
      const response = await fetch(url);
      if (!response.ok) {
        throw new Error("Network response was not ok");
      }
      const jokeData = await response.json();
      setData(jokeData);
    } catch (err) {
      setError(err.message);
    }
    setLoading(false);
  }, [url]);

  useEffect(() => {
    fetchJoke();
  }, [fetchJoke]);

  return { data, loading, error, fetchJoke };
};

export default useFetch;
