//1
$(function(){
    console.log("緒方久恭")
})

//2
$(function (){
    $("#btn").click(function(){
        $("#name").css("color", "red");
    })
})

//3
$(function(){
    $("#btn").click(function (){
        let age = $("#age").val();
        alert(age);
    })
})

//4
$(function () {
    $("#btn").click(function () {
        $(this).prop("disabled", true);
    });
});

//5
