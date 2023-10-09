let inputBox = document.querySelectorAll('.input-box');

const inputId = document.getElementById('inputId'),
    inputPw = document.getElementById('inputPw'),
    loginBtn = document.getElementById('loginBtn');
const idLength = inputId.value.length;// id 값의 길이

// 버튼 비활성화/활성화
window.onload = function() {
    const target = document.getElementById('loginBtn');
    target.style.opacity = 0.5;
    target.addEventListener('click', function() {
      target.disabled = false;
    });
  };


//enter key를 눌러도 login 버튼이 작동
document.onkeyup = function (e) {
    let key = e.key;
    if (key === "Enter") goUrl();
}



