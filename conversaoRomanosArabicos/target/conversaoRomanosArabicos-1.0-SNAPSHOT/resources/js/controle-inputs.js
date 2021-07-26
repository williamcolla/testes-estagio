/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#romanos").prop("disabled", true);
    $("#arabicos").prop("disabled", true);



    $("#escolha").click(function () {
        if ($("#escolha").val() == 'true') {
            $("#romanos").prop("disabled", true);
            $("#arabicos").prop("disabled", false);
            $("#arabicos").val("");
        } else if ($("#escolha").val() == 'false') {
            $("#arabicos").prop("disabled", true);
            $("#romanos").prop("disabled", false);
            $("#romanos").val("");
        } else {
            $("#romanos").prop("disabled", true);
            $("#arabicos").prop("disabled", true);
            $("#arabicos").val("");
            $("#romanos").val("");
        }
    })
});




