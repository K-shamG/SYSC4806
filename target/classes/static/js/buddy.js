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
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/add",
        data: {"name" : $("#name").val(), "number" :  $("#number").val()},
        dataType: 'json',
        success: function (result) {
            // if(result == "Done") {
                var newRow = '<tr><td>' + name + '</td><td>' + phoneNumber + '</td></tr>';
                $('.tg > tbody:last-child').append(newRow);
            // }
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