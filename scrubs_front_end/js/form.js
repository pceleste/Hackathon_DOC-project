$(document).on("click", "#btn-add", function(){
    add();
});

function add() {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer/',
        type: 'POST',
        data: JSON.stringify( { 
            firstName: $('#firstName').val(), 
            lastName: $('#lastName').val(), 
            email: $('#email').val(), 
            phone: $('#phone').val(),
            sexo: $('#sexo').val(),
            profissao: $('#profissao').val(),
            idade: $('#idade').val(),
            numeroPe: $('#numeroPe').val(),
            signo: $('#signo').val(),
            patologias: $('#patologias').val(),
            meds: $('input[name="meds"]:checked').val(),
            sexoActivo: $('input[name="sexoActivo"]:checked').val(),
            sexoSemana: $('#sexoSemana').val(),
            parceiros: $('#parceiros').val(),
            anal: $('input[name="anal"]:checked').val(),
            protecao: $('#protecao').val(),
            clitoris: $('#clitoris').val(),
            bebidas: $('#bebidas').val(),
            smoker: $('#smoker').val(),
            cigars: $('input[name="cigars"]:checked').val(),
            drugs: $('#cornos').val(),
            quais: $('#quais').val(),
            cornos: $('#cornos').val(),
            alimentacao: $('#alimentacao').val()

         } ),
        async: true,
        contentType: "application/json",
        success: console.log($('#profissao').val())//window.location.assign("index.html")
    });
}