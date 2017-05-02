/**
 * jQuery Demo
 */
/*
 * function get_text() { var domObj = document.getElementById('txt');
 * alert(document.getElementById('txt').value); }
 */
function get_text() {
	var jq = $('#txt');
	alert(jq.val());
	// alert($('#txt').val());
}

// 标签选择器
function divSelect() {
	$("div").css('border', '1px solid red'); // 两个参数表示的是设置，一个参数表示是获取
	alert($("div").css('border'));
}

// ID选择器
function idSelect() {
	$("#to").html($("#from").html()); // 有参数表示是设置，无参数表示是获取
}
// Class选择器
function classSelect() {
	$(".fruit").css('color', 'red');
}

// 组合选择器
function mutiSelect() {
	$(".fruit,#tomato").css('color', 'red');
}

// 祖先后代选择器
function anceDescSelect() {
	$("div label").css('color', 'red');
}

// 父子选择器
function anceDescSelect2() {
	// $("div > label").css('color', 'red');
	$("p > label").css('color', 'red');
}
// 隔壁选择器
function geBiSelect() { // 同级的紧紧相邻的
	$("p + label").css('color', 'red');
}

// 邻居选择器
function linjuSelect() { // 同级的都可以，可以不相邻
	$("p ~ label").css('color', 'red');
}

// 过滤选择器 first -last
function firstLastSelect() { // 不区分不同的ul，只取第一个最后一个
	$('li:first').css('color', 'red');
	$('li:last').css('color', 'blue');
}
// 过滤选择器 first -last-Child
function firstLastChildSelect() { // 相对来说是一个整体，有多个ul时，都生效！
	$('li:first-child').css('color', 'red');
	$('li:last-child').css('color', 'blue');
}

// 指定下标的过滤选择器
function indexSelect() {
	$('li:eq(2)').css('color', 'red');
}
// 内容包含的过滤选择器
function containsSelect() {
	$('li:contains(to)').css('color', 'blue');
}

// has包含的过滤选择器
function hasSelect() {
	$('li:has(span)').css('color', 'blue');
}

// has包含的过滤选择器
function hiddenSelect() {
	// $('p:hidden').show();
	$('p:visible').hide();
}

// 属性选择器
function propSelect() {
	$('input[id=ipt]').val('hello');
	$('input[name=txtDemo]').val('hello*****');
}

// 表单选择器
function formSelect() {
	console.log($('#my_form :input:checked'));
}
// 表单选择器
function formSelect2() {
	console.log($('#sel :selected'));

}
