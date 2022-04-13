function edit(id) {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer/' + id,
        type: 'PUT',
        data: JSON.stringify( { 
            firstName: $('#firstName').val(), 
            lastName: $('#lastName').val(), 
            email: $('#email').val(), 
            phone: $('#phone').val(),
            sexo: $('input[name="sexo"]:checked').val(),
            profissao: $('#profissao').val(),
            idade: $('#idade').val(),
            smoker: $('input[name="smoker"]:checked').val() }),
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
    window.location.assign("index.html")
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
    $('#firstName').val(response.firstName), 
    $('#lastName').val(response.lastName), 
    $('#email').val(response.email), 
    $('#phone').val(response.phone);
    $('#sexo').val(response.sexo);
    $('#profissao').val(response.phone);
    $('#idade').val(response.idade);

    if(response.smoker == 1){
        $('#smoker_sim').prop("checked", true);
    };

    if(response.sexo == "M"){
        $('#sexo_m').prop("checked", true);
    } else if(response.sexo == "F"){
        $('#sexo_f').prop("checked", true);
    }
    
}