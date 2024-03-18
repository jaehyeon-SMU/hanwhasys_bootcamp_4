/* 01. [[prototype]](프로토 타입 객체) */
/* 모든 객체는 프로토타입 객체에 접근할 수 있다. */

const user = {
    activate: true,
    login: function(){
        console.log('로그인 되었습니다.');
    }
};

console.log(user.__proto__ === Object.prototype);
console.log(user.__proto__===Object.prototype);
