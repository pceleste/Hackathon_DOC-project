var queryString = window.location.search;
console.log(queryString);
var urlParams = new URLSearchParams(queryString);
var id = urlParams.get('id')
console.log(id);

$(document).ready(function() {
    fetchCustomerbyId();
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

    document.getElementById("name").innerHTML = response.firstName + " " + response.lastName;
    document.getElementById("idade").innerHTML = "<strong>Idade: </strong>" + response.idade;
    document.getElementById("email").innerHTML = "<strong>Email: </strong>" + response.email;
    document.getElementById("phone").innerHTML = "<strong>Phone: </strong>" + response.phone;
    document.getElementById("profissao").innerHTML = "<strong>Profissão: </strong>" + response.profissao;
    if(response.sexo == "M"){
        document.getElementById("sexo").innerHTML = "<strong>Sexo: </strong>Masculino";
    } else if(response.sexo == "F"){
        document.getElementById("sexo").innerHTML = "<strong>Sexo: </strong>Feminino";
    } else{
        document.getElementById("sexo").innerHTML = "<strong>Sexo: </strong>Sim";
    }

    
}