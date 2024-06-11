import React from "react";
import ImageList from "./components/ImageList";
import "./styles.css";

export default class App extends React.Component {
  constructor() {
    super();
    this.state = {
      images: [],
      imageUrl: ""
    };
  }

  componentDidMount() {
    const images = this.getImagesFromLS();
    this.setState({ images });
  }

  setImageUrl = (e) => {
    this.setState({ imageUrl: e.target.value });
  };

  addImageToLS = () => {
    localStorage.setItem(
      "images",
      JSON.stringify([...this.state.images, this.state.imageUrl])
    );
  };

  getImagesFromLS = () => {
    const images = localStorage.getItem("images");
    if (!images) {
      localStorage.setItem("images", JSON.stringify([]));
      return [];
    }
    return JSON.parse(images);
  };

  onAddImage = (e) => {
    e.preventDefault();
    const { imageUrl, images } = this.state;
    if (imageUrl.trim().length >= 5 && !/\s/.test(imageUrl)) {
      this.addImageToLS();
      this.setState({
        images: [...images, imageUrl],
        imageUrl: ""
      });
    } else {
      alert("URL must be at least 5 characters long and contain no spaces.");
    }
  };

  render() {
    return (
      <>
        <form onSubmit={this.onAddImage}>
          <input
            type="text"
            placeholder="Image URL"
            value={this.state.imageUrl}
            onChange={this.setImageUrl}
          />
          <button>Add Image</button>
        </form>
        <ImageList images={this.state.images} />
      </>
    );
  }
}
