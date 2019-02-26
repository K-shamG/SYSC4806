$(document).ready(function () {

    $("#form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        ajax_add();

    });

});

function ajax_add() {
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/addNew",
        data: JSON.stringify(""),
        dataType: 'json',
        success: function (data) {
            var newRow = '<tr><td>data</td></tr>';
            $('.tg > tbody:last-child').append(newRow);
        }
    });
}