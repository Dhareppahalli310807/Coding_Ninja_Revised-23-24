const movie = {
    title :"the answer",
    year : 2024, //properties
    getDetails : function(){ // method /function
        console.log(`title: ${movie.title}\n year:${movie.year}`);
    },
    getMovieDetails: function(detail){
        console.log(movie[detail]);
    }
};
console.log(movie.title);
movie.getDetails();
const detail = `year`;
movie.getMovieDetails(detail);