function edit(id) {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer/' + id,
        type: 'PUT',
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
            drugs: $('#drugs').val(),
            quais: $('#quais').val(),
            cornos: $('#cornos').val(),
            alimentacao: $('#alimentacao').val()
         }),
        async: true,
        contentType: "application/json",
    });
}

var queryString = window.location.search;
console.log(queryString);
var urlParams = new URLSearchParams(queryString);
var id = urlParams.get('id')
console.log(id);

$(document).ready(function() {
    fetchCustomerbyId();
});

$(document).on("click", "#btn-edit", function(){
    edit(id);
    console.log("ESTOU AQUI")
    console.log($('#numeroPe').val())
    //window.location.assign("index.html")
});

function fetchCustomerbyId(){

    // perform an ajax http get request
        $.ajax({
            url: 'http://localhost:8080/scrubs/api/customer/'+id,
            async: true,
            success: successCallback,
            //error: errorCallback
    
    });
}

function successCallback(response){
    $('#firstName').val(response.firstName); 
    $('#lastName').val(response.lastName); 
    $('#email').val(response.email); 
    $('#phone').val(response.phone);
    $('#sexo').val(response.sexo);
    $('#profissao').val(response.profissao);
    $('#idade').val(response.idade);
    $('#numeroPe').val(response.numeroPe);
    $('#signo').val(response.signo);
    $('#patologias').val(response.patologias);
    $('#sexoSemana').val(response.sexoSemana);
    $('#parceiros').val(response.parceiros);
    $('#anal').prop("checked", true);
    $('#clitoris').val(response.clitoris);
    $('#bebidas').val(response.bebidas);
    $('#smoker').val(response.smoker);
    $('#drugs').val(response.drugs);
    $('#cornos').val(response.cornos);
    $('#alimentacao').val(response.alimentacao);
    $('#protecao').val(response.protecao);
    $('#quais').val(response.quais);


    if(response.sexoActivo == 1){
        $('#sexoActivo').prop("checked", true);
    };
    
    if(response.meds == 1){
        $('#meds_sim').prop("checked", true);
    };

    if(response.cigars == 0){
        $('#cig_1').prop("checked", true);
    } else if(response.cigars == 1){
        $('#cig_2').prop("checked", true);
    } else if(response.cigars == 2){
        $('#cig_3').prop("checked", true);
    } else if(response.cigars == 3){
        $('#cig_4').prop("checked", true);
    }
    
}