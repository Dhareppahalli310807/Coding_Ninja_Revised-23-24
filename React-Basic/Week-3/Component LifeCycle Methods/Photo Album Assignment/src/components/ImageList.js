import React from "react";
import Image from "./Image";

export default class ImageList extends React.Component {
  shouldComponentUpdate(nextProps) {
    const currentImages = this.props.images;
    const nextImages = nextProps.images;

    if (currentImages.length !== nextImages.length) {
      return true;
    }

    for (let i = 0; i < nextImages.length; i++) {
      if (nextImages[i].trim().length < 5 || /\s/.test(nextImages[i])) {
        return false;
      }
    }

    return false;
  }

  render() {
    return (
      <div className="image-list">
        {this.props.images.map((image, index) => (
          <Image key={index} image={image} />
        ))}
      </div>
    );
  }
}
