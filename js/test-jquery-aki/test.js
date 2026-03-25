let myname = '安岐侑輔';
console.log(myname)

$(function(){
  $('#btn').on('click', function(){
    $('#name').css('color', 'red');
  });
});


$(function(){
  $('#btn1').on('click', function(){
    let age = $('#age').val();
    alert(age);
  });
});


$(function(){
  $('#btn2').on('click', function(){
    $(this).prop('disabled', true);
  });
});
