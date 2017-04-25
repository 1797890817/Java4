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
	for (var tmp in array) { // tmp是索引，不是元素值！
		console.info(tmp + "---" + array[tmp]);
	}

}