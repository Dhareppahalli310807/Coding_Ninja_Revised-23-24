import { Component } from "react";
import AnimeCard from "./AnimeCard"; // Ensure the correct path to AnimeCard

// Complete the AnimeList Component
class AnimeList extends Component {
  render() {
    const { anime } = this.props; // Destructure props
    return (
      <div className="anime-list">
        {/* Map the anime list received through props and pass the details to the AnimeCard component */}
        {anime.map((animeItem, index) => (
          <AnimeCard key={index} name={animeItem.name} image={animeItem.image} />
        ))}
      </div>
    );
  }
}

export default AnimeList;
