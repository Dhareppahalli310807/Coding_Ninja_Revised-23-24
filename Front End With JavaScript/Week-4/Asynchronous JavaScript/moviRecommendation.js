// Problem statement
// Create a web app to show movie based on the genre selected by the users.

// Objective:
// For the given scaffold, using JavaScript create the option in the select to display the list of all the genres that are fetched using the mentioned API.

// Once the genre is selected and the search button is clicked it should display any random movie from the movie list of a particular genre we got through API.

// For the next button, it should be able to display another movie of the same genre.
// Note:
// You should use xhr for fetching the data from the API.
// API:

// You can use any API of your choice, it should be able to perform the given operation.

// You can use the API available on the TMDB website by following this link: link

// 1- First, create an account on TMDB and generate your own API key, which should be used for fetching the data.

// 2- To get all the genres you can use this Link API where apiKey is your API key generated by you.

// 3- To get the movie of a particular movie, you can use this Link where apiKey is your generated API key and selectedGenre is the genre in which you want the movies of.

// 4- To get the details of a particular movie, you can use the API: Link where movieId is the id for a particular movie which you can get from selecting any movie returned from the movie list of a particular genre and apiKey is your generated API key.


// Expected Output:

// Function to fetch genres from TMDB API
function fetchGenres() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://api.themoviedb.org/3/genre/movie/list?api_key=YOUR_API_KEY', true);

    xhr.onload = function() {
        if (xhr.status == 200) {
            var genres = JSON.parse(xhr.responseText).genres;
            var select = document.getElementById('genres');
            genres.forEach(function(genre) {
                var option = document.createElement('option');
                option.text = genre.name;
                option.value = genre.id;
                select.appendChild(option);
            });
        } else {
            console.error('Failed to fetch genres. Status code:', xhr.status);
        }
    };

    xhr.onerror = function() {
        console.error('Error occurred while fetching genres.');
    };

    xhr.send();
}

// Function to fetch a random movie from a selected genre
function fetchRandomMovie(genreId) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://api.themoviedb.org/3/discover/movie?api_key=YOUR_API_KEY&with_genres=' + genreId, true);

    xhr.onload = function() {
        if (xhr.status == 200) {
            var movies = JSON.parse(xhr.responseText).results;
            if (movies.length > 0) {
                var randomMovie = movies[Math.floor(Math.random() * movies.length)];
                displayMovie(randomMovie);
            } else {
                console.error('No movies found for the selected genre.');
            }
        } else {
            console.error('Failed to fetch movies. Status code:', xhr.status);
        }
    };

    xhr.onerror = function() {
        console.error('Error occurred while fetching movies.');
    };

    xhr.send();
}

// Function to display movie details
function displayMovie(movie) {
    var moviePosterDiv = document.getElementById('moviePoster');
    var movieTextDiv = document.getElementById('movieText');

    // Clear previous movie details
    moviePosterDiv.innerHTML = '';
    movieTextDiv.innerHTML = '';

    // Display movie title
    var movieTitle = document.createElement('h2');
    movieTitle.textContent = movie.title;
    movieTextDiv.appendChild(movieTitle);

    // Display movie overview
    var movieOverview = document.createElement('p');
    movieOverview.textContent = movie.overview;
    movieTextDiv.appendChild(movieOverview);

    // Display movie poster
    if (movie.poster_path) {
        var moviePoster = document.createElement('img');
        moviePoster.src = 'https://image.tmdb.org/t/p/w500' + movie.poster_path;
        moviePosterDiv.appendChild(moviePoster);
    }

    // Show like or dislike button
    var likeOrDislikeBtns = document.getElementById('likeOrDislikeBtns');
    likeOrDislikeBtns.removeAttribute('hidden');
}

// Event listener for search button
document.getElementById('playBtn').addEventListener('click', function(event) {
    event.preventDefault();
    var select = document.getElementById('genres');
    var selectedGenreId = select.value;
    fetchRandomMovie(selectedGenreId);
});

// Event listener for next button
document.getElementById('likeBtn').addEventListener('click', function(event) {
    event.preventDefault();
    var select = document.getElementById('genres');
    var selectedGenreId = select.value;
    fetchRandomMovie(selectedGenreId);
});

// Fetch genres when the page loads
window.onload = function() {
    fetchGenres();
};
