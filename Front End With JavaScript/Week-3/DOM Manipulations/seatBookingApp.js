//Create you project here from scratch
const moviesList = [
    { movieName: "Flash", price: 7 },
    { movieName: "Spiderman", price: 5 },
    { movieName: "Batman", price: 4 },
  ];
document.addEventListener("DOMContentLoaded", function () {
    const selectMovie = document.getElementById("selectMovie");
    const movieNameElement = document.getElementById("movieName");
    const moviePriceElement = document.getElementById("moviePrice");
    const totalPriceElement = document.getElementById("totalPrice");
    const selectedSeatsHolder = document.getElementById("selectedSeatsHolder");
    const seats = document.querySelectorAll("#seatCont .seat");
    const cancelButton = document.getElementById("cancelBtn");
    const continueButton = document.getElementById("proceedBtn");

    // Populate movie options
    moviesList.forEach(movie => {
        const option = document.createElement("option");
        option.text = movie.movieName;
        selectMovie.add(option);
    });

    // Default movie and price
    let selectedMovie = moviesList[0];
    movieNameElement.textContent = selectedMovie.movieName;
    moviePriceElement.textContent = `$ ${selectedMovie.price}`;

    // Use moviesList array for displaing the Name in the dropdown menu

    selectMovie.addEventListener("change", function () {
        selectedMovie = moviesList.find(movie => movie.movieName === this.value);
        movieNameElement.textContent = selectedMovie.movieName;
        moviePriceElement.textContent = `$ ${selectedMovie.price}`;
        updateTotalPrice();
    });

    //Add eventLister to each unoccupied seat

    seats.forEach(seat => {
        if (!seat.classList.contains("occupied")) {
            seat.addEventListener("click", function () {
                this.classList.toggle("selected");
                updateTotalPrice();
                updateSelectedSeatsHolder();
            });
        }
    });

    // Update total price based on selected seats
    function updateTotalPrice() {
        const selectedSeats = document.querySelectorAll("#seatCont .seat.selected");
        const totalPrice = selectedSeats.length * selectedMovie.price;
        totalPriceElement.textContent = `$ ${totalPrice}`;
    }

    // Update selected seats holder
    function updateSelectedSeatsHolder() {
        const selectedSeats = document.querySelectorAll("#seatCont .seat.selected");
        if (selectedSeats.length === 0) {
            selectedSeatsHolder.innerHTML = '<span class="noSelected">No Seat Selected</span>';
        } else {
            selectedSeatsHolder.textContent = '';
            selectedSeats.forEach(seat => {
                const seatNumber = seat.parentElement.children.length - Array.from(seat.parentElement.children).indexOf(seat);
                const seatElement = document.createElement("div");
                seatElement.classList.add("selectedSeat");
                seatElement.textContent = `Seat ${seatNumber}`;
                selectedSeatsHolder.appendChild(seatElement);
            });
        }
    }

    //Add eventLsiter to continue Button

    continueButton.addEventListener("click", function () {
        const selectedSeats = document.querySelectorAll("#seatCont .seat.selected");
        if (selectedSeats.length === 0) {
            alert("Oops no seat Selected");
        } else {
            alert("Yayy! Your Seats have been booked");
            selectedSeats.forEach(seat => {
                seat.classList.remove("selected");
                seat.classList.add("occupied");
            });
            totalPriceElement.textContent = "$ 0";
            updateSelectedSeatsHolder();
        }
    });

    //Add eventListerner to Cancel Button
    cancelButton.addEventListener("click", function () {
        const selectedSeats = document.querySelectorAll("#seatCont .seat.selected");
        selectedSeats.forEach(seat => {
            seat.classList.remove("selected");
        });
        totalPriceElement.textContent = "$ 0";
        updateSelectedSeatsHolder();
    });
});

