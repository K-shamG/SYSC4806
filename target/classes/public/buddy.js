$(document).ready(function() {
    $.ajax({
        url: "https://buddy-info-kg.herokuapp.com/addNew"
    }).then(function(data) {
        var newRow = '<tr><td>data.name</td><td>data.phoneNumber</td></tr>'
        $('.tg > tbody:last-child').append(newRow);
    });
});