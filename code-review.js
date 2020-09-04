var min =  function () {
    var smallest = arguments[0];
    for(var i = 0; i< arguments.length; i++){
        if(arguments[i] < smallest){
            smallest = arguments[i];
        }
    }
    return smallest
}

var value = min(8, 900, 10, 200, 5, 80);

console.log("Printing the smallest value: " + value);git