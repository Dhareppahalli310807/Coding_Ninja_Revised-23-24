// Problem statement
// As a child, you must have played the Pokemon card game in which two players draw cards, and the player with high experience card wins.

// You need to implement the same game using the API to get the card's data.

// Requirements:-
// 1- You are provided with the container for player 1 and player 2. Use the same for rendering data for each card.

// 2- To get the list of Pokemon You can use the following API: Link

// 3- It contains the Pokemon name and a URL to get all the details of that Pokemon.

// 4- There is a "Fight" button upon clicking, each player should be displayed with a Pokemon with its name, experience, image, and abilities.

// 5- The Pokemon selected should be random for each player.

// 6- For each player's div the name and score of the player should be displayed.

// 7- The score should increment after each fight for the player with high experience.


// Expected Output:
//Implement your code here 
// Function to fetch random Pokemon data
async function fetchRandomPokemon() {
    const response = await fetch('https://pokeapi.co/api/v2/pokemon/' + Math.floor(Math.random() * 898 + 1));
    if (!response.ok) {
        throw new Error('Failed to fetch Pokemon data');
    }
    return await response.json();
}

// Function to update player card with Pokemon data
function updatePlayerCard(player, pokemon) {
    const card = document.getElementById(`card${player}`);
    const imgDiv = card.querySelector('#img');
    const nameSpan = card.querySelector('#name');
    const experienceSpan = card.querySelector('#experience');
    const abilitiesUl = card.querySelector('#abilities');

    imgDiv.innerHTML = `<img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">`;
    nameSpan.textContent = pokemon.name;
    experienceSpan.textContent = `Experience: ${pokemon.base_experience}`;

    abilitiesUl.innerHTML = 'Abilities:';
    pokemon.abilities.forEach(ability => {
        const li = document.createElement('li');
        li.textContent = ability.ability.name;
        abilitiesUl.appendChild(li);
    });
}

// Function to handle the fight button click event
document.getElementById('fight').addEventListener('click', async function() {
    try {
        const pokemon1 = await fetchRandomPokemon();
        const pokemon2 = await fetchRandomPokemon();

        updatePlayerCard(1, pokemon1);
        updatePlayerCard(2, pokemon2);

        const player1Experience = pokemon1.base_experience;
        const player2Experience = pokemon2.base_experience;

        const p1ScoreSpan = document.getElementById('p1_score');
        const p2ScoreSpan = document.getElementById('p2_score');

        if (player1Experience > player2Experience) {
            p1ScoreSpan.textContent = parseInt(p1ScoreSpan.textContent) + 1;
        } else if (player2Experience > player1Experience) {
            p2ScoreSpan.textContent = parseInt(p2ScoreSpan.textContent) + 1;
        }
    } catch (error) {
        console.error('Error occurred:', error);
    }
});

