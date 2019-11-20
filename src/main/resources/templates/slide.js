$(function() {
  var slide = $('#tag');
  var contents = $('#tag-slide-contents');

  //開くボタン
    var openBtn = $('#open-btn i');
    var btnOpenFlag = false;
    var openFlag = false;
    var panelSwitch = function () {
        //閉じる
        if(openFlag == true) {
            slide.stop().animate({'width' : ' 200px','height' : '200px'}, 500);
            openBtn.show(); //開くボタンにする
        }
        //開く
        else if (openFlag == false) {
            slide.stop().animate({'width' : '400px', 'height' : '200px'}, 500);
            openBtn.hide();
        }
    };

    //開くボタンクリックしたら
    $('#open-btn').click(function () {
        panelSwitch();
        openFlag = !openFlag;
        btnOpenFlag = true;
    })

    var bottomPos = $(document).height() - $(window).height() - 500;
    $(window).scroll(function () {
        if (!btnOpenFlag) {
            if ($(this).scrollTop() >= bottomPos) {
                if (openFlag == false) {
                    panelSwitch();
                    openFlag = true;
                }
            } else {
                if (openFlag) {
                    panelSwitch();
                    openFlag = false;
                }
            }
        }
    });
});
}