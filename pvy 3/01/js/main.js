function listOfAnimals(data, start, count){
    try { 
        if(isNaN(start) || isNaN(count)) throw "Is not a number";
        if(start < 0) throw "Is less than zero, but still more than your iq!";
        if(start > data.length-1) throw "Is more than a number of animals listed!";
        if(start+count > data.length-1) throw "Please insert lower number, I can not count very well with high numbers like that"
        }
    catch(err) {
        return '<div>Error: ' + err + '</div>';
    }
    var list = [];
    for(var i = start; i < start+count; i++){
        list.push(data[i]);
    }
    return (list.length > 0) ? list : "<p>No items</p>";
}

console.log(listOfAnimals(json, 0, 10));