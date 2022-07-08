//Зміна стилю CSS файла через jQuery
jQuery("h1").css("color","green");
$("h2").css("color","red");

//Даний запис використовується коли підключення jQuery файлу на HTML документі відбувається стандартно на початку документа
// jQuery(document).read(function () {
//     jQuery("h1").css("color","green");
//     $("h2").css("color","red");
// })

$("h3").html("New text ");//Заміна тексту в html документі





//Функція роботи з кнопками і виводом повідомлення на jQuery
$('#btn_start').click(function () {
    $("#message")
        .html("message")
        .css("background-color","green")
        .parent()
    css("blackground-color","red")
        .width(150)
        .height(80)

});

$('#reset').click(function () {
    location.reload();

});

