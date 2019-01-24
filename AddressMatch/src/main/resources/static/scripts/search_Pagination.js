/**
 * Description:分页  rows:显示条目数  page:当前第几页  count:总条目数
 */
function nextPage() {
    if (parseInt($('#rows').val()) * ((parseInt($('#page').text())) + 1) - parseInt($('#count').text()) >= parseInt($('#rows').val())) {
        layer.msg("已到最后一页", {time: 1000});
    } else {
        $('#page').text(parseInt($('#page').text()) + 1);
        queryData($('#rows').val(), $('#page').text());
    }
}

function prePage() {
    if (parseInt($('#page').text()) == 1) {
        layer.msg("已到第一页", {time: 1000});
    } else {
        $('#page').text(parseInt($('#page').text()) - 1);
        queryData($('#rows').val(), $('#page').text());
    }
}

function firstpage() {
    if (parseInt($('#page').text()) == 1) {
        layer.msg("已到第一页", {time: 1000});
    } else {
        $('#page').text(1);
        queryData($('#rows').val(), $('#page').text());
    }
}

function lastpage() {
    if (parseInt($('#rows').val()) * ((parseInt($('#page').text())) + 1) - parseInt($('#count').text()) >= parseInt($('#rows').val())) {
        layer.msg("已到最后一页", {time: 1000});
    } else {
        $('#page').text(Math.ceil(parseInt($('#count').text()) / parseInt($('#rows').val())));
        queryData($('#rows').val(), $('#page').text());
    }
}