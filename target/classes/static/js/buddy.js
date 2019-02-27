$(document).ready(function () {

    $("#form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        ajax_add();

    });

});

function ajax_add() {
    var name = $("#name").val();
    var phoneNumber = $("#phoneNumber").val();
    var data = {"name" : name, "phoneNumber" : phoneNumber};
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/add",
        data: JSON.stringify({name:name, phoneNumber:phoneNumber}),
        dataType: 'json',
        success: function (result) {
            // if(result == "Done") {
                var newRow = '<tr><td>' + result.name + '</td><td>' + result.phoneNumber + '</td></tr>';
                $('.tg > tbody:last-child').append(newRow);
            // }
            alert(result);
        },
        error : function(e) {
            alert("Error: " + e);
            //console.log("ERROR: ", e);
        }
    });

    resetForm();
}

function resetForm() {
    $("#name").val("");
    $("#phoneNumber").val("");
}