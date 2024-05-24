const movie = {
    title :"the answer",
    year : 2024, //properties
    getDetails(){ // method /function
        console.log(`title: ${this.title}\n year:${this.year}`); //this can refer to property
    },
    getMovieDetails(detail){
        console.log(movie[detail]);
    }
};
console.log(movie.title);
movie.getDetails();
const detail = `year`;
movie.getMovieDetails(detail);