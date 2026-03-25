'use strict'
// 問題1
console.log('岩川奈生');

// 問題2
const firstName = 'Nao';
const lastName = 'Iwakawa';
console.log(firstName + ' ' + lastName);

// 問題3
const itemPrice200 = 200;
let count200 = 3;
const itemPrice250 = 250;
let count250 = 4;
const taxRate = 0.1;

let subTotal = itemPrice200*count200 + itemPrice250*count250;
let tax = subTotal * taxRate;
let total = subTotal + tax;

console.log('小計');
console.log(subTotal + '円');
console.log('消費税');
console.log(tax + '円');
console.log('合計金額');
console.log(total + '円');

// 問題4
let testScore = 80;
if(testScore >= 0 && testScore <= 79){
    console.log('追試です');
}else if(testScore >= 80 && testScore <= 100){
    console.log('合格です');
}else{
    console.log('存在しない点数です');
}

// 問題5
let num = 0;
for(let i = 1; i <= 100; i++){
    num += i
}
console.log(num);

// 問題6
function add(num1, num2){
    return num1 + num2;
}
function sub(num1, num2){
    return num1 - num2;
}
function multi(num1, num2){
    return num1 * num2;
}
function div(num1, num2){
    return num1 / num2;
}

let n1 = 5;
let n2 = 3;

let addResult = add(n1,n2);
let subResult = sub(n1,n2);
let multiResult = multi(n1,n2);
let divResult = div(n1,n2);

console.log(n1 + ' + ' + n2 + ' = ' + addResult);
console.log(n1 + ' - ' + n2 + ' = ' + subResult);
console.log(n1 + ' * ' + n2 + ' = ' + multiResult);
console.log(n1 + ' / ' + n2 + ' = ' + divResult);
