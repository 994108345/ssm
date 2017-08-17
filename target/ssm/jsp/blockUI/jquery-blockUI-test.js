/**
 * 遮罩所有
 */
function allPage(){
    $.blockUI();
    window.setTimeout(show,2000);
}
/**
 * 取消遮罩所有
 */
function show(){
    jQuery.unblockUI();
}
/**
 * 遮罩部分
 */
function partOfPage(){
    jQuery("#div1").block();
    window.setTimeout(unPartOfPage,2000);
}
/**
 * 取消遮罩部分
 */
function unPartOfPage(){
    jQuery("#div1").unblock();
}
/**
 * 修改遮罩文字
 */
function modifyMessage(){
    jQuery("#div2").block({ message: "可以修改遮罩文字"});
    window.setTimeout(unmodifyMessage,2000);
}
/**
 * 取消遮罩文字
 */
function unmodifyMessage(){
    jQuery("#div2").unblock();
}
/**
 * 修改遮罩样式
 */
function modifyCss(){
    jQuery('#div3').block({ css: { backgroundColor: '#f00', color: '#fff' } });
    window.setTimeout(unmodifyCss,2000);
}
/**
 * 取消修改遮罩样式
 */
function unmodifyCss(){
    jQuery('#div3').unblock();
}
/**
 * 修改遮罩文字加样式
 */
function modifyMessageAndCss(){
    jQuery('#div4').block({message:"1 ",css: { backgroundColor: '#f00', color: '#fff',height:'auto',width: 'auto'} });
    window.setTimeout(unModifyMessageAndCss,2000);
}
/**
 * 取消修改遮罩文字加样式
 */
function unModifyMessageAndCss(){
    jQuery('#div4').unblock();
}