$(document).ready( function() {
    var splitImages = $('#images').val().split(",");

    var myImages = [];
    var index = 0;

    for (i = 0; i < splitImages.length; i++) {
        myImages.push(splitImages[i])
    }
    console.log(myImages);

    function getPreviousPhoto() {
        index--;
        if (index < 0) {
            index = myImages.length - 1;
        }
        $('#myImage').attr("src", myImages[index]);
    }

    function getNextPhoto() {
        index++;
        if (index > myImages.length) {
            index = 0;
        }
        $('#myImage').attr("src", myImages[index]);
    }

    $('#previous').click(function() {
        getPreviousPhoto();
    });

    $('#next').click(function() {
        getNextPhoto();
    });

    // $('li').click(function() {
    // 	var imgSrc = $('img', this).attr('src');
    // 	$('#myImage').attr("src", imgSrc);
    // });

});



