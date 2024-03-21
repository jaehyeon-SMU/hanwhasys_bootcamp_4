/* 01. array-distructuring-assignment-basic-syntax(배열 구조 분해 할당 문법) */
/* 구조 분해 할당을 사용해 배열이나 객체를 각각의 변수로 '분해'하여 연결(할당)할 수 있다 */

let nameArr = ['Gildong', 'hong'];
// let firstname = nameArr[0];
// let lastname = nameArr[1];

let[firstname, lastname] = nameArr;
console.log(firstname, lastname);

/* 반환 값이 배열인 메소드를 활용한 구조분해 할당 */
// let[firstname2, lastname2] = 'saimdang shin'.split(' ');
let [firstname2, lastname2] = ' saimdang shin'.match(/[a-z]+/gi);

console.log(firstname2, lastname2);

/* 구조분해 할당 시 쉼표를 활용하여 불필요한 배열 요소를 버릴 수도 있다. */
let[firstName3, lastname3] = ['firstname', 'middleName', 'lastname'];

console.log(firstName3, lastname3);

