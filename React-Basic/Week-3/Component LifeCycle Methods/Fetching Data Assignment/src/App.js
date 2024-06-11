import "./styles.css";
import React from "react";
import Image from "./components/Image";

export default class App extends React.Component {
  constructor() {
    super();
    this.state = {
      photos: [],
      loading: true // Initially set loading to true
    };
  }

  componentDidMount() {
    // Fetch images from the API
    fetch("https://jsonplaceholder.typicode.com/albums/1/photos")
      .then(response => response.json())
      .then(data => {
        this.setState({
          photos: data,
          loading: false // Set loading to false after images are fetched
        });
      })
      .catch(error => {
        console.error("Error fetching photos:", error);
        this.setState({ loading: false }); // Ensure loading is false if there's an error
      });
  }

  render() {
    return (
      <div className="App">
        {this.state.loading ? (
          <p>Loading...</p> // Display loading message while fetching images
        ) : (
          this.state.photos.map((photo) => (
            <Image key={photo.id} photo={photo} />
          ))
        )}
      </div>
    );
  }
}
