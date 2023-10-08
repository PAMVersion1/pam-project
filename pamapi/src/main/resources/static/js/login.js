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

// input 새로고침 후 id 입력칸에 값이 있을 시 인풋 백그라운드 색 변경
(inputId.value.length > 0) ? inputId.parentNode.style.backgroundColor = '#fff': inputId.parentNode.style.backgroundColor = '#efefef';
loginBtn.disabled = true;

// pw 값 체크(5자 이상일 시 로그인 버튼 활성화 - 색상 변경)
inputBox.forEach((item, index) => {
    let inputText = inputBox[index].firstElementChild;

    inputText.addEventListener('keyup', e => {
        const changeInputBgColor = () => {
            let inputBgColor = e.target.parentNode.style;

            if (e.target.value.length > 0) {
                inputBgColor.backgroundColor = "#D1FFF6";
                if (inputPw.value.length >= 5) {
                    loginBtn.disabled = false;
                }
            } else {
                inputBgColor.backgroundColor = '#7EF8E0';
                loginBtn.disabled = true;
            }
        }
        changeInputBgColor();
    });
});


//enter key를 눌러도 login 버튼이 작동
document.onkeyup = function (e) {
    let key = e.key;
    if (key === "Enter") goUrl();
}

