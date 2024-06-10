import { Button } from "../resuable.styled";

export default function Course({ video, onAdd, onRemove, isInBag }) {
  return (
    <div className="course">
      <img src={video.image} alt={video.title} />
      <div>
        <h3>{video.title}</h3>
        <p>{video.description}</p>
        <p>Instructor: {video.instructor}</p>
        <p>Price: ${video.price}</p>
        {isInBag ? (
          <Button bg="red" onClick={() => onRemove(video.id)}>
            Remove from Bag
          </Button>
        ) : (
          <Button bg="green" onClick={() => onAdd(video.id)}>
            Add to Bag
          </Button>
        )}
      </div>
    </div>
  );
}
