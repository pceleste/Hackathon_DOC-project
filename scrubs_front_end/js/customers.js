var API_URL = 'http://localhost:8080/scrubs/api/customer';
var id;
$(document).ready(function() {
    fetchCustomers();
});



function fetchCustomers(){

// perform an ajax http get request
    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer',
        async: true,
        success: successCallback,
        error: errorCallback

});
}

    function successCallback(response) {
        console.log(response);
        populateCustomers(response);
    }
    
    function errorCallback(request, status, error) {
        alert("errocallback");
    }
    


function populateCustomers(customerData) {

    var elementStr;

    customerData.forEach(function(element) {
        elementStr =
        "<tr>" +
            "<td>" +
            element.firstName +
            "</td>" +

            "<td>" +
            element.lastName +
            "</td>" +

            "<td>" +
            element.email +
            "</td>" +

            "<td>" +
            element.phone +
            "</td>" +

            '<td><button type="button" id="edit-btn-' +
            element.id +
            '" class="edit-btn btn btn-success">edit</button></td>' +
            '<td><button type="button" id="remove-btn-' +
            element.id +
            '" class="remove-btn btn btn-danger">delete</button></td>' + "</tr>";

            $(elementStr).appendTo('#customer-body');


            $('#edit-btn-' + element.id).click(function(){
            $('#firstName').val(element.firstName), 
            $('#lastName').val(element.lastName), 
            $('#email').val(element.email), 
            $('#phone').val(element.phone)  
            id=element.id;
            });

            $('#btn-reset' + element.id).click(function(){
                $('#firstName').val(), 
                $('#lastName').val(), 
                $('#email').val(), 
                $('#phone').val()  
                id=element.id;
                });

            $('#remove-btn-' + element.id).click(function() {
                deleteUser(element.id);
             });
        });
    }
             
$(document).on("click", "#btn-update", function(){
    edit(id);
});

$(document).on("click", "#btn-add", function(){
    add();
});

function deleteUser(id) {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer/' + id ,
        type: 'DELETE',
        async: true,
        success: location.reload()
    });
}

function add() {

    $.ajax({
        url: 'http://localhost:8080/scrubs/api/customer',
        type: 'POST',
        data: JSON.stringify( { 
        firstName: $('#firstName').val(), 
        lastName: $('#lastName').val(), 
        email: $('#email').val(), 
        phone: $('#phone').val() } ),
        async: true,
        contentType: "application/json",
        success: location.reload(),
    });
}

    function edit(id) {

        $.ajax({
            url: 'http://localhost:8080/scrubs/api/customer/' + id,
            type: 'PUT',
            data: JSON.stringify( { 
                 firstName: $('#firstName').val(), 
                 lastName: $('#lastName').val(), 
                 email: $('#email').val(), 
                  phone: $('#phone').val() 
                }),
            async: true,
            contentType: "application/json",
        });
}



