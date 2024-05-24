//Convert the temperature in farenheight
//Calculate if the temperature is above 86 or not
function temperatureInCelcius(temperatureInCelsius){
    let isHot;
    let fahrenheit = (temperatureInCelsius * 9/5) + 32;
    isHot = fahrenheit > 86;

return isHot;
    }