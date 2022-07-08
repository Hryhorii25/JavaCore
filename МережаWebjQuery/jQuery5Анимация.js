//Анімація  при кліці на блок зникає
$(".anim").click(function () {
    $(".anim").hide("show");
    
});

//Анімація2  при кліці на блок зникає
$(".anim1").click(function () {
    $(this).fadeOut("slow");
    
});

//Головний метод анімації в jQ animate він може одночасно змінювати декілька властивостей CSS елемента

 $(".anim2").animate({
     'opacity':0.5,
     'height':'50px',
     'width' :'250 px'

 });





