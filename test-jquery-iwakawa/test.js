'use strict'
$(function(){
    // 問題1
    console.log('岩川奈生');

    // 問題2
    $('#my-name-button').on('click',function(){
        $('#my-name').css('color','red');
    });

    // 問題3
    $('#age-button').on('click',function(){
        let age = $('#age').val();
        alert(age);
    });

    // 問題4
    $("#disabled-button").on('click',function(){
        $("#disabled-button").prop('disabled','ture');
    })

    // 問題5 調べる！
    $('select').on('change',function(){
        let srt = '';
        $('select option:selected').each(function(){
            str += $( this ).text() + " ";
            } );
            $( "#print" ).text( str );
        } )
        .trigger( "change" );        
    
})
