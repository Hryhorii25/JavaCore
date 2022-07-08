$(document).ready(function () {
    $('.next').click(function () {
        var currentImage = $('.emg.curry');
        var currentImageIndex= $('.img.curry').index();
        var  nextImageIndex = currentImage +1;
        var  nextImage = $('.img').eq(nextImageIndex);
        currentImage.fadeOut(1000);
        currentImage.removeClass('curry');

        if(nextImageIndex==($('.img:last').index()+1)){
            $('.img').eq(0).fadeIn(1000)
            $('.img').eq(0).addClass('curry');
            }else{
            nextImage.fadeIn(1000);
            nextImage.addClass('curry');

        }

    });

    $('.prev').click(function () {
        var currentImage = $('.img.curry');
        var currentImageIndex= $('.img.curry').index();
        var  prevImageIndex = currentImage -1;
        var  prevImage = $('.img').eq(nextImageIndex);

        currentImage.fadeOut(1000);
currentImage.removeClass('curry');
prevImage.fadeIn(1000);
prevImage.addClass('curry')



    });

});