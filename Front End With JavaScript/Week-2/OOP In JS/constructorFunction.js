

function movie(title, year){
    const movieObj = {
        title:title,
        year: year,
        getDetails(){
            console.log(`
            title: ${this.title}
            year: ${this.year}
            `)
        },
    };
    return movieObj;
}
const movie1 = movie(`the avenger`, 2024);
console.log(movie1);
movie1.getDetails();

//constructor function
function Movie(title, year){
    this.title = title;
    this.year = year;
    this.getDetails = function(){
            console.log(`
            title: ${this.title}
            year: ${this.year}
            `)
        };
    }

// new keyword
const movie2 = new Movie(`avtar`, 2035);
console,log(movie2);
movie2.getDetails();