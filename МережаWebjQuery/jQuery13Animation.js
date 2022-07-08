$('.scillbar').each(function () {
    $(this).find('.scillbar-bar').animate({
        width:$(this).attr('data-percent')
    },2000);


});