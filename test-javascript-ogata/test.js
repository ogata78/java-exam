//1
console.log("緒方久恭");

//2
let firstName = "hisanori"
let lastName = "ogata"

console.log(firstName + " " +lastName);

//3
let price1 = 200 * 3;
let price2 = 250 * 4;

let subtotal = price1 + price2; //合計
let tax = subtotal * 0.1;//消費税
let total = subtotal + tax;

console.log("小計: " + subtotal );
console.log("消費税: " + tax );
console.log("合計: " + total );

//4
let testScore = 77;  //任意

if(testScore >=0 && testScore <= 79){
    console.log("追試です");
}else if(testScore >=80 && testScore <= 100){
    console.log("合格です");
}else{
    console.log("存在しない点数です");
}

//5
let sum = 0;

for(let i = 1; i <= 100; i++){
    sum += i;
}
console.log(sum);

//6
function add(a, b) {
    return a + b;
}


function sub(a, b) {
    return a - b;
}


function multi(a, b) {
    return a * b;
}


function div(a, b) {
    return a / b;
}


console.log(add(5, 3));
console.log(sub(5, 3));
console.log(multi(5, 3));
console.log(div(5, 3));
