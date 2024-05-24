function coffeeMachine(coffeeType) {
    let coffeeOrder =coffeeType.toLowerCase();
    let answer;
    switch (coffeeOrder) {
    case "regular":
            answer = "$2.50";
            break;
    case "latte":
        answer = "$3.50";
        break;
    case "cappuccino":
        answer = "$4.00";
        break;
	case "espresso":
        answer = "$2.50";
        break;
    default:
        answer = "Invalid coffee type";
}
return answer;
}

