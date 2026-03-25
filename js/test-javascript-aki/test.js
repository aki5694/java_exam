let myname = '安岐侑輔';
console.log(myname)

let firstName = 'Yusuke';
let lastName ='Aki';
console.log(firstName, lastName)

let subtotal = (200*3) + (250*4);
let tax = subtotal *0.1;
let total = subtotal + tax;
console.log('小計')
console.log(subtotal+'円')
console.log('消費税')
console.log(tax+'円')
console.log('合計金額')
console.log(total+'円')

let testScore = 80;
if (testScore >= 0 && testScore <= 79) {
    console.log("追試です");
} else if (testScore >= 80 && testScore <= 100) {
    console.log("合格です");
} else {
    console.log("存在しない点数です");
}


let sum = 0;
for (let i = 1; i <= 100; i++) {
    sum += i;
    }
    console.log(sum);



function add(a,b) {
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
console.log("5 + 3 =", add(5,3));
console.log("5 - 3 =", sub(5,3));
console.log("5 * 3 =", multi(5,3));
console.log("5 / 3 =", div(5,3));
