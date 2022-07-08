function fun1() {
    var chbox;
    chbox=document.getElementById("one");//Функція яка перивіряє чи поставлений флажок на елементі
    if (chbox.checked){
        alert('Вибраний');
    }
else
    {
        alert("Не вибраний");
    }
}


function fun2() {
    var  radi = document.getElementsByName('r1'); //Функція яка проходиться по елементам radiobutton  і виводить якийсвибраний
    for (var i = 0; i < radi.length ; i++) {
        if (radi[i].checked){
            alert('Вибраний ' +i+ ' елемент');
        }

    }
    
}