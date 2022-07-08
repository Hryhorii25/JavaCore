
//В даній програмі розлянуті методи за допомою яких можна міняти розміщення елементів а також додавати і видаляти документи елементи на на сторінку
//var  $myDiv = $('<div id="my" class="page"> Hello</div>').appendTo;

//Набір методів які додають елемент на сторінку

//var  $myDiv = $('<div id="my" class="page"> SCRIPT</div>').appendTo("body");

//var  $myDiv = $('<div>SCRIPT2</div>',{id:'my','class':'page'}).appendTo("body");

//var  $myDiv = $('<div>SCRIPT3</div>').attr({id:'my','class':'page'}).appendTo("body");

//Самий швидкий спосіб

// var myDiv = document.createElement('div');
//  myDiv.id = "my";
// myDiv.className = "page";

//Вставляє елемент після вибраного елемента в даному випадку після тегу h1 вставляється тег <hr/> тобто лінія
//$("h1").after("<hr/>");

//Вставляє елемент перед вибраного елемента
//$("<hr/>").insertBefore("p");
///



//Медод працює подібно як реджекс знаходить елемент і міняє його значення
//$(".second").replaceWith("New text")

//Міняє значення усіх елементів
//$("<h2>New text</h2>").replaceAll(".inner");


//Обертає кожен знайдений елемент у новий тег
//$(".inner").wrap("<div class='new'> Text</div>");


//Обертає усі знайдений елементи у новий великий  тег
//$(".inner").wrapAll("<div class='new'> Text</div>");


//Обртає знайдений елемент у новий тег під його власного тега тобто власний тег елемента буде зверху
//$(".inner").wrapInner("<div class='new'> Text</div>");


//Клонує знайдений елемент
//$(".inner").clone().appendTo(".body");

//Видаляє елемент
//$(".inner").remove();



//Даний блок коду виводить на ектран розміження тега на сторінці
// var p =$(".first");
// var offsert = p.offset();
// p.html("left:"+ offsert.left + ",top:" + offsert.top );

//Змінює розташування тега
//$(".third").offset({top:10,left:50})




