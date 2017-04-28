/**
 * Demo file
 */

function testRef() {
	alert("This is test!");
}

function forIn() {
	var args = forIn.arguments.length;
	console.info("args :" + args);

	var array = [ "AA", 22, true, "BB", "CC", 36.5 ];
	for ( var tmp in array) { // tmp是索引，不是元素值！
		console.info(tmp + "---" + array[tmp]);
	}

	var myObject = new Object();
	myObject.name = "James";
	myObject.age = "22";
	myObject.phone = "555 1234";
	// 枚举（循环）对象的所有属性
	for ( var prop in myObject) { // 显示 "The property 'name' is James"，等等。
		// window.alert("The property '" + prop + "' is " + myObject[prop]);
		console.info(prop + "++++" + myObject[prop]);
	}

}

function pluginsDemo() {
	var len = navigator.plugins.length;
	with (document) {
		write("你的浏览器共支持" + len + "种外挂插件：<BR>");
		write("<TABLE BORDER=1>")
		write("<CAPTION>外挂插件清单</CAPTION>")
		write("<TR><TH> <TH>名称<TH>描述<TH>文件名")
		for (var i = 0; i < len; i++)
			write("<TR><TD>" + i + "<TD>" + navigator.plugins[i].name + "<TD>"
					+ navigator.plugins[i].description + "<TD>"
					+ navigator.plugins[i].filename);
	}
}

function screenDemo() {
	console.info("screen.width:" + screen.width + "screen.colorDepth :"
			+ screen.colorDepth)
	//if (screen.width < 800 || screen.colorDepth < 8) {
	if (screen.width <= 1440 || screen.colorDepth < 8) {
		var msg = "本网站最佳浏览模式为 1440 * 900 * 256";
		alert(msg);
	}
}

function cfm() {
	if (confirm("确定离开么?"))
		// 关闭当前窗口,下面两个方法都可以
		// window.close();
		self.close();
	else
		return false
}

window.onload = initAll;
function initAll() {
	document.getElementsByTagName("form")[0].onsubmit = function() {
		return addNode();
	}
}

function addNode() {
	var inText = document.getElementById("textArea").value;
	var newText = document.createTextNode(inText);
	var newGraf = document.createElement("p");
	newGraf.appendChild(newText);
	var docBody = document.getElementsByTagName("body")[0];
	docBody.appendChild(newGraf);

	return false; // 此处不可以省略，起到抑制默认行为的作用
}

function delNode() {
	var allGrafs = document.getElementsByTagName("p");
	if (allGrafs.length > 1) {
		var lastGraf = allGrafs.item(allGrafs.length - 1);
		var docBody = document.getElementsByTagName("body")[0];
		docBody.removeChild(lastGraf)
	}
	// return false;
}
function addContentForTexArea() {
	var allGrafs = document.getElementsByTagName("p");
	if (allGrafs.length > 1) {
		var fisrtGraf = allGrafs.item(0)
		var txtArea = fisrtGraf.childNodes[1];
		txtArea.value = "268";
	}
	// return false;
}

function insertBeforeDemo() {
	var newItem = document.createElement("LI");
	var inputText = prompt("请添加要插入的内容：","");
	var textnode = document.createTextNode(inputText);
	newItem.appendChild(textnode)

	var list = document.getElementById("List");
	list.insertBefore(newItem, list.childNodes[0]);
	return false;
}

function replaceChildDemo() {
	var newItem = document.createElement("LI");
	var inputText = prompt("请添加要替换的内容：","");
	var textnode = document.createTextNode(inputText);
	newItem.appendChild(textnode)

	var list = document.getElementById("List");
	list.replaceChild(newItem, list.childNodes[0]);
	return false;
}

function clearDemo() {
	document.write("5654154545 <br/>");
	//document.write("5654154545\r\n");
	document.clear(); // 目前不支持 2016-11-24
	document.write("****5654154545");
	document.close();
}
