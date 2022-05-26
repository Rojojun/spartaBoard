// 수정 버튼을 눌렀을 때, 기존 작성 내용을 textarea 에 전달합니다.
// 숨길 버튼을 숨기고, 나타낼 버튼을 나타냅니다.
function editPost() {
    showEdits();
    let contents = $(`1-contents`).text().trim();
    $(`1-textarea`).val(contents);
}

function showEdits() {
    $(`1-editarea`).show();
    $(`1-submit`).show();
    $(`1-delete`).show();

    $(`1-contents`).hide();
    $(`1-edit`).hide();
}

function hideEdits() {
    $(`1-editarea`).hide();
    $(`1-submit`).hide();
    $(`1-delete`).hide();

    $(`1-contents`).show();
    $(`1-edit`).show();
}