var API_URL = "http://localhost:8080/scrubs/api/customer";
var id;
$(document).ready(function () {
    fetchCustomers();
});

function fetchCustomers() {
    // perform an ajax http get request
    $.ajax({
        url: "http://localhost:8080/scrubs/api/customer",
        async: true,
        success: successCallback,
        error: errorCallback,
    });
}

function successCallback(response) {
    populateCustomers(response);
}

function errorCallback(request, status, error) {
    alert("errocallback");
}

function populateCustomers(customerData) {
    var elementStr;

    customerData.forEach(function (element) {
        elementStr =
            "<tr>" +
            '<td><button type="button" id="edit-btn-' +
            element.id +
            '" class="edit-btn btn btn-primary">editar</button></td>' +
            "<td>" +
            element.firstName +
            "</td>" +
            "<td>" +
            element.lastName +
            "</td>" +
            "<td>" +
            element.email +
            "</td>" +
            '<td><button type="button" id="view-btn-' +
            element.id +
            '" class="edit-btn2 btn btn-success">Visualizar</button></td>' +
            '<td><button type="button" id="remove-btn-' +
            element.id +
            '" class="remove-btn btn btn-danger">deletar</button></td>' +
            "</tr>";

        $(elementStr).appendTo("#customer-body");

        $("#edit-btn-" + element.id).click(function () {
            window.location.assign("edit.html?id=" + element.id);
        });

        $("#view-btn-" + element.id).click(function () {
            window.location.assign("view.html?id=" + element.id);
        });

        $("#remove-btn-" + element.id).click(function () {
            deleteUser(element.id);
        });
        console.log("teste");
        console.log(customerData);
    });
}

function deleteUser(id) {
    $.ajax({
        url: "http://localhost:8080/scrubs/api/customer/" + id,
        type: "DELETE",
        async: true,
        success: location.reload(),
    });
}

