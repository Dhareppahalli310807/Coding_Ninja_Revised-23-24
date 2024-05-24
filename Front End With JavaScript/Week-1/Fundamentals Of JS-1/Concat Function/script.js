function concatString(str1 , str2){
    //You are provided with two strings concatenate them together, and store the concatenated string in the variable 'concat'."
    
    let concat;
    concat = str1.concat(str2);

    return concat;
}


function indexOfWorld(str1 , str2) {
    
	// Concatenate str1 and str2
    
    let concatenatedString = str1.concat(str2);

    // Find the index of "World" in the concatenated string
    let indexOfWorld = concatenatedString.indexOf("World");

    // Return the index of "World"
    return indexOfWorld;
}
