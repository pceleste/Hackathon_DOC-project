$(document).on("click", "#btn-add", function(){
    add();
});

var rollSound = new Audio("./teste.mp3");
$('#teste').click(e => rollSound.play());

function add() {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer/',
        type: 'POST',
        data: JSON.stringify( { 
            firstName: $('#firstName').val(), 
            lastName: $('#lastName').val(), 
            email: $('#email').val(), 
            phone: $('#phone').val(),
            sexo: $('input[name="sexo"]:checked').val(),
            profissao: $('#profissao').val(),
            idade: $('#idade').val(),
            smoker: $('input[name="smoker"]:checked').val() } ),
        async: true,
        contentType: "application/json",
        success: window.location.assign("index.html")
    });
}