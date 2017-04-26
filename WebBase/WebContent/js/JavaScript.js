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
	for (var prop in myObject) { // 显示 "The property 'name' is James"，等等。
		//window.alert("The property '" + prop + "' is " + myObject[prop]);
		console.info(prop+"++++"+myObject[prop]);
	}

}