//轮播图
var li1 = document.getElementsByClassName("li1");
var box = document.getElementById("div1");


// 左右箭头显示隐藏
$("#div1").mouseenter(function () {
    $(".span_1").show();
});
$("#div1").mouseleave(function () {
    $(".span_1").hide();
});

function ban(s) {
    switch (s){
        case 1:
            box.style.backgroundImage="url('https://res.shiguangkey.com//file/201806/19/20180619142252602590185.jpg')";
            $(".li1").css({background:"blue"});
            $(".li1").eq(0).css({background:"red"});
            break;
        case 2:
            box.style.backgroundImage="url('https://res.shiguangkey.com//file/201806/19/20180619141337485823895.jpg')";
            $(".li1").css({background:"blue"});
            $(".li1").eq(1).css({background:"red"});
            break;
        case 3:
            box.style.backgroundImage="url('https://res.shiguangkey.com//file/201806/21/20180621150342030454625.jpg')";
            $(".li1").css({background:"blue"});
            $(".li1").eq(2).css({background:"red"});
            break;
        case 4:
            box.style.backgroundImage="url('https://res.shiguangkey.com//file/201805/17/20180517113424433990524.jpg')";
            $(".li1").css({background:"blue"});
            $(".li1").eq(3).css({background:"red"});
            break;

    }
}
// 自动轮播
// setInterval("first()",1000);

// 小圆框
li1[0].onclick = function () {ban(1)};
li1[1].onclick = function () {ban(2)};
li1[2].onclick = function () {ban(3)};
li1[3].onclick = function () {ban(4)};

// 左右箭头
var i = 1;
function first() {
    i++;
    if(i==5){
        i = 1;
    }
    // alert(i)
    ban(i)
}
function last() {
    i--;
    if(i==0){
        i = 4;
    }
    // alert(i)
     ban(i)
}
//老师介绍
$(".tab_box>div").hide();
$(".tab_box>div").eq(0).show();

$(".tab_menu li").click(function () {
    var index = $(this).index();
    $(".tab_box>div").eq(index).show().siblings().hide();
    $(this).addClass("change").siblings().removeClass("change");
});

