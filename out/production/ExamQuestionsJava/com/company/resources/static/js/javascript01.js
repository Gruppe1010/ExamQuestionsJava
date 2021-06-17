
//JavaScript01. Eriks exam like questions.



/*
---------------------------------------------
P1. Write a function with the name out, that takes one parameter and writes that parameter to the console.
*/

function out(el) {
    console.log(el);
}

/*
---------------------------------------------
P2. Write a function with the name out2, that takes any number of parameters and writes all of them to the console.
*/

function out2() {
    Array.from(arguments).forEach(word => console.log(word));
}

out2("hej", "goddag", "med", "dig");

/*
---------------------------------------------
P3. Call the out function with (4=="4")
what is written in the console

Practice som other operators.

out(4>"12");
out("4">"12");
*/

out(4 == "4"); // + true
out(4 > "12"); // + false
out("4" > "12"); // + true
out(true == 1); // + true
out(true === 1); // + false


/*
---------------------------------------------
P4. Why is 4=="4" true
What operator could you use to change it to false.
Explain
*/

/*
// + 4 == "4"  er true - fordi javascript er weakly-typed language == man den differentierer ikke på type

 */

/*
---------------------------------------------
P5. How many JavaScript data types can contain values ?
*/
// + de primitive
//

/*
---------------------------------------------
P6. Which data types in JavaScript cannot contain values ?
*/


/*
---------------------------------------------
P7.
What does this print
Explain
*/
const aa = 4 + "12";
out(typeof aa); // + string
// + fordi det bliver lavet til en string

const bb = true + "hej";
out(bb); // + truehej
// +

const cc = true + 4 + "hej";
out(cc); // + 5hej
// +

const dd = true + 4 + "hej" + true + 1;
out(dd); // + 5hejtrue1

const ee = true + 4 + "hej" + (true + 1);
out(ee); // + 5hej2


// + den translater fra venstre mod højre - så man skal indsætte parenteser hvis det er


/*
---------------------------------------------
P8. true + 1 + "25";

What do you need to put in front of "25" to get the above to return the number 27.
*/

out(true + 1 + Number("25"));


/*
---------------------------------------------
P9. Forklar forskel på const, let og var.
Forklar især forskel på scope for let og var.

+ const - block scope + kan IKKE ændre værdi
+ let - block scope + kan ændre værdi
+ var - global scope + kan ændre værdi + kan redefineres
*/

/*
---------------------------------------------
P10. Skriv en add metode der tager 2 argumenter og returnerer summen af de 2 argumenter.
*/
const addF = function add(a, b) {
    return a + b;
};

/*
---------------------------------------------
P11. Skriv en addAndSquare function, der tager 4 argumenter.
Første er ovenstående add funktion, derefter 2 parametre til add, og til sidst en square funktion.
Og returnerer udtrykket square(add(a,b)).

Hvis fex kaldes med (add,4,12,?)  så returnerer funktionen 4. (hvor ? er en funktion der tager kvadratroden).
*/
const squareF = function square(number) {
    return Math.sqrt(number);
};

function addAndSquare(addFunction, a, b, square) {
    return square(addFunction(a, b));
}

console.log(addAndSquare(addF, 4, 12, squareF));

/*
---------------------------------------------
P12. Is it possible to pass a method as an argument to a method in Java ?
*/

// TODO se Eriks svar

/*
---------------------------------------------
P13. I din html fil har du følgende tag.
<p id="demo"></p>

I din JavaScript har du følgende array.

const fruits = ["apple", "orange", "cherry", "strawberry"];
fruits.forEach(myFunction);

Skriv myFunction så den indsætter ovenstående stringe i p tag.
*/

const demo = document.getElementById('demo');

const fruits = ["apple", "orange", "cherry", "strawberry"];
fruits.forEach(myFunction);

function myFunction(fruit) {
    const currentInnerText = demo.innerText;
    if (currentInnerText == "") demo.innerText = fruit;
    else demo.innerText = currentInnerText + ", " + fruit;
}

/*
---------------------------------------------
P14. I din html har følgende

<p>Click the button to set the background color of the document to blue.</p>
<button class="btn pbSetColor">Push Me</button>
<input type="text" class="getColor" />

Skriv kode der sætter body background color til den farve der er indtastet i input felt, når der trykkes på knappen.
*/

const pbSetColor = document.querySelector('.pbSetColor');
const getColor = document.querySelector('.getColor');

pbSetColor.addEventListener('click', function(){
    document.body.style.backgroundColor = getColor.value;
});

/*
---------------------------------------------
P15. I din html har du følgende
<h1>Jeg er så klar til JavaScript1</h1>
<h1>Jeg er så klar til JavaScript2</h1>
<h1>Jeg er så klar til JavaScript3</h1>
<button class="btn pbSetH1Color">Gør H1 rød</button>

Skriv kode der farver alle 3 h1 tags baggrundsfarve til rød.
Når trykker på knappen.
*/

const pbSetH1Color = document.querySelector('.pbSetH1Color');
const h1s = document.getElementsByTagName('h1');

pbSetH1Color.addEventListener('click', function(){
    redText(h1s[0]);
    for (let i = 0; i < 3; i++) {
        h1s[i].style.backgroundColor = 'red';
    }
});

/*
---------------------------------------------
P16. Med samme html som i P15.

Skriv en funktion der farver teksten i det første h1 tag rød.
Når trykker på knappen.

*/

function redText(el){
    el.style.color = 'red';
}

/*
---------------------------------------------
P17. Med samme html som i P16.

Skriv en funktion der farver anden h1 tag blå, når escape tast bliver trykket.
*/
document.addEventListener('keydown', makeBlueWithEscape);

function makeBlueWithEscape(key){
    console.log(key);
    if(key.key == "Escape"){
        h1s[1].style.color = 'blue';
    }
}


/*
---------------------------------------------
P18.

var fruits = ["apple", "orange", "cherry", "strawberry"];

Skriv en linje kode der udskriver ovenstående array til console.
*/

console.log(fruits);
fruits.forEach(f => console.log(f));

/*
---------------------------------------------
P19. I din html har du følgende

<div class="box">
<select id="ddFruit"></select>
</div>

<button class="btn pbFillDropDown">Fill Drop Down</button>

Skriv noget kode der indsætter elementer i drop down.
Tag elementer fra fruits array i P18.

ser sådan ud:
<option value="volvo">Volvo</option>

---------------------------------------------
P20. Sæt en eventhandler på select 1 linje i drop down.

Når en linje vælges i drop down, skal linjes index skrives ud i console.
Dvs hvis apple vælges så skrives 0, hvis orange vælges så skrives 1 osv.

*/
const ddFruit = document.getElementById('ddFruit');
const pbFillDropDown = document.querySelector('.pbFillDropDown');
pbFillDropDown.addEventListener('click', fillDropdown);

function fillDropdown(){
    for (let i = 0; i < fruits.length; i++) {
        const fruit = fruits[i];

        let optionElement = document.createElement('option');

        optionElement.innerText = fruit;
        optionElement.value = fruit;
        ddFruit.appendChild(optionElement);
    }
}

ddFruit.addEventListener('click', function(){
    for (let i = 0; i < fruits.length; i++) {
        if(fruits[i] === ddFruit.value){
            console.log(i);
        }
    }
});


/*
---------------------------------------------
P21. Tilføj en knap og noget kode som clear ovenstående drop down.
* */

const body = document.querySelector('body');
const btnClear = document.createElement('button');

btnClear.innerText = 'Clear dropdown';
btnClear.addEventListener('click', clearDropdown);
body.appendChild(btnClear);

function clearDropdown(){
    ddFruit.innerText = "";
}
















